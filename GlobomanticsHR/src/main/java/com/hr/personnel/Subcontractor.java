package com.hr.personnel;

/**
 * The Class Subcontractor.
 */
public class Subcontractor {

	private String name;
	private String email;
	private final int monthlyIncome;
	private int nbHoursPerWeek;

	public Subcontractor(String name, String email, int monthlyIncome, int nbHoursPerWeek) {
		super();
		this.name = name;
		this.email = email;
		this.monthlyIncome = monthlyIncome;
		this.nbHoursPerWeek = nbHoursPerWeek;
	}

	@Override
	public String toString() {
		return "Subcontractor [name=" + name + ", email=" + email + ", monthlyIncome=" + monthlyIncome
				+ ", nbHoursPerWeek=" + nbHoursPerWeek + "]";
	}

	public void requestTimeOff(int nbDays, Employee manager) {
		throw new RuntimeException("Not Implemented");
	}

	public boolean approveSLA(ServiceLicenseAgreement sla) {
		boolean result = false;
		if (sla.getMinUptimePercent() >= 98 && sla.getProblemResolutionTimeDays() <= 2) {
			return true;
		}
		System.out.println("SLA approval for " + this.name + ": " + result);
		return result;
	}
}
