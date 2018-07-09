package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Triplets {
	public static void main(String args[])
	{
		int num;
		utility util=new utility();
		num=util.inputInteger();
	int[] array=new  int[num];
	array=util.inputarray(num);
	int value=util.triplets(num, array);
	System.out.println(value);
	
		
	}

}
