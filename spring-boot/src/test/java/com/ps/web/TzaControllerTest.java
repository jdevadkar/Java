package com.ps.web;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;

import com.ps.service.ApplicationService;
import com.ps.service.ReleaseService;
import com.ps.service.TicketService;

/**
 * The Class TzaControllerTest.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(TzaController.class)
class TzaControllerTest {

	/** The mock mvc. */
	@Autowired
	private MockMvc mockMvc;

	/** The application service. */
	@MockBean
	ApplicationService applicationService;

	/** The release serrvice. */
	@MockBean
	ReleaseService releaseSerrvice;

	/** The ticket service. */
	@MockBean
	TicketService ticketService;

	/**
	 * Gets the all applications.
	 *
	 * @return the all applications
	 * @throws Exception the exception
	 */
	@org.junit.jupiter.api.Test
	public void getAllApplications() throws Exception {
		mockMvc.perform(get("/tza/applications")).andExpect(status().isOk())
				.andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON))
				.andExpect((ResultMatcher) content().json("[]"));

		verify(applicationService, times(1)).listApplications();

	}

	/**
	 * Gets the app tickets.
	 *
	 * @return the app tickets
	 * @throws Exception the exception
	 */
	@Test
	public void getAppTickets() throws Exception {
		mockMvc.perform(get("tza/tickets/")).andExpect(status().isOk())
				.andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON))
				.andExpect((ResultMatcher) content().json("[]"));

		verify(ticketService, times(1)).listTickets();
	}

}
