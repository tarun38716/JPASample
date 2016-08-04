package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.dto.Ticket;
import com.sample.entity.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
	
	/*@Query("select new com.sample.dto.TicketSummary(t.ticketId, t.sender,"
			+ "t.to,t.createdTmst) from TicketEntity t where t.ticketId=1")
	public TicketSummary getSummary();
	
*/	

	@Query("select t.emailEn.sender from TicketEntity t where t.ticketId =1")
	public String getSender();
	
	@Query("select new com.sample.dto.Ticket(t.ticketId, t.status) from TicketEntity t where "
			+ "t.ticketId =1")
	public Ticket getTicket();
}
