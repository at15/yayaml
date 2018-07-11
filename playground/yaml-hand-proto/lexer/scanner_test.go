package lexer

import (
	"io/ioutil"
	"testing"

	asst "github.com/stretchr/testify/assert"
	requir "github.com/stretchr/testify/require"
)

func TestScanner_Scan(t *testing.T) {
	require := requir.New(t)
	assert := asst.New(t)
	b, err := ioutil.ReadFile("testdata/01-flat-map.yaml")
	require.Nil(err)
	assert.NotNil(b)
	s := NewScanner(b)
	for {
		token := s.Scan()
		if token.tpe == EOF {
			t.Logf("eof on line %d offset %d", token.line, token.offset)
			break
		} else {
			t.Logf("token is %s", token)
		}
	}
}
