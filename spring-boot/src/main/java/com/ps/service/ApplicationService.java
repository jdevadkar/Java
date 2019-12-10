package com.ps.service;

import com.ps.entity.Application;

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
}
