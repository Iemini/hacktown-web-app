package com.iemini.fernando.hacktown_web_app.models;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventTest {

    @BeforeAll
    static void instantiateEventTestObjectUsingNoArgsConstructor() {
        Event event = new Event();
    }

    @Test
    void testSetStartDateTimeShouldNotThrowException() {
        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 9, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,9, 19, 17, 0);

        Event event = new Event();
        event.setEndDateTime(endDateTime);

        assertDoesNotThrow(() -> {event.setStartDateTime(startDateTime);}, "Should not throw exception");
    }

    @Test
    void testSetStartDateTimeShouldThrowException() {
        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,9, 19, 9, 0);

        Event event = new Event();
        event.setEndDateTime(endDateTime);

        assertThrows(DateTimeException.class, () -> {event.setStartDateTime(startDateTime);}, "Should throw DateTime exception");
    }

    @Test
    void testSetEndDateTimeShouldNotThrowException() {
        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 9, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,9, 19, 17, 0);

        Event event = new Event();
        event.setStartDateTime(startDateTime);

        assertDoesNotThrow(() -> {event.setEndDateTime(startDateTime);}, "Should not throw exception");
    }

    @Test
    void testSetEndDateTimeShouldThrowException() {
        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,9, 19, 9, 0);

        Event event = new Event();
        event.setStartDateTime(startDateTime);

        assertThrows(DateTimeException.class, () -> {event.setEndDateTime(endDateTime);}, "Should throw DateTime exception");
    }

}
