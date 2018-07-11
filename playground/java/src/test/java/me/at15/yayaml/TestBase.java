package me.at15.yayaml;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public interface TestBase {
    default InputStream readResourceStream(String path) throws IOException {
        ClassLoader classLoader = TestBase.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream(path);
        if (is == null) {
            throw new FileNotFoundException(path);
        }
        return is;
    }
}
