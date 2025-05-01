package ticketing.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ticketing.entities.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao{
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Ticket ticket) {
		String query = "Insert into ticketing_ticket_table (ticketId, userId, source, destination, bookingDate) VALUES (?, ?, ?, ?, ?)";
		return jdbcTemplate.update(query, ticket.getTicketId(), ticket.getUserId(), ticket.getSource(), ticket.getDestination(), ticket.getBookingDate());
	}

	@Override
	public List<Ticket> fetch(String userId) {
		// TODO Auto-generated method stub
		String query = "Select * from ticketing_ticket_table where userId = (?)";
		return jdbcTemplate.query(query, (rs, rowNum) -> {
	        Ticket ticket = new Ticket();
	        ticket.setTicketId(rs.getString("ticketId"));
	        ticket.setSource(rs.getString("source"));
	        ticket.setDestination(rs.getString("destination"));
	        ticket.setBookingDate(rs.getString("bookingDate"));
	        ticket.setUserId(rs.getString("userId"));
	        return ticket;
	    }, userId);
	}

}
