package org.example;

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
        Assertions.assertTrue(actualValue >= 500);

    }

    @Test
    public void test_checkMax() throws IOException {
        // Arrange
        RESTRandomizer toTest = new RESTRandomizer();

        // Act
        int actualValue = toTest.getRandomInt();

        // Assert
        Assertions.assertTrue(actualValue <= 600);

    }
}
