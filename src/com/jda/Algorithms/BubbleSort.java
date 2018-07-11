package com.jda.Algorithms;

import com.jda.utility.utility;

public class BubbleSort {
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
			 
		  Integer[] array1=util.bubblesort(array,num);
		  for(int i=0;i<num;i++)
		  {
			System.out.print(array1[i]+" ");
		  }
		  System.out.println();
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
		 
		String[] array1=util.bubblesort(array,num);
		for(int i=0;i<num;i++)
		{
		System.out.print(array1[i]+" ");
		}
		  long stopTime = System.currentTimeMillis();
		    long elapsedTime = stopTime - startTime;
		    System.out.println(elapsedTime);
		}
	}

}
