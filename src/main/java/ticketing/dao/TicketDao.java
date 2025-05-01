package ticketing.dao;

import java.util.List;

import ticketing.entities.Ticket;

public interface TicketDao {
	public int save(Ticket ticket);
	
	public List<Ticket> fetch(String userId);
}
