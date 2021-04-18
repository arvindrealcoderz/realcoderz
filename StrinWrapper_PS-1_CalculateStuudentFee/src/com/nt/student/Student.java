package com.nt.student;

public class Student {
	// methods calculate fee
	public double calculateFeeStructor(Long studentId, Character studentGrade, Double monthlyFees,
			Boolean isScholarshipEligible, Double Fees) {
		if (studentId != 0l && studentGrade == 'A' && isScholarshipEligible == true) {
			Fees = monthlyFees - monthlyFees * 10 / 100;
		} // if
		else if (studentId != 0l && studentGrade == 'B' && isScholarshipEligible == true) {
			Fees = monthlyFees - monthlyFees * 8 / 100;
		} // else if
		else if (studentId != 0l && studentGrade == 'C' && isScholarshipEligible == true) {
			Fees = monthlyFees - monthlyFees * 6 / 100;
		} // else if
		else if (studentId != 0l && studentGrade == 'D' && isScholarshipEligible == true) {
			Fees = monthlyFees - monthlyFees * 4 / 100;
		} // else if
		else {
			System.out.println("not Eligible for Exemption");
		}
		return Fees;
	}// calculateFee

}
