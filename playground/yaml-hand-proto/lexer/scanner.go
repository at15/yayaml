package lexer

import (
	"bufio"
	"bytes"
)

var eof = rune(0)

// Scanner is based on https://blog.gopheracademy.com/advent-2014/parsers-lexers/
type Scanner struct {
	raw []byte
	r   *bufio.Reader
}

func NewScanner(b []byte) *Scanner {
	return &Scanner{
		raw: b,
		r:   bufio.NewReader(bytes.NewReader(b)),
	}
}

func (s *Scanner) read() rune {
	ch, _, err := s.r.ReadRune()
	if err != nil {
		return eof
	}
	return ch
}

func (s *Scanner) unread() {
	_ = s.r.UnreadRune()
}

func (s *Scanner) Scan() Token {
	// TODO: using bufio scanner, how to get line number? check if each token has `\n`?
	ch := s.read()
}
