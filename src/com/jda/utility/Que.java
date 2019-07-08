package com.jda.utility;

public class Que {
	 Que que;
	 int size=0;
	public static class Node
	{
	 public int key;
	 Node next;
	 public int data;
	 public Node(int k,int d) {
	     key = k;
	     data=d;
	     next = null;
	 }
	}
 Node front, rear;
	utility util=new utility();
  
 public Que() {
     front = rear = null;
 } 


 public void enqueue(int key,int data)
 {
	 size++;
     Node temp = new Node(key, data);
     if (rear == null)
     {
       front = rear = temp;
       // return;
     }
     else
     {
     rear.next = temp;
     rear = temp;
     }
 }
 

 public Node dequeue()
 {
     if (front == null)
     {
        return null;
     }
     Node temp = front;
     front = front.next;
     if (front == null)
        rear = null;
     return temp;
 }
 
 public int add(int cash,int num)
 {
	 int key,data,value=cash;
	
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter details of customer" +(i+1));
			System.out.println("Enter amount of customer" +(i+1));
			 data=util.inputInteger();
			System.out.println("Enter 1 for deposit 2 for withdraw" );
			 key=util.inputInteger();
			
			enqueue(key, data);
			value=check(value,num);
		}
		
		// int value=check(cash,num);
		 return value;
 }
 public int check(int cash,int num)
 {
	
	
	 int chk=0,val=0;
	
		 Node temp=dequeue();
		chk =temp.key;
		val=temp.data;
		if(chk==1)
		{
			cash=cash+val;
		}
		if(chk==2)
		{
			if(val>cash)
			{
				System.out.println("Can't withdraw money ");
			}
			else
			{
				cash=cash-val;
			}
			
		}
	
	return cash;
	 
		
 }
 public int size()
 {
	 return size;
 }
	

}
