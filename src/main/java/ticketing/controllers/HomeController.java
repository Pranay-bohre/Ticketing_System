package ticketing.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/display")
	public String displayHomePage() {
		return "home";
	}
	
	@GetMapping("/login")
	public String displayLogin() {
		return "login";
	}
	
	@GetMapping("/book")
	public String displayBookingPage() {
		return "book";
	}
	
	@GetMapping("/view")
	public String displayTickets() {
		return "view";
	}
}
