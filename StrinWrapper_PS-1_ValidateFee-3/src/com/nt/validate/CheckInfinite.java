package com.nt.validate;

public class CheckInfinite {
	// compare marks
	public byte validateFees(Double Fees) {
		Double f=Fees;
		boolean isFinite=Double.isFinite(Fees);
		if(isFinite)
			System.out.println("Fees is not infinite");
		else
			System.out.println("Fees is  infinite");
		
		
		return f.byteValue();
	}// compareMarks

}
