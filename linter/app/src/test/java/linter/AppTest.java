/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void noErrorTester(){
        Path filePath = Paths.get("app/src/main/resources/empty.js");
        assertEquals("", App.Scaner(filePath),"it should return empty string");
    }
}