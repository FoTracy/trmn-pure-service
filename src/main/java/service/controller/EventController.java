package service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

import service.domain.Event;
import service.domain.User;
import service.repository.EventRepository;
import service.repository.UserRepository;

@Controller
@RequestMapping(path="/service")
public class EventController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping(path="/user")
	public @ResponseBody User getUser(@RequestParam("id") Long id, Model model) {
		return userRepository.findOne(id);
	}
	
	@GetMapping(path="/event")
	public @ResponseBody Event getEvent(@RequestParam("id") Long id, Model model) {
		return (Event) eventRepository.findOne(id);
	}
	
	@GetMapping(path="/all_events")
	public @ResponseBody List<Event> getAllEvents(Model model) {
		return (List<Event>) eventRepository.findAll();
	}
}
