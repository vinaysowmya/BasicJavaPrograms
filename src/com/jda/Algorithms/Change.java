package com.jda.Algorithms;

import com.jda.utility.utility;

public class Change {
	public static void main(String args[])
	{
		utility util=new utility();
		int[] array={1000, 500, 100, 50, 10, 5};
		System.out.println("Enter amount");
		int amnt=util.inputInteger();
		int size=array.length;
		int value=util.change(array,amnt,size);
		System.out.println("number of notes needed"+value);
	}

}
