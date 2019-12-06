package com.hr.taxes;

import com.hr.personnel.Employee;

/**
 * The Class InternTaxCalculator.
 */
public class InternTaxCalculator implements TaxCalculator {

	/** The income tax percentage. */
	private final int INCOME_TAX_PERCENTAGE = 16;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hr.taxes.TaxCalculator#calculate(com.hr.personnel.Employee)
	 */
	@Override
	public double calculate(Employee employee) {
		int monthlyIncome = employee.getMonthlyIncome();
		if (monthlyIncome < 350) {
			return 0;
		} else {
			return (monthlyIncome * INCOME_TAX_PERCENTAGE) / 100;
		}
	}
}
