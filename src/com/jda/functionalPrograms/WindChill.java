package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class WindChill {
	public static void main(String args[])
	{
		utility util=new utility();
		double temp=util.inputDouble();
		double vel=util.inputDouble();
		if(temp<50 && vel>3 && vel<120)
		{
		double value=util.windchill(temp,vel);
		System.out.println(value);
		}
		else
		{
			System.out.println("Not Possible");
		}
	
		
	}

}
