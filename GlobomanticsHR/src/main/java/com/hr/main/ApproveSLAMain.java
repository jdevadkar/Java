package com.hr.main;

import java.util.Arrays;
import java.util.List;

import com.hr.personnel.ServiceLicenseAgreement;
import com.hr.personnel.Subcontractor;

/**
 * The Class ApproveSLAMain.
 */
public class ApproveSLAMain {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		int minTimeOffPercent = 98;
		int maxResolutionDays = 2;
		ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(minTimeOffPercent, maxResolutionDays);

		Subcontractor subcontractor1 = new Subcontractor("Rebekah Jackson", "rebekah-jackson@abc.com", 3000, 15);

		Subcontractor subcontractor2 = new Subcontractor("Harry Fitz", "harryfitz@def.com", 3000, 15);

		List<Subcontractor> collaborators = Arrays.asList(subcontractor1, subcontractor2);

		for (Subcontractor s : collaborators) {
			s.approveSLA(companySla);
			System.out.println(s);
		}

	}

}
