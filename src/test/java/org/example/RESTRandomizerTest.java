package org.example;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.*;

import java.io.IOException;

public class RESTRandomizerTest {

    @Test
    public void test_checkMin() throws IOException {
        // Arrange
        RESTRandomizer toTest = new RESTRandomizer();

        // Act
        int actualValue = toTest.getRandomInt();

        // Assert
        Assert.check(actualValue >= 500);
    }

    @Test
    public void test_checkMax() throws IOException {
        // Arrange
        RESTRandomizer toTest = new RESTRandomizer();

        // Act
        int actualValue = toTest.getRandomInt();

        // Assert
        Assert.check(actualValue <= 600);
    }
}
