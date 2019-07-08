package com.jda.DataStructurePrograms;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import com.jda.utility.linkedlist;
import com.jda.utility.utility;

public class OrderedList {
	public static void main(String args[]) throws IOException
	{
		utility util=new utility();
		String[] array1=util.inputFile();
		Arrays.sort(array1);
		int n=array1.length;
		System.out.println("Enter number to search");
		int val=util.inputInteger();
		linkedlist<Integer> array=new linkedlist<Integer>();
		int size=array1.length;
		for(int i=0;i<size;i++)
		{
		 array.adds(Integer.parseInt(array1[i]));
		}
		array.printList();
		System.out.println();
		int num=array.size();
	   boolean flag=array.search(val);
	   if(flag)
	   {
		   array.removeElements(val);
		   array.printList();
		   array.inputToFile();
		 //  System.out.println("yes");
	   }  
	   else
	   {
		   array.sortedInsert(val);
		   array.printList();
		   array.inputToFile();
		   
	   }
		
	}

}
