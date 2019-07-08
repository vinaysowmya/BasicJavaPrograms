package com.jda.DataStructurePrograms;

import com.jda.utility.Que;
import com.jda.utility.utility;

public class Banking {
	public static void main(String args[])
	{
		Que que=new Que();
		utility util=new utility();
		System.out.println("Enter cash");
		int cash=util.inputInteger();
		System.out.println("Enter no. of customers");
		int num=util.inputInteger();
		int value=que.add(cash,num);
		System.out.println("The final amount in bank is:" +value);
		
	}

}
