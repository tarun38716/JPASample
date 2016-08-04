package com.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.TicketEntity;
import com.sample.repository.TicketRepository;


@Service
public class JpaServi {
	
	
	
	Logger log = LoggerFactory.getLogger(JpaServi.class);
	
	public void get(){
		
		Logger log = LoggerFactory.getLogger(JpaServi.class);
		
		//log.info("Tiket Summary :"+ticketRepo.getSummary());
		//log.info("Tiket Summary :"+ticketRepo.getSender());
		
		
	}
}
