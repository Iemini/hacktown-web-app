package com.iemini.fernando.hacktown_web_app.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Event")
@Data
@NoArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String title;

    @Column(name = "start_date_time")
    private LocalDateTime startDateTime;

    @Column(name = "end_date_time")
    private LocalDateTime endDateTime;

    private String location;
    private String description;
    private EventType type;

    public Event(String title,
                 LocalDateTime startDateTime,
                 LocalDateTime endDateTime,
                 String location,
                 String description,
                 EventType type) {

        this.setTitle(title);
        this.setStartDateTime(startDateTime);
        this.setEndDateTime(endDateTime);
        this.setLocation(location);
        this.setDescription(description);
        this.setType(type);
        this.setId(null);
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        if(this.endDateTime != null) {
            if(startDateTime.isAfter(this.endDateTime)) {
                throw new DateTimeException("startDateTime is after endDateTime");
            }
        }
        this.startDateTime = startDateTime;
    }


    public void setEndDateTime(LocalDateTime endDateTime) {
        if(this.startDateTime != null) {
            if(endDateTime.isBefore(this.startDateTime)) {
                throw new DateTimeException("endDateTime is before startDateTime");
            }
        }
        this.endDateTime = endDateTime;
    }
}
