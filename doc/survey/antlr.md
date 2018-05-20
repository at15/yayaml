# ANTLR

The main problem of using ANTLR for YAML is handling indentation

- https://github.com/at15/yayaml/issues/1
- [Python]
  - [Python3](antlr-python3.md)

## Known issues

- the ANTLR plugin in IDEA seems can't handle grammar with hard coded rules for java runtime
  - the python3 grammar work using generated file, but breaks with ANTLR IDEA plugin
- [ ] Python3-Alt says Python3 using common token is not good