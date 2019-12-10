package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.entity.Release;
import com.ps.repository.ReleaseRepository;

/**
 * The Class ReleaseServiceImpl.
 */
@Service
public class ReleaseServiceImpl implements ReleaseService {

	/** The release repository. */
	@Autowired
	private ReleaseRepository releaseRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ps.service.ReleaseService#listReleases()
	 */
	@Override
	public Iterable<Release> listReleases() {
		return releaseRepository.findAll();
	}

}
