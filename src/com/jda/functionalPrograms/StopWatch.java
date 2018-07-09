package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class StopWatch {
	public static void main(String args[])
	{
	   long startTime = System.currentTimeMillis();
	   utility util=new utility();
	   int value=util.inputInteger();
	   long stopTime = System.currentTimeMillis();
	    long elapsedTime = stopTime - startTime;
	    System.out.println(elapsedTime);
	}

}
