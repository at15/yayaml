# Hand written lexer and parser

Instead of using ANTLR to generate, we can also write the lexer and parser by hand

- https://github.com/at15/yayaml/issues/2 
- https://golang.org/pkg/text/template/parse/

Should just support a subset of YAML ...

- https://docs.saltstack.com/en/develop/topics/yaml/
  - use two space for indentation, no tab
  - [ ] we might just convert a tab to two space and try to continue ...
  
## std

````go
// Parse returns a map from template name to parse.Tree, created by parsing the
// templates described in the argument string. The top-level template will be
// given the specified name. If an error is encountered, parsing stops and an
// empty map is returned with the error.
func Parse(name, text, leftDelim, rightDelim string, funcs ...map[string]interface{}) (map[string]*Tree, error) {
	treeSet := make(map[string]*Tree)
	t := New(name)
	t.text = text
	_, err := t.Parse(text, leftDelim, rightDelim, treeSet, funcs...)
	return treeSet, err
}

// the implementation is in
// src/text/template/parse/parse.go
// src/text/template/parse/lex.go
````

## Problems

Is lexer really needed, we can build the tree without split text into token
 
- in https://blog.gopheracademy.com/advent-2014/parsers-lexers/, first scan runes into tokens, then tokens to tree
  - https://github.com/benbjohnson/sql-parser
- but in https://github.com/miloyip/json-tutorial it seems it gets node directly without parse
