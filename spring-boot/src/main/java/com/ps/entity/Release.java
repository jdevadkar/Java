package com.ps.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The Class Release.
 */
@Entity
public class Release {

	/** The id. */
	@Id
	private Integer id;

	/** The release date. */
	private String releaseDate;

	/** The description. */
	private String description;

	/**
	 * Instantiates a new release.
	 */
	public Release() {
		super();
	}

	/**
	 * Instantiates a new release.
	 *
	 * @param id          the id
	 * @param releaseDate the release date
	 * @param description the description
	 */
	public Release(Integer id, String releaseDate, String description) {
		super();
		this.id = id;
		this.releaseDate = releaseDate;
		this.description = description;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the release date.
	 *
	 * @return the release date
	 */
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * Sets the release date.
	 *
	 * @param releaseDate the new release date
	 */
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
