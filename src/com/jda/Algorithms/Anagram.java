package com.jda.Algorithms;

import com.jda.utility.utility;

public class Anagram {
	public static void main(String args[])
	{
		utility util=new utility();
		String str1=util.inputString();
		String str2=util.inputString();
		util.anagram(str1,str2);
		
	}

}
