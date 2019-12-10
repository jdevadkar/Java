package com.ps.service;

import com.ps.entity.Application;

// TODO: Auto-generated Javadoc
/**
 * The Interface ApplicationService.
 */
public interface ApplicationService {

	/**
	 * List applications.
	 *
	 * @return the iterable
	 */
	Iterable<Application> listApplications();
	
	/**
	 * Find application.
	 *
	 * @param id the id
	 * @return the application
	 */
	Application findApplication(Integer id);
}
