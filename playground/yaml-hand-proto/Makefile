PKGS = ./lexer

.PHONY: fmt test

fmt:
	gofmt -d -l -w . $(PKGS)

test:
	go test -v -cover $(PKGS)
