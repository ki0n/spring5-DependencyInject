package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello - Iwas Injected by the setter";
	}

}
