package com.jda.Algorithms;

import com.jda.utility.utility;

public class MergeSort {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter size of array");
		int num=util.inputInteger();
		System.out.println("Enter the values");
		String[] array=util.inputArrayofStrings(num);
		String[] rslt=util.mergesort(array,0,num-1);
		System.out.println("Sorted array is");
		for(int i=0;i<num;i++)
		{
			System.out.print(rslt[i]+" ");
		}
		
	}

}
