package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class FlipCoin {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("no of times to flip");
		int num=util.inputInteger();
		Double percent=util.flip(num);
		System.out.println("percent of heads:" +percent);
		System.out.println("percent of tails" +(100-percent));	
	}
}