package ticketing.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ticketing.dao.TicketDao;
import ticketing.dao.TicketDaoImpl;
import ticketing.entities.Ticket;
import ticketing.models.TicketRequest;

@Service
public class TicketServiceImpl implements TicketService{

	@Autowired
	private TicketDaoImpl ticketDao;
	
	@Override
	public int bookTicket(TicketRequest ticketRequest) {
		Ticket ticket = new Ticket();
		ticket.setSource(ticketRequest.getSource());
		ticket.setDestination(ticketRequest.getDestination());
		ticket.setUserId(ticketRequest.getUserId());
		ticket.setBookingDate(ticketRequest.getDate());
		ticket.setTicketId(ticketRequest.getTicketId());
		System.out.println(ticketRequest.toString());
		System.out.println(ticket.toString());
		return ticketDao.save(ticket);
	}

	@Override
	public List<List<String>> viewTickets(String userId) {
		List<Ticket> tickets = ticketDao.fetch(userId);
		System.out.println(tickets);
		
		List<List<String>> ticketList = new ArrayList<>();
		
		for(Ticket ticket : tickets) {
			List<String> singleTicket = new ArrayList<String>();
			singleTicket.add(ticket.getSource());
			singleTicket.add(ticket.getDestination());
			singleTicket.add(ticket.getBookingDate());
			ticketList.add(singleTicket);
		}
		
		System.out.println(ticketList);
		
		return ticketList;
	}

}
