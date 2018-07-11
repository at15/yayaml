# ANTLR

The main problem of using ANTLR for YAML is handling indentation

- https://github.com/at15/yayaml/issues/1
- [Python]
  - [Python3](antlr-python3.md)

## Known issues

- the ANTLR plugin in IDEA seems can't handle grammar with hard coded rules for java runtime
  - the python3 grammar work using generated file, but breaks with ANTLR IDEA plugin
- [ ] Python3-Alt says Python3 using common token is not good

## TODO

- [ ] how to deal with white space when they are used for indentation
- [ ] how to track indentation
- [ ] deal with top level object, i.e. the file itself is an object, but it does not have ident
  - [ ] inject at start of file and end of file (EOF)?
- [ ] what is token type of INDENT and DEDENT