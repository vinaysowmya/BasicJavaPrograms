package com.jda.utility;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class utility {
	Scanner scanner;

	public utility() {
		scanner = new Scanner(System.in);
	}

	public String inputString() {
		return scanner.next();
	}

	public int inputInteger() {
		return scanner.nextInt();
	}
	
	public double inputDouble() {
		return scanner.nextDouble();
	}
	
	public int[] inputarray(int num){
		int []array=new int[num];
		for(int i=0;i<num;i++)
		{
			array[i]=scanner.nextInt();
		}
		return array;
	}
	
	

	public  String replaceString(String template, String inputString){
		String replacedString=template.replaceAll("<<username>>",inputString);
		return replacedString;
	}
	
	public Boolean leapyear(int  year)
	{
		boolean leap=false;
		if((year%400)==0)
		{
			leap=true;
		}
		else if((year%100)==0)
		{
		  leap=false;
		}
		
		else 	if((year%4)==0)
			{
				leap=true;
			}
		
		else
		{
			leap=false;
		}
		return leap;
	}
		
	

	public Double flip(int num)
	{
		int head=0,tail=0;
		for(int i=0;i<num;i++)
		{
			double value=Math.random();
			if(value>=0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
		//	System.out.print(value+" ");
		}
	//	System.out.println();
		System.out.println("no of  heads"+head);
		System.out.println("no of tails"+(num-head));
		double percent=( (head*100)/num);
		return percent;
	}
	
	public void power(int num)
	{
		for(int i=1;i<=num;i++)
		{
			double poweroftwo=Math.pow(2, i);
			System.out.println("two power  of" +i  +" is " +poweroftwo);
		}
	}
	
	public double harmonic(int num)
	{
		double sum=0.0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(1.0/i);
		}
		return sum;
	}
	
	public void prime(int num)
	{
		if((num%2)==0)
		{
		  System.out.print(2 +" ");
		  num=num/2;
		}
		for(int i=3;(i*i)<num; i+=2 )
		{
			while(num%i==0)
			{
				 System.out.print(i+" ");
				 num=num/i;
			}
		}
		if(num>2)
		{
			 System.out.print(num);
		}
	}

	public int gambling(int stake,int goal,int num)
	{
		int bets=0,wins=0;
		
		for(int i=0;i<num;i++)
		{
			int money=stake;
		while(money>0 && money<goal)
		{
			if(Math.random()<0.5)
			{
				
				money++;
			}
			else
			{
				money--;
			}
		}
		if(money==goal)
		{
			wins++;
		}
		}
		return wins;
	}
	
	public int random(int num)
	{
		int dstnct=0;
		int cnt=0;
		boolean[] exists=new boolean[num];
		while(dstnct<num)
		{
			int value=(int) ( Math.random() *num);
		//	System.out.print(value+" ");
			cnt++;
			if(!exists[value])
			{
				dstnct++;
				exists[value]=true;
			}
			}
			return cnt;	
	}
	
	public void matrix(int row, int column)
	{
		int[][] matrix=new int[row][column];
	   for (int i = 0; i < row; i++)
      {
          for (int j = 0; j < column ;j++)
          {
              matrix[i][j] = scanner.nextInt();
          }
      }
	   for (int i = 0; i < row; i++)
      {
          for (int j = 0; j < column ;j++)
          {
             System.out.print(matrix[i][j]+" ");
          }
          System.out.println();
      }
	   
}

	public int triplets(int num,int[] array)
	{
		int cnt=0;
		Set<Integer> hash=null;
		hash=new HashSet<Integer>(num);
		for(int i=0;i<num;i++)
		{
			hash.add(array[i]);
		}
		
		for(int i=0;i<num-1;i++)
		{
			for(int j=i+1;j<num;j++)
			{
				int sum=-(array[i]+array[j]);
				if(hash.contains(sum))
				{
					cnt++;
					System.out.print(array[i]+" " +array[j]+" " +sum);	
				}	
			}
			System.out.println();
		}
		return cnt;
	}
	
	public double distance(int x,int y)
	{
		double xvalue=Math.pow(x, 2);
		double yvalue=Math.pow(y, 2);
		double value=xvalue+yvalue;
		double dst=Math.sqrt(value);
		return dst;
	}
	
	  public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
	 
	 public void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
	 public double[]  quadratic(int a,int b,int c)
	 {
		 double[] array=new double[2];
		 double delta=b*b-4*a*c;
		 array[0]=((-b+Math.sqrt(delta))/(2*a));
		 array[1]=((-b-Math.sqrt(delta))/(2*a));
		 return array;
		 
	 }
	 
	 public double windchill(double temp, double velocity)
	 {
		 double tem=(((0.4275*temp)-35.75)*(Math.pow(velocity, 0.16)));
		 double value=(35.74+(0.6215*temp)+tem);
		 return value;
	 }
	 
	 public void anagram(String str1,String str2)
	 {
		 str1=str1.replaceAll(" ", "");
		 str2=str2.replaceAll(" ", "");
		 int size1=str1.length();
		 int size2=str2.length();
		 if(size1!=size2)
		 {
			 System.out.println("Not Anagrams");
		 }
		 else
		 {
			 char[] array1=str1.toLowerCase().toCharArray();
			 char[] array2=str2.toLowerCase().toCharArray();
			 Arrays.sort(array1);
			 Arrays.sort(array2);
			 int flag=0;
			 for(int i=0;i<size1;i++)
			 {
				 if(array1[i]!=array2[i]){
					 flag=1;
					 break;
				 }
			 }
			 if(flag==0)
			 {
				 System.out.println("Anagrams");
			 }
			 else
			 {
				 System.out.println("Not Anagrams");
			 }
		 }
	 }
	 
	 public void prime(int strt,int end)
	 {
	//	 int range=end-strt;
		 boolean flag[]=new boolean[end+1];
		 for(int i=0;i<end;i++)
		 {
			 flag[i]=true;
		 }
		 for(int i=2;i*i<=end;i++)
		 {
			 if(flag[i]==true)
			 {
				 for(int p= i*2; p <= end; p += i)
					 flag[p] = false;
			 }
		 }
		 for(int i=2;i<=end;i++)
			 {
			 if(flag[i]==true)
			 {
				 System.out.print(i+" ");
			 }
			 }
	 }

}