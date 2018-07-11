package com.jda.Algorithms;

import java.util.Arrays;

import com.jda.utility.utility;

public class InsertionSort {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("enter 1 for int and 2 for string");
		int flag=util.inputInteger();
		if(flag==1)
		{
			  long startTime = System.currentTimeMillis();
			System.out.println("Enter size");
			int num=util.inputInteger();
			System.out.println("Enter array values");
			Integer[] array=util.inputArray(num);
			
		//	  System.out.println(startTime);
		  Integer[] array1=util.insertionsort(array,num);
		  for(int i=0;i<num;i++)
		  {
			System.out.print(array1[i]+" ");
		  }
		  System.out.println();
		  long stopTime = System.currentTimeMillis();
		//  System.out.println(stopTime);
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
		} 
		if(flag==2)
		{
			  long startTime = System.currentTimeMillis();
		System.out.println("Enter size");
		int num=util.inputInteger();
		System.out.println("Enter array values");
		String[] array=util.inputArrayofStrings(num);
		
		//  System.out.println(startTime);
		String[] array1=util.insertionsort(array,num);
		for(int i=0;i<num;i++)
		{
		System.out.print(array1[i]+" ");
		}
		System.out.println();
		  long stopTime = System.currentTimeMillis();
		//  System.out.println(stopTime);
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
		}
	
	}

}
