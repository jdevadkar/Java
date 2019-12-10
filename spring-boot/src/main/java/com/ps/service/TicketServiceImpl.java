package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.entity.Ticket;
import com.ps.repository.TicketRepository;

/**
 * The Class TicketServiceImpl.
 */
@Service
public class TicketServiceImpl implements TicketService {

	/** The ticket repository. */
	@Autowired
	private TicketRepository ticketRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ps.service.TicketService#listTickets()
	 */
	@Override
	public Iterable<Ticket> listTickets() {
		return ticketRepository.findAll();
	}
}
