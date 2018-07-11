package lexer

import "bytes"

var (
	lineStart = 1
	eof       = byte(0)
	sof       = byte(1) // TODO: not sure what is the proper byte for start of file and end of file
)

// Scanner is based on https://blog.gopheracademy.com/advent-2014/parsers-lexers/
// https://github.com/benbjohnson/sql-parser
type Scanner struct {
	buf            []byte // entire file in memory
	bLen           int    // avoid calling len since the byte length never changes
	bRead          int    // bytes read
	ch             byte   // last character
	line           int    // line number
	lineOffset     int    // offset in current line
	prevLineOffset int    // previous line offset, used for unread
}

func NewScanner(b []byte) *Scanner {
	return &Scanner{
		buf:   b,
		bLen:  len(b),
		bRead: 0,
		ch:    sof,
		line:  lineStart,
	}
}

// TODO: only support ascii
func (s *Scanner) read() byte {
	if s.bRead == s.bLen {
		return eof
	}
	b := s.buf[s.bRead]
	s.bRead++
	s.ch = b
	if b == '\n' {
		s.line++
		s.prevLineOffset = s.lineOffset
		s.lineOffset = 0
	} else {
		s.prevLineOffset = s.lineOffset
		s.lineOffset++
	}
	return b
}

func (s *Scanner) unread() {
	s.bRead--
	if s.ch == '\n' {
		s.line--
		s.lineOffset = s.prevLineOffset
		s.prevLineOffset--
	} else {
		s.prevLineOffset--
		s.lineOffset--
	}
	s.ch = s.buf[s.bRead]
}

func (s *Scanner) Scan() Token {
	ch := s.read()
	if ch == eof {
		return Token{tpe: EOF, val: "", line: s.line, offset: s.lineOffset}
	}
	if ch == ':' {
		return Token{tpe: COLON, val: ":", line: s.line, offset: s.lineOffset}
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
	if isNumber(ch) {
		s.unread()
		return s.scanNumber()
	}
	return Token{tpe: UNKNOWN, val: string(ch), line: s.line, offset: s.lineOffset}
}

func (s *Scanner) scanWhitespace() Token {
	// TODO: when scanning whitespace, need to handle indent and dent
	// NOTE: use start of token as its position
	line, offset := s.line, s.lineOffset
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

// TODO: the logic for scan ws, string, number are almost identitcal, the only difference is the condition check ...
func (s *Scanner) scanString() Token {
	line, offset := s.line, s.lineOffset
	var buf bytes.Buffer
	buf.WriteByte(s.read())
	for {
		if ch := s.read(); ch == eof {
			break
			// TODO: string across line is not supported ...
		} else if isLetter(ch) {
			buf.WriteByte(ch)
		} else {
			s.unread()
			break
		}
	}
	return Token{tpe: STRING, val: buf.String(), line: line, offset: offset}
}

// TODO: decimal is not supported
func (s *Scanner) scanNumber() Token {
	line, offset := s.line, s.lineOffset
	var buf bytes.Buffer
	buf.WriteByte(s.read())
	for {
		if ch := s.read(); ch == eof {
			break
		} else if isNumber(ch) {
			buf.WriteByte(ch)
		} else {
			s.unread()
			break
		}
	}
	return Token{tpe: NUMBER, val: buf.String(), line: line, offset: offset}
}

func isWhitespace(ch byte) bool {
	return ch == ' ' || ch == '\t' || ch == '\n'
}

func isLetter(ch byte) bool {
	return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
}

func isNumber(ch byte) bool {
	return ch >= '0' && ch <= '9'
}
