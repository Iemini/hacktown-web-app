package com.iemini.fernando.hacktown_web_app.dtos.Event;

public record NewEventDTO(String title,
                          String startDateTime,
                          String endDateTime,
                          String location,
                          String description,
                          String type) {

}
