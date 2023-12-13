package com.microsservice.event.controller;

import com.microsservice.event.domain.Event;
import com.microsservice.event.dto.EventRequestDTO;
import com.microsservice.event.dto.SubscriptionRequesDTO;
import com.microsservice.event.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents(){
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingevents(){
        return eventService.getUpcomingEvents();
    }

    @PostMapping Event createEvent(@RequestBody EventRequestDTO event){
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register")
    public void registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequesDTO subscriptionRequest){
        eventService.registerParticipant(eventId, subscriptionRequest.participantEmail());
    }

}
