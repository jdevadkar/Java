package com.ps.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ps.service.ApplicationService;
import com.ps.service.ReleaseService;
import com.ps.service.TicketService;

/**
 * The Class TzaController.
 */
@Controller
public class TzaController {

	/** The application service. */
	private ApplicationService applicationService;

	/** The ticket service. */
	private TicketService ticketService;

	/** The release service. */
	private ReleaseService releaseService;

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
	 * Sets the release service.
	 *
	 * @param releaseService the new release service
	 */
	@Autowired
	public void setReleaseService(ReleaseService releaseService) {
		this.releaseService = releaseService;
	}

	/**
	 * Retrive applications.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/applications")
	public String retriveApplications(Model model) {
		model.addAttribute("applications", applicationService.listApplications());
		return "applications";
	}

	/**
	 * Retrive tickets.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/tickets")
	public String retriveTickets(Model model) {
		model.addAttribute("tickets", ticketService.listTickets());
		return "tickets";
	}

	/**
	 * Retrive releases.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/releases")
	public String retriveReleases(Model model) {
		model.addAttribute("releases", releaseService.listReleases());
		return "releases";
	}
}
