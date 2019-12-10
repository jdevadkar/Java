package com.ps.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.entity.Application;
import com.ps.exception.ApplicationNotFoundException;
import com.ps.repository.ApplicationRepository;

/**
 * The Class ApplicationServiceImpl.
 */
@Service
public class ApplicationServiceImpl implements ApplicationService {

	/** The application repository. */
	@Autowired
	private ApplicationRepository applicationRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ps.service.ApplicationService#listApplications()
	 */
	@Override
	public Iterable<Application> listApplications() {
		return applicationRepository.findAll();
	}

	@Override
	public Application findApplication(Integer id) {
		Optional<Application> optionalApplication = applicationRepository.findById(id);
		if (optionalApplication.isPresent()) {
			return optionalApplication.get();
		} else {
			throw new ApplicationNotFoundException("Application Not Found");
		}

	}

}
