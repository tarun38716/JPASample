package com.sample.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="email")
public class EmailEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name= "mail_id")
	private int mailId;
	
	@Column(name= "t_id")
	private int tId;
	
	@Column(name= "sender")
	private String sender;
	
	@Column(name= "email_to")
	private String to;
	
	
	@ManyToOne
	@JoinColumn(name = "t_id", referencedColumnName = "ticket_id", nullable = false, insertable= false, updatable = false)
	private TicketEntity emailTicket;


	public int getMailId() {
		return mailId;
	}


	public void setMailId(int mailId) {
		this.mailId = mailId;
	}


	public int gettId() {
		return tId;
	}


	public void settId(int tId) {
		this.tId = tId;
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


	public TicketEntity getEmailTicket() {
		return emailTicket;
	}


	public void setEmailTicket(TicketEntity emailTicket) {
		this.emailTicket = emailTicket;
	}
	
	@Override
	public String toString(){
		
		return "Email Id :"+this.mailId+"| Ticket Id :"+this.tId+
				"| Send By :"+this.sender+"| Send To: "+this.to;
				
	}
	
	
}
