package com.iemini.fernando.hacktown_web_app.helpers;

import com.iemini.fernando.hacktown_web_app.dtos.Event.NewEventDTO;
import com.iemini.fernando.hacktown_web_app.models.Event;
import com.iemini.fernando.hacktown_web_app.models.EventType;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EventParserTest {

    @Test
    void testEventToNewEventDTO() {
        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 9, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        Event event = new Event(
                "Title",
                startDateTime,
                endDateTime,
                "location",
                "description",
                EventType.NETWORKING);

        NewEventDTO expectedNewEventDTO = new NewEventDTO(
                "Title",
                "2024-09-19 09:00",
                "2024-09-19 17:00",
                "location",
                "description",
                "NETWORKING");

        NewEventDTO parsedNewEventDTO = EventParser.eventToNewEventDTO(event);

        assertEquals(parsedNewEventDTO, expectedNewEventDTO, "Should be equal");
    }

    @Test
    void testNewEventDTOToEvent() {
        NewEventDTO newEventDTO = new NewEventDTO(
                "Title",
                "2024-09-19 09:00",
                "2024-09-19 17:00",
                "location",
                "description",
                "NETWORKING");

        LocalDateTime startDateTime = LocalDateTime.of(2024, 9, 19, 9, 0);
        LocalDateTime endDateTime = LocalDateTime.of(2024, 9, 19, 17, 0);
        Event expectedEvent = new Event(
                "Title",
                startDateTime,
                endDateTime,
                "location",
                "description",
                EventType.NETWORKING);

        Event parsedEvent = EventParser.newEventDTOToEvent(newEventDTO);

        assertEquals(parsedEvent, expectedEvent, "Should be equal");


    }
}
