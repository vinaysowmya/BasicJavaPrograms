package com.jda.utility;

public class Stack <T extends Comparable<T>>{
	    static final int MAX = 1000;
	    int top;
	    char a[] = new char[MAX]; 
	 
	    boolean isEmpty()
	    {
	        if (top < 0)
	        {
	        	return true;
	        }
	        else
	        {
	        	return false;
	        }
	    }
	    public Stack()
	    {
	        top = -1;
	    }
	 
	    boolean push(T x)
	    {
	        if (top >= (MAX-1))
	        {
	            System.out.println("Stack Overflow");
	            return false;
	        }
	        else
	        {
	            a[++top] = (char) x;
	            return true;
	        }
	    }
	 
	    char pop()
	    {
	        if (top < 0)
	        {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
	        else
	        {
	            char x = a[top--];
	            return x;
	        }
	    }
	    public boolean check(char a,char b)
	    {
	    	 if (a == '(' && b== ')')
	    	 {
	             return true;
	    	 }
	           else if (a == '{' && b == '}')
	           {
	             return true;
	           }
	           else if (a == '[' && b == ']')
	           {
	             return true;
	           }
	           else
	           {
	             return false;
	           }
	    }
        public boolean balanced(String str)
        {
        	Stack st=new Stack();
        	int size=str.length();
        	for(int i=0;i<size;i++)
        	{
        		if(str.charAt(i)=='(' || str.charAt(i)=='{' ||str.charAt(i)=='[')
        		{
        			st.push(str.charAt(i));
        		}
        		else if(str.charAt(i)==')' || str.charAt(i)=='}' ||str.charAt(i)==']')
        		{
        			if (st.isEmpty())
                    {
                        return false;
                    } 
                  else if ( !check(st.pop(),str.charAt(i)) )
                    {
                        return false;
                    }
                 }
        	}
        	if (st.isEmpty())
                return true; 
              else
                {  
                    return false;
                } 
        		
        	}
        
}
