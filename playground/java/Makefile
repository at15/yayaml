ANTLR_VERSION=4.7.1
ANTLR_JAR=./script/antlr-$(ANTLR_VERSION)-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GEN_PARSER=java -cp $(ANTLR_JAR) -Xmx500M org.antlr.v4.Tool -visitor -no-listener -Werror -Xexact-output-dir
PKG=src/main/java/me/at15/yayaml
PKGP=$(PKG)/parser
PLAY=src/main/java/me/at15/yayaml/playground

.PHONY: gen-parser
gen-parser:
	$(GEN_PARSER) -package me.at15.yayaml.parser $(PKGP)/YAML.g4 -o $(PKGP)

.PHONY: gen-py3
gen-py3:
	$(GEN_PARSER) -package me.at15.yayaml.playground.py3 $(PLAY)/py3/Python3.g4 -o $(PLAY)/py3

.PHONY: dep-download
dep-download:
	cd script; wget http://www.antlr.org/download/antlr-$(ANTLR_VERSION)-complete.jar
