package me.at15.yayaml.playground.py3;

import me.at15.yayaml.TestBase;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest implements TestBase {
    @Test
    @DisplayName("1st Junit 5 test!")
    public void foo() throws IOException {
        CharStream charStream = CharStreams.fromStream(readResourceStream("py3/foo.py"));
        Python3Lexer lexer = new Python3Lexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        Python3Parser parser = new Python3Parser(tokenStream);
        parser.file_input();
    }
}
