package ticketing.models;

public class TicketRequest {
	private String source;
    private String destination;
    private String date;
    private String userId;
    private String ticketId;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public TicketRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketRequest(String source, String destination, String date, String userId, String ticketId) {
		super();
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.userId = userId;
		this.ticketId = ticketId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	@Override
	public String toString() {
		return "TicketRequest [source=" + source + ", destination=" + destination + ", date=" + date + ", userId="
				+ userId + ", ticketId=" + ticketId + "]";
	}
    

}
