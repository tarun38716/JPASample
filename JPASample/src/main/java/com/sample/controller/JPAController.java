package com.sample.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sample.entity.TicketEntity;
import com.sample.repository.TicketRepository;

@Controller
public class JPAController {

	@Autowired
	private TicketRepository ticketRepo;
	
	@RequestMapping("/entityTest")
	public String entityTest(){
		
		Logger log = LoggerFactory.getLogger(JPAController.class);
		log.info("in controller..");
		
		TicketEntity tckt = ticketRepo.findOne(1);
		log.info("Ticket Summary :"+tckt);
		
		log.info("Tiket Summary :"+ticketRepo.getSummary());
		
		
		return "test";
	}

}
