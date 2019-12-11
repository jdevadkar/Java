package com.ps.web;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * The Class TzaControllerIntigrationTest.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class TzaControllerIntigrationTest {

	/** The port. */
	@LocalServerPort
	private int port;

	/** The rest template. */
	@Autowired
	private TestRestTemplate restTemplate;

	/**
	 * Gets the all applications.
	 *
	 * @return the all applications
	 * @throws Exception the exception
	 */
	@Test
	public void getAllApplications() throws Exception {
		ResponseEntity<List> responseEntity = this.restTemplate
				.getForEntity("http://localhost:" + port + "/tza/applications", List.class);
		assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
	}

	/**
	 * Gets the all tickets.
	 *
	 * @return the all tickets
	 * @throws Exception the exception
	 */
	@Test
	public void getAllTickets() throws Exception {
		ResponseEntity<List> responseEntity = this.restTemplate.getForEntity("http://localhost:" + port + "tza/tickets",
				List.class);

		assertThat(responseEntity.getStatusCode(), equalTo(HttpStatus.OK));
	}
}
