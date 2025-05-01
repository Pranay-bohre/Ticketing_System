package ticketing.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ticketing.models.UserRequest;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/signup")
	public String singup(@ModelAttribute UserRequest user) {
		
		return "";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password) {
		
		return "";
	}
}
