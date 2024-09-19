package com.iemini.fernando.hacktown_web_app.helpers;

import com.iemini.fernando.hacktown_web_app.models.EventType;

public class EventTypeParser {

    public static EventType parseEventTypeString(String eventTypeString) {
        return EventType.valueOf(eventTypeString);
    }
}
