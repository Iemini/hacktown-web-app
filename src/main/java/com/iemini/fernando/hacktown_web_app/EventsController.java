package com.iemini.fernando.hacktown_web_app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventsController {

    @GetMapping
    public ResponseEntity<String> getEvents() {
        return ResponseEntity.ok("Get All Events =)");
    }
}
