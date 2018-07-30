package com.jda.utility;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class linkedlist <T >  {
	
  
public Node head;
  public class Node<S >  {
        S data;
        Node next;
		public int val;
          Node(S new_data)
        {
        	
        data = new_data;
        next = null;
        }
    }
 public void adds(T data)
 {
     Node new_node = new Node(data);
     new_node.next = head;
     head = new_node;
 }
 
 public void append(int new_data)
 {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head; 
        while (last.next != null)
            last = last.next;
        last.next = new_node;
        return;
    }
 


 public void printList()
 {
	
		Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

public int size() {
	int size = 0;
    Node Current = head;
    while(Current.next != null)
    {
      Current = Current.next;
      size++;     
    }
    return size;	
}

public boolean search(T x)
{
    Node current = head; 
    System.out.println(x);
    while (current != null)
    {
        if (((current.data.toString()).compareTo(x.toString()))==0)
        {
            return true;  
        }
        current = current.next;
    }
    return false;   
}
public void removeElements(T val) {
    Node helper = new Node(0);
    helper.next = head;
    Node p = helper;
 
    while(p.next != null){
        if(p.next.data.toString().compareTo(val.toString())==0){
            Node next = p.next;
            p.next = next.next; 
        }else{
            p = p.next;
        }
    }
}




public void sortedInsert(T data)
{
     Node current;
     Node new_node = new Node(data);
     if (head == null ||( head.data.toString().compareTo(new_node.data.toString()))<=0)
     {
    	 new_node.next = head;
        head = new_node;
     }
     else {
        current = head;

        while (current.next != null &&
               (current.next.data.toString().compareTo(new_node.data.toString()) )>0)
              current = current.next;
        new_node.next = current.next;
        current.next = new_node;
     }
 }

public <T extends Comparable<T>> void inputToFile() throws IOException
{
	 BufferedWriter writer = new BufferedWriter(new FileWriter("C:/practise/BasicJavaPrograms/src/com/jda/Algorithms/File2.txt"));
	   // int size=rslt.size();
	    Node Current=head;  
	    while (Current != null)
	    {
	    	T str=(T) Current.data;
	    	 writer.write(str+" ");   
	        Current = Current.next;
	    }
	     
	    writer.close();
} 

public void fun()
{
	head=mergeSort(head);
	printList();
}

public Node mergeSort(Node h) 
{

   
    if (h == null || h.next == null)
    {
        return h;
    }
    Node middle = getMiddle(h);
    Node nextofmiddle = middle.next;

    middle.next = null;
    Node left = mergeSort(h);
    Node right = mergeSort(nextofmiddle);

   
    Node sortedlist = sortedMerge(left, right);
    return sortedlist;
}


public Node getMiddle(Node h) 
{
    
    if (h == null)
        return h;
    Node fastptr = h.next;
    Node slowptr = h;
    
    while (fastptr != null)
    {
        fastptr = fastptr.next;
        if(fastptr!=null)
        {
            slowptr = slowptr.next;
            fastptr=fastptr.next;
        }
    }
    return slowptr;
}
Node sortedMerge(Node a, Node b) 
{
    Node result = null;
   
    if (a == null)
        return b;
    if (b == null)
        return a;

    if ( a.data.toString().compareTo(b.data.toString())<=0) 
    {
        result = a;
        result.next = sortedMerge(a.next, b);
    } 
    else
    {
        result = b;
        result.next = sortedMerge(a, b.next);
    }
    return result;

}


}



