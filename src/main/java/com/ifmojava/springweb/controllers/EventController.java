package com.ifmojava.springweb.controllers;

import com.ifmojava.springweb.entity.Event;
import com.ifmojava.springweb.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventController {

    private EventRepository eventRepository;

    @Autowired
    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @RequestMapping(value = "/event/add", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("event", new Event()); //html: th:object="${event}" -> controller: "event"
        return "add_event";
    }

    @RequestMapping(value = "/event/add", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute Event event){
        eventRepository.save(event);
        return "add_event";
    }


}
