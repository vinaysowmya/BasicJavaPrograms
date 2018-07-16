package com.jda.Algorithms;

import com.jda.utility.utility;

public class DayOfWeek {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter the date");
		int d=util.inputInteger();
		System.out.println("Enter the month");
		int m=util.inputInteger();
		System.out.println("Enter the year");
		int y=util.inputInteger();
		int day=util.day(d,m,y);
		System.out.println(day);
		
	}

}
