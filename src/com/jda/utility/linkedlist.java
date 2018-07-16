package com.jda.utility;

public class linkedlist {
	class LinkedList
	{
	    Node head;
	    class Node
	    {
	        int data;
	        Node next;
	        <T> Node(T new_data) {data = (int) new_data; next = null; }
	    }
	 public void adds(int new_data)
	 {
	     Node new_node = new Node(new_data);
	     new_node.next = head;
	     head = new_node;
	 }
	}


}
