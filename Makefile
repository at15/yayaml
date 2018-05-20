ANTLR_VERSION=4.7.1
ANTLR_JAR=./script/antlr-$(ANTLR_VERSION)-complete.jar
ANTLR=java -Xmx500M -cp $(ANTLR_JAR) org.antlr.v4.Tool
GEN_PARSER=java -cp $(ANTLR_JAR) -Xmx500M org.antlr.v4.Tool -visitor -no-listener -Werror -Xexact-output-dir

.PHONY: gen-yaml
gen-yaml:
	$(GEN_PARSER) -package org.reika.rcl.yaml $(PLAYGROUND)/yaml/YAML.g4 -o $(PLAYGROUND)/yaml

.PHONY: dep-download
dep-download:
	cd script; wget http://www.antlr.org/download/antlr-$(ANTLR_VERSION)-complete.jar
