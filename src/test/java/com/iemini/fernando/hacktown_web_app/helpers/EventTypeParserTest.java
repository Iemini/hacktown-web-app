package com.iemini.fernando.hacktown_web_app.helpers;

import com.iemini.fernando.hacktown_web_app.models.EventType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EventTypeParserTest {
    @Test
    void testParseEventTypeStringShouldPass() {
        String eventTypeStr = "NETWORKING";
        EventType expectedEventType = EventType.NETWORKING;
        EventType parsedEventType = EventTypeParser.parseEventTypeString(eventTypeStr);

        assertEquals(parsedEventType, expectedEventType, "Should be equal");
    }

    @Test
    void testParseEventTypeStringShouldThrowException() {
        String eventTypeStr = "Networking";
        assertThrows(IllegalArgumentException.class, () -> {
            EventTypeParser.parseEventTypeString(eventTypeStr);}, "Should throw IllegalArgumentException");
    }
}
