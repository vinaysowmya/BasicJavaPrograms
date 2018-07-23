package com.jda.DataStructurePrograms;

import com.jda.utility.Deq;
import com.jda.utility.utility;

public class Palindrome {
	public static void main(String args[])
	{
		utility util=new utility();
		System.out.println("Enter the String");
		String str=util.inputString();
		Deq<String> deque=new Deq<String>();
		int size=str.length();
		//deque.palindrome(str,size);
		for(int i=0;i<str.length();i++){
			deque.insertFront(String.valueOf(str.charAt(i)));
		}
		 
		int flag=0;
		while(size>1)
		{
			//System.out.println(size);
			String last=deque.removeRear();
		//	System.out.println(last);
			String first = deque.removeFront();
		//	System.out.println(first);
			
			if(first.compareTo(last)!=0)
			{
				flag=1;
				
				break;
			}
			size=size-2;
		}
		if(flag==1)
		{
			System.out.println("Not palindrome");
		}
		else
		{
			System.out.println("palindrome");
		} 
	} 

}
