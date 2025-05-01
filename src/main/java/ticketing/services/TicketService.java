package ticketing.services;

import java.util.List;

import ticketing.entities.Ticket;
import ticketing.models.TicketRequest;

public interface TicketService {
	public int bookTicket(TicketRequest ticketRequest);
	
	public List<List<String>> viewTickets(String userId);
}
