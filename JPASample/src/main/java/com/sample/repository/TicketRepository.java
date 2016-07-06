package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sample.dto.TicketSummary;
import com.sample.entity.TicketEntity;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
	
	@Query("select new com.sample.dto.TicketSummary(t.ticketId, t.emails.get(1).sender,"
			+ "t.emails.get(1).to,t.createdTmst) from TicketEntity t where t.ticketId=1")
	public TicketSummary getSummary();
	
	

}
