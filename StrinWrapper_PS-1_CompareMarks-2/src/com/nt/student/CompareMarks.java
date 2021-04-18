package com.nt.student;

public class CompareMarks {
	// compare marks
	public String compareMarks(Double English, Long Maths) {
		Integer maxMarks = 0;
		String data = "";
		// convert English marks From Double to Integer
		Integer maths = Maths.intValue();
		// convert marks long to integer
		Integer english = English.intValue();

		// calculate max marks b/w english and maths
		if (english > maths)
			maxMarks = english;
		else if (english < maths)
			maxMarks = maths;
//checking given condition 
		if (maxMarks == english)
			data = "English marks is higher than Maths";
		else if (maxMarks == maths)
			data = "Maths marks is higher than English";
		else if (english == maths)
			data = "Both Are Equals";

		return data;
	}// compareMarks

}
