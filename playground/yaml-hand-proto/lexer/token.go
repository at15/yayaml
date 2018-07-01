package lexer

type TokenType int

type Token struct {
	tpe    TokenType
	val    string
	line   int
	offset int
}

const (
	Unknown TokenType = iota
	EOF
	INDENT
	DEDENT
)
