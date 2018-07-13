package com.jda.Algorithms;

import java.io.IOException;
import java.util.Arrays;

import com.jda.utility.utility;

public class BinarySearchWordList {
	public static void main(String args[]) throws IOException
	{
		utility util=new utility();
		String[] array=util.inputFile();
		System.out.println("Enter string to search");
		String value=util.inputString();
		int num=array.length;
		Arrays.sort(array);
		int pos=util.binarySearch(array, num, value);
		System.out.println(pos);
		
	}

}
