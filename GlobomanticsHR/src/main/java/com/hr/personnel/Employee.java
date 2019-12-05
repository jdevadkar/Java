package com.hr.personnel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Employee {

	private String firstName;
	private String lastName;
	private int monthlyIncome;
	private int nbHoursPerWeek;

	public Employee(String fullName, int monthlyIncome) {
		setMonthlyIncome(monthlyIncome);

		String[] names = fullName.split(" ");
		this.firstName = names[0];
		this.lastName = names[1];
	}

	public String getEmail() {
		return this.firstName + "." + this.lastName + "@globomantichr.com";
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", monthlyIncome=" + monthlyIncome
				+ ", nbHoursPerWeek=" + nbHoursPerWeek + "]";
	}

	public int getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(int monthlyIncome) {
		if (monthlyIncome < 0) {
			throw new IllegalArgumentException("Income must be positive");
		}
		this.monthlyIncome = monthlyIncome;
	}

	public int getNbHoursPerWeek() {
		return nbHoursPerWeek;
	}

	public void setNbHoursPerWeek(int nbHoursPerWeek) {
		if (nbHoursPerWeek <= 0) {
			throw new IllegalArgumentException("Income must be ppositive");
		}
		this.nbHoursPerWeek = nbHoursPerWeek;
	}

	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

}
