package com.sample.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="ticket")
public class TicketEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ticket_id")
	private int ticketId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "created_time")
	private java.sql.Timestamp createdTmst;
	
	@OneToMany(mappedBy="emailTicket", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<EmailEntity> emails;

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

	public java.sql.Timestamp getCreatedTmst() {
		return createdTmst;
	}

	public void setCreatedTmst(java.sql.Timestamp createdTmst) {
		this.createdTmst = createdTmst;
	}

	public List<EmailEntity> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailEntity> emails) {
		this.emails = emails;
	}
	
	@Override
	public String toString(){
		
		return "Ticket Id :"+this.ticketId+"| Status :"+this.status+"| Created Time :"+this.createdTmst+
				"| Emails: "+this.emails;
	}
	
	
}
