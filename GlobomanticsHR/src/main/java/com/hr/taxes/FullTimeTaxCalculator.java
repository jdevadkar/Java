package com.hr.taxes;

import com.hr.personnel.Employee;

/**
 * The Class FullTimeTaxCalculator.
 */
public class FullTimeTaxCalculator implements TaxCalculator {

	/** The retirement tax percentage. */
	private final int RETIREMENT_TAX_PERCENTAGE = 10;

	/** The income tax percentage. */
	private final int INCOME_TAX_PERCENTAGE = 16;

	/** The base health insurance. */
	private final int BASE_HEALTH_INSURANCE = 100;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.taxes.TaxCalculator#calculate(com.hr.personnel.Employee)
	 */
	public double calculate(Employee employee) {
		return BASE_HEALTH_INSURANCE + (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100
				+ (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
	}
}
