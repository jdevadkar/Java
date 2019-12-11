package com.ps.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ps.entity.Application;
import com.ps.entity.Ticket;
import com.ps.exception.ApplicationNotFoundException;
import com.ps.service.ApplicationService;
import com.ps.service.TicketService;

/**
 * The Class TzaController.
 */
@RestController
@RequestMapping("/tza")
public class TzaController {

	/** The application service. */
	private ApplicationService applicationService;

	/** The ticket service. */
	private TicketService ticketService;

	/**
	 * Sets the application service.
	 *
	 * @param applicationService the new application service
	 */
	@Autowired
	public void setApplicationService(ApplicationService applicationService) {
		this.applicationService = applicationService;
	}

	/**
	 * Sets the ticket service.
	 *
	 * @param ticketService the new ticket service
	 */
	@Autowired
	public void setTicketService(TicketService ticketService) {
		this.ticketService = ticketService;
	}

	/**
	 * Retrive applications.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/applications")
	public ResponseEntity<List<Application>> getAllApplications() {
		List<Application> list = (List<Application>) applicationService.listApplications();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	/**
	 * Retrive tickets.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/tickets")
	public ResponseEntity<List<Ticket>> getAllTickets() {
		List<Ticket> list = (List<Ticket>) ticketService.listTickets();
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	/**
	 * Gets the application.
	 *
	 * @param id the id
	 * @return the application
	 */
	@GetMapping("/application/{id}")
	public ResponseEntity<Application> getApplication(@PathVariable("id") Integer id) {
		try {
			return new ResponseEntity<>(applicationService.findApplication(id), HttpStatus.OK);
		} catch (ApplicationNotFoundException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Application not found");
		}
	}
}
