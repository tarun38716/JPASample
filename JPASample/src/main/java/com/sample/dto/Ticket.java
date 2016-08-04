package com.sample.dto;

public class Ticket {

	private int ticketId;
	private String status;
	
	public Ticket(int ticketId, String status) {
		super();
		this.ticketId = ticketId;
		this.status = status;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString(){
		
		return "Ticket Id :"+this.ticketId+"| Status :"+this.status;
	}
	
	
}
