package com.ps.service;

import com.ps.entity.Release;
/**
 * The Interface ReleaseService.
 */
public interface ReleaseService {

	/**
	 * List releases.
	 *
	 * @return the iterable
	 */
	Iterable<Release> listReleases();
}
