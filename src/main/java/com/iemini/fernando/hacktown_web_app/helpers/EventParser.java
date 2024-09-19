package com.iemini.fernando.hacktown_web_app.helpers;

import com.iemini.fernando.hacktown_web_app.dtos.Event.NewEventDTO;
import com.iemini.fernando.hacktown_web_app.models.Event;

public class EventParser {

    public static NewEventDTO eventToNewEventDTO(Event event) {
        return new NewEventDTO(
                event.getTitle(),
                LocalDateTimeParser.parseLocalDateTime(event.getStartDateTime()),
                LocalDateTimeParser.parseLocalDateTime(event.getEndDateTime()),
                event.getLocation(),
                event.getDescription(),
                event.getType().name()
        );
    }

    public static Event newEventDTOToEvent(NewEventDTO newEventDTO) {
        return new Event(
                newEventDTO.title(),
                LocalDateTimeParser.parseDateTimeString(newEventDTO.startDateTime()),
                LocalDateTimeParser.parseDateTimeString(newEventDTO.endDateTime()),
                newEventDTO.location(),
                newEventDTO.description(),
                EventTypeParser.parseEventTypeString(newEventDTO.type())
        );
    }


}
