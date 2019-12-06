package com.hr.personnel;

// TODO: Auto-generated Javadoc
/**
 * The Class Employee.
 */
public abstract class Employee {

	/** The first name. */
	private String firstName;

	/** The last name. */
	private String lastName;

	/** The monthly income. */
	private int monthlyIncome;

	/** The nb hours per week. */
	private int nbHoursPerWeek;

	/**
	 * Instantiates a new employee.
	 *
	 * @param fullName      the full name
	 * @param monthlyIncome the monthly income
	 */
	public Employee(String fullName, int monthlyIncome) {
		setMonthlyIncome(monthlyIncome);

		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
	}
	
	/**
	 * Request time off.
	 *
	 * @param nbDays the nb days
	 * @param manager the manager
	 */
	public void requestTimeOff(int nbDays, Employee manager) {
		throw new RuntimeException("Not Implemented");
	}


	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return this.firstName + "." + this.lastName + "@globomantichr.com";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", monthlyIncome=" + monthlyIncome
				+ ", nbHoursPerWeek=" + nbHoursPerWeek + "]";
	}

	/**
	 * Gets the monthly income.
	 *
	 * @return the monthly income
	 */
	public int getMonthlyIncome() {
		return monthlyIncome;
	}

	/**
	 * Sets the monthly income.
	 *
	 * @param monthlyIncome the new monthly income
	 */
	public void setMonthlyIncome(int monthlyIncome) {
		if (monthlyIncome < 0) {
			throw new IllegalArgumentException("Income must be positive");
		}
		this.monthlyIncome = monthlyIncome;
	}

	/**
	 * Gets the nb hours per week.
	 *
	 * @return the nb hours per week
	 */
	public int getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}

	/**
	 * Sets the nb hours per week.
	 *
	 * @param nbHoursPerWeek the new nb hours per week
	 */
	public void setNbHoursPerWeek(int nbHoursPerWeek) {
		if (nbHoursPerWeek <= 0) {
			throw new IllegalArgumentException("Income must be ppositive");
		}
		this.nbHoursPerWeek = nbHoursPerWeek;
	}

	/**
	 * Gets the full name.
	 *
	 * @return the full name
	 */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
