package lexer

import "fmt"

type TokenType int

type Token struct {
	tpe    TokenType
	val    string
	line   int
	offset int
}

const (
	UNKNOWN TokenType = iota
	EOF
	WS
	INDENT
	DEDENT
	COLON
	STRING
)

var tokenTypes = []string{
	"UNKNOWN",
	"EOF",
	"WS",
	"INDENT",
	"DEDENT",
	"COLON",
	"STRING",
}

func (tt TokenType) String() string {
	return tokenTypes[tt]
}

func (t Token) String() string {
	return fmt.Sprintf("%s %d:%d %s", t.tpe, t.line, t.offset, t.val)
}
