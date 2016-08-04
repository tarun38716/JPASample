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
import javax.persistence.Transient;

@Entity
@Table(name ="ticket")
public class TicketEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	
	private int ticketId;
	private String status;
	private java.sql.Timestamp createdTmst;
	private List<EmailEntity> emails;
	private EmailEntity emailEn;
	

	@Id
	@Column(name = "ticket_id")
	public int getTicketId() {
		return ticketId;
	}



	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}


	@Column(name = "status")
	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}


	@Column(name = "created_time")
	public java.sql.Timestamp getCreatedTmst() {
		return createdTmst;
	}



	public void setCreatedTmst(java.sql.Timestamp createdTmst) {
		this.createdTmst = createdTmst;
	}


	@OneToMany(mappedBy="emailTicket", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	public List<EmailEntity> getEmails() {
		return emails;
	}



	public void setEmails(List<EmailEntity> emails) {
		this.emails = emails;
	}

	

	@Transient
	public EmailEntity getEmailEn() {
		return emails.get(0);
	}



	public void setEmailEn(EmailEntity emailEn) {
		this.emailEn = emailEn;
	}



	@Override
	public String toString(){
		
		return "Ticket Id :"+this.ticketId+"| Status :"+this.status+"| Created Time :"+this.createdTmst+
				"| Emails: "+this.emails;
	}
	
	
}
