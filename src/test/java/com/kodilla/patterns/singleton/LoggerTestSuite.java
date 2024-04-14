package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        // Given
        Logger logger = Logger.getInstance();
        String expectedLog = "Test log message";

        // When
        logger.log(expectedLog);
        String lastLog = logger.getLastLog();

        // Then
        assertEquals(expectedLog, lastLog);
    }
}