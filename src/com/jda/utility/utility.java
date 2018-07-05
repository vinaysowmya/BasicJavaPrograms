package com.jda.utility;

import java.util.Scanner;

public class utility {
	Scanner scanner;

	public utility() {
		scanner = new Scanner(System.in);
	}

	public String inputString() {
		return scanner.next();
	}

	public int inputInteger() {
		return scanner.nextInt();
	}

	public  String replaceString(String template, String inputString){
		String replacedString=template.replaceAll("<<username>>",inputString);
		return replacedString;
	}
	
	public Boolean leapyear(int  year)
	{
		boolean leap=false;
		if((year%400)==0)
		{
			leap=true;
		}
		else if((year%100)==0)
		{
		  leap=false;
		}
		
		else 	if((year%4)==0)
			{
				leap=true;
			}
		
		else
		{
			leap=false;
		}
		return leap;
	}
		
	

	public Double flip(int num)
	{
		int head=0,tail=0;
		for(int i=0;i<num;i++)
		{
			double value=Math.random();
			if(value>=0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		//	System.out.print(value+" ");
		}
	//	System.out.println();
		System.out.println("no of  heads"+head);
		System.out.println("no of tails"+(num-head));
		double percent=( (head*100)/num);
		return percent;
	}
	
	public void power(int num)
	{
		for(int i=1;i<=num;i++)
		{
			double poweroftwo=Math.pow(2, i);
			System.out.println("two power  of" +i  +" is " +poweroftwo);
		}
	}
	
	public double harmonic(int num)
	{
		double sum=0.0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(1.0/i);
		}
		return sum;
	}

}
