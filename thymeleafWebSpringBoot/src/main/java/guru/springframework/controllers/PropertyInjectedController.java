package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {

	@Autowired
	@Qualifier("greetingServiceImpl")
	public GreetingServiceImpl greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}
}
