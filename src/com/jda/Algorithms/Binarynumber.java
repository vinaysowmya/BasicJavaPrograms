package com.jda.Algorithms;

import java.util.ArrayList;

import com.jda.utility.utility;

public class Binarynumber {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter the number");
		int num=util.inputInteger();
		ArrayList<Integer> array=util.binary(num);
		for(int i=(array.size()-1);i>=0;i--){
			System.out.print(array.get(i)+" ");
		}
		
		
	}

}
