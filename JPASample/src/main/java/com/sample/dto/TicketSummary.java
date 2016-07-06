package com.sample.dto;

import java.util.Date;

public class TicketSummary {

	private int ticketId;
	private String sender;
	private String to;
	private Date createdTmst;
	
	public TicketSummary(){}
	
	public TicketSummary(int ticketId, String sender, String to, Date createdTmst) {
		super();
		this.ticketId = ticketId;
		this.sender = sender;
		this.to = to;
		this.createdTmst = createdTmst;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Date getCreatedTmst() {
		return createdTmst;
	}

	public void setCreatedTmst(Date createdTmst) {
		this.createdTmst = createdTmst;
	}
	
	
	
}
