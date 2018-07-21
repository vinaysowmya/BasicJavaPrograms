package com.jda.utility;

import com.jda.utility.Que.Node;

public class StackUsingLL<T extends Comparable<T>> {
	 public Node head;
	 int size=0;
	
	 public class Node<S extends Comparable<S>>  {
	        public S data;
	        Node next;
	        public S key;
	        public Node(S d,S k) {
	   	     key = k;
	   	     data = d;
	   	     next = null;
	   	 }
	    }
	public void push(T data,T key)
	 {
		size++;
	     Node<T> new_node = new Node<T>(data,key);
	     new_node.next = head;
	     head = new_node;
	 }
	public Node<T> pop() {
		Node<T> temp = head;
		if (temp != null) {
			head = head.next;
		return temp;
		} else {
			temp = null;
	        return temp;
		}
	}
	
	
	public int size()
	 {
		 return size;
	 }
	
}
