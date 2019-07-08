package com.jda.DataStructurePrograms;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import com.jda.utility.linkedlist;
import com.jda.utility.utility;

public class NumberInSlot {
          public static void main(String args[]) throws IOException
          {
        	  utility util=new utility();
        	  
        	  HashMap<Integer,linkedlist<Integer>> slot = new HashMap<>();
        		for (int i = 0; i < 11; i++) {
        		slot.put(i, null);
        		}
      	System.out.println("please enter the integer you want to search");
      	int val = util.inputInteger();
      	ArrayList<Integer> templist = new ArrayList<Integer>();
    	BufferedReader br = new BufferedReader(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/Algorithms/File1.txt"));
    	String line = null;
    	while ((line = br.readLine()) != null) {
    	String[] values = line.split(",");
    	for (String str : values) {
    	templist.add(Integer.parseInt(str));
    	}
    	}
    	br.close();
    	Integer[] arr = new Integer[templist.size()];
    	arr = templist.toArray(arr);
      	System.out.println();
    	for (int i = 0; i < arr.length; i++) {
          	Integer rem = arr[i] % 11;
          	if (slot.get(rem) == null) {
          	linkedlist<Integer> list = new linkedlist<Integer>();
          	slot.put(rem, list);
          	list.sortedInsert(arr[i]);
          	}
          	else {
          	slot.get(rem).sortedInsert(arr[i]);
          	}
          	
          	}
        	for (int i = 0; i <11; i++) {
        	if(slot.get(i) != null) {
        	System.out.println("slot->" + i+" ");
        	slot.get(i).printList();
        	System.out.println();
        	}
        	}
        	System.out.println();
        	linkedlist<Integer> lst = new linkedlist<Integer>();
        	 int key = val % 11;
  	    	lst=slot.get(key);
  	    	 boolean flag=lst.search(val);
  	    	 System.out.println(flag);
  		   if(flag)
  		   {
  			   lst.removeElements(val);
  			//   array.printList();
  			 //  lst.inputToFile();
  			 //  System.out.println("yes");
  			 slot.put(key, lst);
  		   }  
  		   else
  		   {
  			   lst.sortedInsert(val);
  			 //  array.printList();
  			//  lst.inputToFile();
  			 slot.put(key, lst);
  			   
  		   }
  		 for (int i = 0; i <11; i++) {
         	if(slot.get(i) != null) {
         	System.out.println("slot->" + i+" ");
         	slot.get(i).printList();
         	System.out.println();
         	}
         	}
    
      

    	}

}
