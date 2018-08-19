package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return "Hello - Primary Greeting service";
	}

	@Override
	public String getSpanishGreeting() {
		// TODO Auto-generated method stub
		return "Servicio de dalud Primario";
	}

	@Override
	public String getGermanGreeting() {
		// TODO Auto-generated method stub
		return "Primärer Abflug-Service";
	}

}
