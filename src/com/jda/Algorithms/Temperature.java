package com.jda.Algorithms;

import com.jda.utility.utility;

public class Temperature {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("celsius or Fahrenheit");
		String str=util.inputString();
		System.out.println("Enter temperature");
		int temp=util.inputInteger();
		int value=util.temperature(str,temp);
		System.out.println(value);
		
	}

}
