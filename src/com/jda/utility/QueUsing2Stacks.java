package com.jda.utility;


public class QueUsing2Stacks {
	
	
	static StackUsingLL stack1 =new StackUsingLL();
	static StackUsingLL stack2 =new StackUsingLL();
	int size=0;
	    public  void Enqueue(int i) {
	    	size++;
	    	  stack1.push(i,0);
	    	}
	          
	           int size2=stack2.size();
	         //  System.out.println(size1);
	   
	    	public  int Dequeue() {
	    		 int size1=stack1.size();
	    		
	    		 if (stack2.size() == 0) {
	    			    if (stack1.size() == 0) 
	    			    {
	    			    	
	    			    }
	    		while((size1)!=0)
	    		{
	    				int d=(int) stack1.pop().data;
	    			//	System.out.println(d);
	    				stack2.push(d,0);
	    				size1--;
	    		}	
	    		 }
	    	return (int) (stack2.pop().data);
	    	}
	    	public int size()
	    	{
	    		return size;
	    	}
	

}
