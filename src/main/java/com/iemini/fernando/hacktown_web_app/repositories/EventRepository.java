package com.iemini.fernando.hacktown_web_app.repositories;

import com.iemini.fernando.hacktown_web_app.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
