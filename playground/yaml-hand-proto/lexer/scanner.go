package lexer

import "bytes"

var eof = byte(0)

// Scanner is based on https://blog.gopheracademy.com/advent-2014/parsers-lexers/
type Scanner struct {
	b          []byte
	bLen       int
	bRead      int
	lastIsLine bool
	line       int
	offset     int
}

func NewScanner(b []byte) *Scanner {
	return &Scanner{
		b:          b,
		bLen:       len(b),
		bRead:      0,
		lastIsLine: false,
		line:       0,
		offset:     0,
	}
}

// TODO: for now, let's just suppose the doc is ascii ...
func (s *Scanner) read() byte {
	if s.bRead == s.bLen {
		return eof
	}
	s.bRead++
	b := s.b[s.bRead]
	// TODO: the position logic might be off by 1 ... depends on how scan take line and offset though ...
	if b == '\n' {
		s.lastIsLine = true
		s.line++
		s.offset = 0
	} else {
		s.offset++
	}
	return b
}

func (s *Scanner) unread() {
	s.bRead--
	if s.lastIsLine {
		s.line--
		// TODO: how to handle offset, if we keep previous offset, we can only unread 1 ...
	} else {
		s.offset--
	}
}

func (s *Scanner) Scan() Token {
	ch := s.read()
	if ch == eof {
		return Token{tpe: EOF, val: "", line: s.line, offset: s.offset}
	}
	if ch == ':' {
		return Token{tpe: COLON, val: ":", line: s.line, offset: s.offset}
	}
	if isWhitespace(ch) {
		s.unread()
		return s.scanWhitespace()
	}
	// TODO: need to handle quote for string ...
	if isLetter(ch) {
		s.unread()
		return s.scanString()
	}
	return Token{tpe: UNKNOWN, val: string(ch), line: s.line, offset: s.offset}
}

func (s *Scanner) scanWhitespace() Token {
	// TODO: when scanning whitespace, need to handle indent and dent
	// NOTE: use start of token as its position
	line, offset := s.line, s.offset
	var buf bytes.Buffer
	buf.WriteByte(s.read())
	for {
		if ch := s.read(); ch == eof {
			break
		} else if isWhitespace(ch) {
			buf.WriteByte(ch)
		} else {
			s.unread()
			break
		}
	}
	return Token{tpe: WS, val: buf.String(), line: line, offset: offset}
}

func (s *Scanner) scanString() Token {
	line, offset := s.line, s.offset
	var buf bytes.Buffer
	buf.WriteByte(s.read())
	for {
		if ch := s.read(); ch == eof {
			break
		} else if isLetter(ch) {
			buf.WriteByte(ch)
		} else {
			s.unread()
			break
		}
	}
	return Token{tpe: STRING, val: buf.String(), line: line, offset: offset}
}

func isWhitespace(ch byte) bool {
	return ch == ' ' || ch == '\t' || ch == '\n'
}

func isLetter(ch byte) bool {
	return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
}
