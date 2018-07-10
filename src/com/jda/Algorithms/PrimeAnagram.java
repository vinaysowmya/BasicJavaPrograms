package com.jda.Algorithms;

import java.util.ArrayList;

import com.jda.utility.utility;

public class PrimeAnagram {
	public static void main(String args[])
	{
		utility util=new utility();
		int strt=util.inputInteger();
		int end=util.inputInteger();
		ArrayList<Integer> array=util.prime(strt,end);
		int size=array.size();
		System.out.println();
		for(int i=0;i<size-1;i++)
		{
			String str1=	Integer.toString(array.get(i));
			for(int j=i+1;j<size;j++)
			{
			
			String str2=	Integer.toString(array.get(j));
//	System.out.print(str1+" "+str2);
//	System.out.println();
	util.anagram(str1, str2);
			}
			util.palindrome(str1);
		}
		
	}

}
