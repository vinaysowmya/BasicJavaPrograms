package com.jda.Algorithms;

import java.util.Arrays;

import com.jda.utility.utility;

public class BinarySearch {
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
			System.out.println("Enter value to check");
			int value=util.inputInteger();
			Arrays.sort(array);
		 
			int pos=util.binarySearch(array,value,0,num-1);
			System.out.println(pos);
			  long stopTime = System.currentTimeMillis();
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
		System.out.println("Enter value to check");
		String value=util.inputString();
		Arrays.sort(array);
	/*	for(int i=0;i<num;i++)
		{
			System.out.println(array[i]);
		} */
		 
		int pos=util.binarySearch(array,value,0,num-1);
		System.out.println(pos);
		  long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
		}
	}

}
