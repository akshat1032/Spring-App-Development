package com.springapp.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springapp.Greeting;
import com.springapp.model.User;

@RestController
public class GreetingController {
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World!") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/greetPost")
	public Greeting greeting(@RequestBody User user) {
		return new Greeting(counter.incrementAndGet(),
				String.format(template, user.getFirstName() + " " + user.getLastName()));
	}

	@PutMapping("/putGreet/{firstName}")
	public Greeting greeting(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName) {
		return new Greeting(counter.incrementAndGet(), String.format(template, firstName + " " + lastName));
	}
}
