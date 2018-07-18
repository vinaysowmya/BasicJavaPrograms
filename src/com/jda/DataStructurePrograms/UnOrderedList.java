package com.jda.DataStructurePrograms;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

import com.jda.utility.linkedlist;
import com.jda.utility.utility;
import com.jda.utility.linkedlist.Node;

public class UnOrderedList {
	public static void main(String args[]) throws IOException
	{
		utility util=new utility();
		String[] array1=util.inputFile();
		System.out.println("Enter string to search");
		String val=util.inputString();
		linkedlist<String> array=new linkedlist<String>();
		int size=array1.length;
		for(int i=0;i<size;i++)
		{
		 array.adds(array1[i]);
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
		   array.adds(val);
		   array.printList();
		   array.inputToFile();
		   
	   }
		
	}
}
