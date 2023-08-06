package L5example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {

    @Test
    void shouldReturnProperContentFromFile() {
        String path = "src\\test\\resources\\fileReaderTest.txt";
        String expectedResult = "Test content";

        String result = FileUtils.readFileFromPath(path);

        Assertions.assertEquals(expectedResult, result);

    }

    @Test
    void shouldReturnNullContentFromFile() {
        String path = "src\\test\\resources\\notExistingFile.txt";
        String expectedResult1 = null;

        String result1 = FileUtils.readFileFromPath(path);

        Assertions.assertEquals(expectedResult1, result1);

    }
}