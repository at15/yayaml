# Hand written lexer and parser

Instead of using ANTLR to generate, we can also write the lexer and parser by hand

- https://github.com/at15/yayaml/issues/2 
- https://golang.org/pkg/text/template/parse/

Should just support a subset of YAML ...

- https://docs.saltstack.com/en/develop/topics/yaml/
  - use two space for indentation, no tab
  - [ ] we might just convert a tab to two space and try to continue ...