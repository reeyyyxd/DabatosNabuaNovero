package com.attendify.DabatosNabuaNovero.Service;


import com.attendify.DabatosNabuaNovero.Entity.EventEntity;
import com.attendify.DabatosNabuaNovero.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class EventService {

    @Autowired
    EventRepository attendifyrepo;

    public EventEntity createEvent(EventEntity e){
            return attendifyrepo.save(e);
    }

    public List<EventEntity> getAllEvents(){
        return attendifyrepo.findAll();
    }

    @SuppressWarnings("finally")
    public EventEntity updateEvent(int id, EventEntity newDetails) {
        EventEntity e = new EventEntity();
        try {
            e = attendifyrepo.findById(id).get();

            e.setEventname(newDetails.getEventname());
            e.setDepartment(newDetails.getDepartment());
            e.setStartdate(newDetails.getStartdate());
            e.setTimestart(newDetails.getTimestart());
            e.setTimeend(newDetails.getTimeend());
        } catch (NoSuchElementException ex) {
            throw new NoSuchElementException("Event " + id + " not found");

        } finally {
            return attendifyrepo.save(e);
        }
    }


        public String deleteEvent(int id){
            if(attendifyrepo.existsById(id)){
                attendifyrepo.deleteById(id);
                return "Event " + id + " is deleted";
            }
            else{
                return "Event ID " + id + " not found";
            }

        }

    }






