package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {
	
	@Autowired
	private WelcomeService ws;
	
	@RequestMapping("/welcome")
	public String welcomeString() {
		return "Good morning Spring" + ws.welcomeString();
	}
	
	@RequestMapping("/")
	  public String index() {
	    return "Greetings from Spring Boot!";
	  }
}

@Component
class WelcomeService {
	public String welcomeString() {
		return "Good morning from Service";
	}
}
