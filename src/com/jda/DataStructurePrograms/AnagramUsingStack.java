package com.jda.DataStructurePrograms;

import java.util.ArrayList;

import com.jda.utility.Que;
import com.jda.utility.StackUsingLL;
import com.jda.utility.utility;
import com.jda.utility.Que.Node;

public class AnagramUsingStack {
	public static void main(String args[])
	{
	utility util=new utility();
	System.out.println("Start");
	int strt=util.inputInteger();
	System.out.println("end");
	int end=util.inputInteger();
	ArrayList<Integer> array=util.prime(strt,end);
	int size=array.size();
	System.out.println();
	StackUsingLL que=new StackUsingLL();
	for(int i=0;i<size-1;i++)
	{
		String str1=	Integer.toString(array.get(i));
		for(int j=i+1;j<size;j++)
		{
		
		String str2=	Integer.toString(array.get(j));
//System.out.print(str1+" "+str2);
//System.out.println();
if(util.anagram(str1, str2))
{
	int key=Integer.parseInt(str1);
	int data=Integer.parseInt(str2);
	que.push(key, data);
}
		}
	}
	int num=que.size();
//	System.out.println(num);
	int chk=0,val=0;
	//((StackUsingLL) que).fun(num);
	
		for(int i=0;i<num;i++)
		{
			 com.jda.utility.StackUsingLL.Node temp=que.pop();
			 int val1=(int) temp.data;
			int	chk1 =(int) temp.key;
				System.out.print(chk1+"  "+val1);
			System.out.println();
		}
		
	
	

	}
}
