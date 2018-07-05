package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class PrimeFactors {
	public static void main(String args[])
	{
		System.out.println("Enter the value of N");
		utility util=new utility();
		int num=util.inputInteger();
		util.prime(num);
	}

}
