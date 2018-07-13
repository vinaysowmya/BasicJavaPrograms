package com.jda.Algorithms;

import com.jda.utility.utility;

public class QuestionToFindNumber {
	public static void main(String args[])
	{
		System.out.println("Enter the value");
		utility util=new utility();
	int inputvalue=util.inputInteger();
int num=inputvalue;
int ct=-1;
while(num>0)
{
	ct++;
	num=num/2;
}
//System.out.println(ct);
int value=util.binarySearch(inputvalue, ct);
System.out.println(value);
		
		
	}

}
