package academy.certif.erphrense.dto;

import java.lang.reflect.Constructor;

public class TicketRequest {
	private String person;
	private String departure;
	private String from;
	private String to;

	public TicketRequest() {}
	
	public TicketRequest(String person, String departure, String from, String to) {
		this.person = person;        
		this.departure = departure;        
		this.from = from;        
		this.to = to;    
	}
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
}
