package ticketing.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ticketing_ticket_table")
public class Ticket {
	@Id
	@Column
	private String ticketId;
	
	@Column
	private String userId;
	
	@Column
	private String source;
	
	@Column
	private String destination;
	
	@Column 
	private String bookingDate;
	

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", userId=" + userId + ", source=" + source + ", destination="
				+ destination + ", bookingDate=" + bookingDate + "]";
	}

	public Ticket(String ticketId, String userId, String source, String destination, String bookingDate) {
		super();
		this.ticketId = ticketId;
		this.userId = userId;
		this.source = source;
		this.destination = destination;
		this.bookingDate = bookingDate;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
}
