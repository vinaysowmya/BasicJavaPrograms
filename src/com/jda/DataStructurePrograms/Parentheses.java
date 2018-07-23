package com.jda.DataStructurePrograms;

import com.jda.utility.Stack;
import com.jda.utility.utility;

public class Parentheses {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter the String");
		String str=util.inputString();
		int size=str.length();
		Stack stack =new Stack();
		if(stack.balanced(str))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		
	}

}
