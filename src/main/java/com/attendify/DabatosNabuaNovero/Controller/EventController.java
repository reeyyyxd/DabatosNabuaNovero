package com.attendify.DabatosNabuaNovero.Controller;


import com.attendify.DabatosNabuaNovero.Entity.EventEntity;
import com.attendify.DabatosNabuaNovero.Service.EventService;
import jdk.jfr.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
@CrossOrigin
public class EventController {


    @Autowired
    EventService attendifyservice;

    @PostMapping("/createEvent")
    public EventEntity createEvent(@RequestBody EventEntity e){
        return attendifyservice.createEvent(e);
    }

    @GetMapping("/getAllEvents")
    public List<EventEntity> getAllEvents(){
        return attendifyservice.getAllEvents();
    }

    @PutMapping("/updateEvent")
    public EventEntity updateEvent(@RequestParam int id, @RequestBody EventEntity newEvent){
        return attendifyservice.updateEvent(id, newEvent);
    }

    @DeleteMapping("/deleteEvent/{id}")
    public String deleteEvent(@PathVariable int id){
        return attendifyservice.deleteEvent(id);
    }

}
