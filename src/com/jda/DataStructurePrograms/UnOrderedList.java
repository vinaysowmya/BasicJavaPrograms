package com.jda.DataStructurePrograms;

import java.io.IOException;
import java.util.LinkedList;

import com.jda.utility.utility;

public class UnOrderedList {
	public static void main(String args[]) throws IOException
	{
		utility util=new utility();
		String[] array=util.inputFile();
		System.out.println("Enter string to search");
		String value=util.inputString();
		LinkedList<String> rslt=util.unOrderedList(array,value);
		util.inputToFile(rslt);
		
	}

}
