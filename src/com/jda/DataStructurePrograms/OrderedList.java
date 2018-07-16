package com.jda.DataStructurePrograms;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import com.jda.utility.utility;

public class OrderedList {
	public static void main(String args[]) throws IOException
	{
		utility util=new utility();
		String[] array=util.inputFile();
		Arrays.sort(array);
		int n=array.length;
		System.out.println("Enter number to search");
		int value=util.inputInteger();
		LinkedList<Integer> rslt=util.orderedList(array, value);
		util.inputToFile(rslt);
		
	}

}
