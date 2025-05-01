package ticketing.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
//	@GetMapping("/fetchTickets")
//	public List<List<String>> fetchTickets(@RequestParam("userId") String userId) {
//	    System.out.println("Here in FetchTickets");
//	    System.out.println(userId);
//	    List<List<String>> tickets = ticketService.viewTickets(userId);
//	    return tickets;
//	}

	
	@GetMapping("/fetchTickets")
	public ModelAndView fetchTickets(@RequestParam("userId") String userId) {
		System.out.println("Here in FetchTickets");
		System.out.println(userId);
		List<List<String>> tickets =  ticketService.viewTickets(userId);
		
		ModelAndView mav = new ModelAndView("view"); // ticketView.jsp or ticketView.html
	    mav.addObject("tickets", tickets);
	    mav.addObject("userId", userId);
		return mav;
	}
}