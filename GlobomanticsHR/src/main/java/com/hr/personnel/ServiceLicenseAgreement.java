package com.hr.personnel;

/**
 * The Class ServiceLicenseAgreement.
 */
public class ServiceLicenseAgreement {
	private int minUptimePercent;
	private int problemResolutionTimeDays;

	public ServiceLicenseAgreement(int minUptimePercent, int roblemResolutionTimeDays) {
		super();
		this.minUptimePercent = minUptimePercent;
		this.problemResolutionTimeDays = roblemResolutionTimeDays;
	}

	public int getMinUptimePercent() {
		return minUptimePercent;
	}

	public void setMinUptimePercent(int minUptimePercent) {
		this.minUptimePercent = minUptimePercent;
	}

	public int getProblemResolutionTimeDays() {
		return problemResolutionTimeDays;
	}

	public void setProblemResolutionTimeDays(int roblemResolutionTimeDays) {
		this.problemResolutionTimeDays = roblemResolutionTimeDays;
	}
}
