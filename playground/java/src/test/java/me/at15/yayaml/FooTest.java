package me.at15.yayaml;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooTest {
    @Test
    @DisplayName("1st Junit 5 test!")
    public void bar() {
        assertEquals(2, 2);
    }
}
