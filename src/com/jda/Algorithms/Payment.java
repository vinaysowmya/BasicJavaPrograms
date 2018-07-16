package com.jda.Algorithms;

import com.jda.utility.utility;

public class Payment {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter principal");
		double p=util.inputInteger();
		System.out.println("Enter years");
		double y=util.inputInteger();
		System.out.println("Enter rate of interest");
		double r=util.inputInteger();
		double value=util.payment(p,y,r);
		System.out.println(value);
		
	}

}
