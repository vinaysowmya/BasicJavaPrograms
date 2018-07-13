package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class RandomNumber {
	public static void main(String args[])
	{
		utility util=new utility();
		int num=util.inputInteger();
	//	int value=util.random(num);
		int cnt=util.random(num);
		System.out.println(cnt);	
	}

}
