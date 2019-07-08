package com.jda.Algorithms;

import com.jda.utility.utility;

public class Nibble {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter the number");
		int num=util.inputInteger();
		double value=util.nibble(num);
		System.out.println(value);
		boolean rslt=util.powOfTwo(value);
		if(rslt)
		{
			System.out.println("Result is a power of two");
		}
		else
		{
		System.out.println("Result is not a power of two");
		}
		
	}

}
