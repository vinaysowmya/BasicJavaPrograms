package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Gambler {
	public static void main(String args[])
	{
		System.out.println("Enter the stake");
		utility util=new utility();
		int stake=util.inputInteger();
		System.out.println("Enter the goal");
		int  goal=util.inputInteger();
		System.out.println("Enter the value of N");
		int num=util.inputInteger();
		int wins=util.gambling(stake,goal,num);
		System.out.println(wins+ "no. of wins");
		int percent=((wins*100)/num);
		System.out.println("percent of wins" +percent);
		System.out.println("percent of loss" +(100-percent));	
	}

}
