package com.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sample.entity.TicketEntity;

@Service ("jpaService")
public class JPAService {
	
	Logger log = LoggerFactory.getLogger(JPAService.class);
	
	public TicketEntity get(){
		
		log.info("in service..");
		return null;
	}

}
