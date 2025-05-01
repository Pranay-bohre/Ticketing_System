package ticketing.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import ticketing.models.TicketRequest;
import ticketing.services.TicketServiceImpl;

@RestController
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketServiceImpl ticketService;
	
	@PostMapping("/bookTicket")
	public String createTicket(@ModelAttribute TicketRequest ticketRequest) {
		System.out.println(ticketRequest);
		System.out.println("here");
		ticketService.bookTicket(ticketRequest);
		return "";
	}
	
	@GetMapping("/fetchTickets")
	public ModelAndView fetchTickets(String userId) {
		ticketService.viewTickets(userId);
		
		return new ModelAndView();
	}
}