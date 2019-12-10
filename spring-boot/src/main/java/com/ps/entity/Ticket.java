package com.ps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

/**
 * The Class Ticket.
 */
@Entity
public class Ticket {

	/** The id. */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	/** The title. */
	private String title;

	/** The description. */
	private String description;

	/** The application. */
	@ManyToOne
	@JoinColumn(name = "application_id")
	private Application application;

	/** The release. */
	@ManyToOne
	@JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name = "ticket_fk"), inverseJoinColumns = @JoinColumn(name = "release_fk"))
	private Release release;

	/** The status. */
	private String status;

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
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
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

	/**
	 * Gets the application.
	 *
	 * @return the application
	 */
	public Application getApplication() {
		return application;
	}

	/**
	 * Sets the application.
	 *
	 * @param application the new application
	 */
	public void setApplication(Application application) {
		this.application = application;
	}

	/**
	 * Gets the release.
	 *
	 * @return the release
	 */
	public Release getRelease() {
		return release;
	}

	/**
	 * Sets the release.
	 *
	 * @param release the new release
	 */
	public void setRelease(Release release) {
		this.release = release;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Instantiates a new ticket.
	 */
	public Ticket() {
		super();
	}

	/**
	 * Instantiates a new ticket.
	 *
	 * @param title       the title
	 * @param description the description
	 * @param application the application
	 * @param release     the release
	 * @param status      the status
	 */
	public Ticket(String title, String description, Application application, Release release, String status) {
		super();
		this.title = title;
		this.description = description;
		this.application = application;
		this.release = release;
		this.status = status;
	}

}
