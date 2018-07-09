package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Distance {
	public static void main(String args[])
	{
		int x,y;
		utility util=new utility();
		 x=util.inputInteger();
		y=util.inputInteger();
		double dst=util.distance(x,y);
		System.out.println(dst);
	}

}
