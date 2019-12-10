package com.ps.service;

import com.ps.entity.Ticket;

/**
 * The Interface TicketService.
 */
public interface TicketService {

	/**
	 * List tickets.
	 *
	 * @return the iterable
	 */
	Iterable<Ticket> listTickets();
}
