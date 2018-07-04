package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class LeapYear {
	public static void main(String args[])
	{
	utility util = new utility();

	int year = util.inputInteger();
boolean leap = util.leapyear(year);
if(leap)
	{
		System.out.println(year + "is a leap year");
	}else
	{
		System.out.println(year + "not a leap year");
	}

}
	}
