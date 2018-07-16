package com.jda.functionalPrograms;

import java.util.ArrayList;

import com.jda.utility.utility;

public class Permutations {
	public static void main(String args[])
	{
		utility util=new utility();
		String str=util.inputString();
		int lngth=str.length();
		int fst=0;
		int lst=lngth-1;
		ArrayList<String> array=new ArrayList<String>();
		
	 ArrayList<String> array1=util.permute(str,fst,lst,array);
		int value=array1.size();
		System.out.println(value);
	}

}
