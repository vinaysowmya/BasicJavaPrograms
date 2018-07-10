package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Quadratic {
	public static void main(String args[])
	{
	  utility util=new utility();
	  int a=util.inputInteger();
	  int b=util.inputInteger();
	  int c=util.inputInteger();
	  double array[]=util.quadratic(a,b,c);
	  for(int i=0;i<2;i++)
	  {
		  System.out.println(array[i]);
	  }
	}

}
