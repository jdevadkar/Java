package com.ps.repository;

import org.springframework.data.repository.CrudRepository;

import com.ps.entity.Ticket;

/**
 * The Interface TicketRepository.
 */
public interface TicketRepository extends CrudRepository<Ticket, Integer> {

}
