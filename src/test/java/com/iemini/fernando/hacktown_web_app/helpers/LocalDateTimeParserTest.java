package com.iemini.fernando.hacktown_web_app.helpers;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LocalDateTimeParserTest {
    @Test
    void testParseDateTimeStringShouldPass() {
        String dateTimeStr = "2024-09-19 17:00";
        LocalDateTime expectedLocalDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        LocalDateTime parsedLocalDateTime = LocalDateTimeParser.parseDateTimeString(dateTimeStr);

        assertEquals(parsedLocalDateTime, expectedLocalDateTime, "Should be equal");
    }

    @Test
    void testParseDateTimeStringShouldThrowException() {
        String dateTimeStr = "202409191700";

        assertThrows(DateTimeException.class, () -> {
            LocalDateTimeParser.parseDateTimeString(dateTimeStr);}, "Should Throw DateTimeException");
    }

    @Test
    void testParseLocalDateTimeShouldPass() {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        String expectedString = "2024-09-19 17:00";
        String parsedString = LocalDateTimeParser.parseLocalDateTime(localDateTime);

        assertEquals(parsedString, expectedString, "Should be equal");
    }
}
