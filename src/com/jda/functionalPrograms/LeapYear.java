package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class LeapYear {
	public static void main(String args[])
	{
	utility util = new utility();

	int year = util.inputInteger();
	int ct=0;
	int years=year;
	while(years>0)
	{
		ct++;
		years=years/10;
	}
if(ct==4)
{
boolean leap = util.leapyear(year);



if(leap)
	{
		System.out.println(year + "is a leap year");
	}else
	{
		System.out.println(year + "not a leap year");
	}
}
else
{
	System.out.println("year is not a 4 digit number");
}

}
	}
