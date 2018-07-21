package com.jda.utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import com.jda.utility.linkedlist.Node;



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
	
	public static<T extends Comparable<T>> T[] inputFile() throws IOException
	{
		 String Wordlist;
       int Frequency;

     //  File file = new File("file1.txt");
     //  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
       BufferedReader br = new BufferedReader(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/Algorithms/File1.txt"));
       String line = null;
       T[] tokens = null;

       while( (line = br.readLine()) != null) {
           tokens = (T[]) line.split(",");
      //   System.out.println(line);
       }
     
		return tokens;
      
	}
	
	
	
	public Integer[] inputArray(int num){
		Integer []array=new Integer[num];
		for(int i=0;i<num;i++)
		{
			array[i]=scanner.nextInt();
		}
		return array;
	}
	
	public String[] inputArrayofStrings(int num)
	{
		String []array=new String[num];
		for(int i=0;i<num;i++)
		{
			array[i]=scanner.next();
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
		System.out.print(value+" ");
			cnt++;
			if(!exists[value])
			{
				dstnct++;
		//		System.out.println(value);
				exists[value]=true;
			}
			}
		System.out.println();
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
	 
	 public ArrayList<String> permute(String str, int l, int r, ArrayList<String> array )
    {
		
        if (l == r){
            System.out.println(str);
           array.add(str);
       
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r, array);
                str = swap(str,l,i);
            }
        }
        return array;
     
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
			// System.out.println("Not Anagrams");
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
			 if(flag==0 && size1>1)
			 {
				 System.out.println(str1+" "+str2+" "+"Anagrams");
			 }
			 else
			 {
				// System.out.println("Not Anagrams");
			 }
		 }
	 }
	 
	 public ArrayList<Integer> prime(int strt,int end)
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
//		 int[] array=new int[100];
		 ArrayList<Integer> array= new ArrayList<Integer>();
		
		 for(int i=2;i<=end;i++)
			 {
			 if(flag[i]==true)
			 {
			//	 array[ct]=i;
				 array.add(i);
			
				 System.out.print(i+" ");
			 }
			 }
		 
		 return array;
	 }
	 
	 public void palindrome(String str)
	 {
		 String reverse="";
		 int size=str.length();
		 for(int i=size-1;i>=0;i--)
		 {
			 reverse=reverse+str.charAt(i);
		 }
		 if(str.equals(reverse) && size>1)
		 {
			 System.out.println(str+" is palindrome");
	 }
	 }
	 
	public int binarySearch(int num,int count)
	 {
		 int low=0,high=num;
		 int mid=0;
		 
		 while(count>1)
		 {
			 mid=(low+high-1)/2;
		//	 mid=mid-1;
			 System.out.println("Is value between " +low +" " +mid);
			 String str=inputString();
			 if(str.equals("yes"))
			 {
				 high=mid;
			 }
			 else
			 {
				 low =mid+1;
			 }
			 if(low==mid)
			 {
				 return low;
			 }
			 count--;
			
		 }
		 System.out.println("Is value is " +low);
		 String st=inputString();
		 if(st.equals("yes"))
		 {
			 mid=low;
		 }
		 else
		 {
			 mid=high;
		 }
		 return mid;
	 } 
	 
	 public static <T extends Comparable<T>> int binarySearch(T[] array, T value, int low, int high) {
			while(low<=high) {
			    int mid = (low+high)/2;
			   // System.out.println(mid);
			    int cmp = array[mid].compareTo(value);
			//   System.out.println(cmp);
			    if (cmp < 0) 
			    {
			   	  return binarySearch(array, value, mid + 1, high);	
			   	 }
			    else  
			   	 {if (cmp > 0) 
			   	 {   	 
			   	  return  binarySearch(array, value, low, mid - 1);	 
			   	 }
			    else
			    {  
			   	   return mid;
			    }	 
			   	 }
			} 
			return -1;
		    }
	
	 public static<T extends Comparable<T>> T[] insertionsort(T[] array,int num)
	 {
		  int j=0;
		  T key;
		   for (int i = 1; i < num; i++)
		   {
		       key = array[i];
		       j = i-1;
		       while (j >= 0 && (array[j].compareTo(key))>0)
		       {
		           array[j+1] = array[j];
		           j = j-1;
		       }
		       array[j+1] = key;
		   }
		   return array;
	 }
	 
	 public static<T extends Comparable<T>> T[] bubblesort(T[] array,int num)
	 {
		 for(int i=0;i<num;i++)
		 {
			 for(int j=0;j<num-i-1;j++)
			 {
				 T temp;
				 if((array[j].compareTo(array[j+1]))>0)
				 {
					 temp=array[j+1];
					 array[j+1]=array[j];
					 array[j]=temp;
				 }
			 }
		 }
		 return array;
	 }
	 public int fact(int num)
	 {
		 int f=1;
		 for(int i=1;i<=num;i++)
		 {
			 f=f*i;
		 }
		 return f;
	 }
	 
	 public int binarySearch(String[] array,int num,String value)
	 {
		 int low=0,high=num-1;
		 while(low<=high)
		 {
			 int mid=(low+high)/2;
			 if(value.equals(array[mid]))
			 {
				 return mid;
			 }
			 else if((value.compareTo(array[mid]))>0)
			 {
				 low=mid+1;
			 }
			 else
			 {
				 high=mid-1;
			 }
		 }
		 return 0;
	 }
	 
	 public int day(int date,int month,int year)
	 {
		int y1=year-(14-month)/12;
		int x=y1+y1/4-y1/100+y1/400;
		int m1=month+(12*((14-month)/12))-2;
		int d1=(date+x+((31*m1)/12))%7;
		return d1;
	 }
	 
	 public double temperature(String str,int temp)
	 {
		 if(str.equals("celsius"))
		 {
			 double f=(temp*(9.0/5))+32;
			 return f;
		 }
		 else
		 {
			 double c=((temp-32)*(5.0/9));
			 return c;
		 }
	 }
	 
	 public int change(int[] array,int amount,int size)
	 {
		 int rslt[] = new int[amount + 1];
		 int[] arr=new int[amount+1]; 

			rslt[0] = 0;

			for (int i = 1; i <= amount; i++)
			{
				rslt[i] = Integer.MAX_VALUE;
				arr[i]=0;
			}

			for (int i = 1; i <= amount; i++) {

				for (int j = 0; j < size; j++)
					if (array[j] <= i) {
						int temp = rslt[i - array[j]];
						if (temp != Integer.MAX_VALUE && temp + 1 < rslt[i])
						{
							arr[i]=j;
							rslt[i] = temp + 1;
						}

					}

			}
		//	System.out.println(rslt[amount]);
			
			return rslt[amount];
			
	 }
	 
	 public double payment(double p,double y,double r)
	 {
		 double n=12*y;
		 double R=(r/(12*100));
		 double v=(Math.pow((1+R),-n));
		 System.out.println(R);
		 double value=((p*R)/(1-v));
		 return value;
	 }
	 
	 public double sqrt(double num)
	 {
		 double temp=num;
		 double epsilon=1e-15;
		 while((Math.abs(temp-(num/temp)))>(epsilon*temp))
		 {
		 temp=((num/temp)+temp)/2;
		 }
		return temp;		 
	 }
	 
	 public ArrayList<Integer> binary(int num)
	 {
		 ArrayList<Integer> array= new ArrayList<Integer>();
		 while(num>0)
		 {
			 int tem=num%2;
			 array.add(tem);
			 num=num/2;
		 }
		 return array;
	 }
	 
	 public double nibble(int num)
	 {
		 String binary=Integer.toBinaryString(num);
		 int size=binary.length();
		// System.out.println(binary);
		 int[] array = new int[8];
		
		 for(int i=0;i<4;i++){
		    	array[i]=((binary.charAt(3+i))-48);
		    }
		 int rem=8-size;
			 for(int i=0;i<rem;i++)
			 {
				 array[4+i]=0;
			 }
		    for (int i=4+rem; i<(8-rem); i++) {
		    	array[i]=((binary.charAt(i-4-rem))-48);
		    }
		   
		   
		  
		   
		    double decimal = 0;  
		    for(int i=7;i>=0;i--){
		    	if(array[i]==1)
		    	{
		    	decimal=decimal+Math.pow(2, (7-i));
		    	//System.out.println(decimal);
		    	}
		    }
		    return decimal;
	 }
	 
	 public boolean powOfTwo(double rslt)
	 {
		 int rem=0;
		 while(rslt>2)
		 {
			if(rslt%2!=0)
			{
				return false;
			}
			rslt=rslt/2;
		 }
		 return true;
		
	 }
	 public void merge(String[] array,int l,int m,int r)
	 {
		 int n1 = m - l + 1;
	        int n2 = r - m;
	        String Left[] = new String [n1];
	        String Right[] = new String [n2];
	        for (int i=0; i<n1; ++i)
	        {
	            Left[i] = array[l + i];
	        }
	        for (int j=0; j<n2; ++j)
	        {
	            Right[j] = array[m + 1+ j];
	        }
	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	        	int cmp=Left[i].compareTo(Right[j]);
	            if (cmp<=0)
	            {
	                array[k] = Left[i];
	                i++;
	            }
	            else
	            {
	                array[k] = Right[j];
	                j++;
	            }
	            k++;
	        }
	 
	        while (i < n1)
	        {
	            array[k] = Left[i];
	            i++;
	            k++;
	        }
	 
	        while (j < n2)
	        {
	            array[k] = Right[j];
	            j++;
	            k++;
	        }
	    }
	 
	 
	 public String[] mergesort(String[] array, int l, int r)
	    {
	        if (l < r)
	        {
	            int m = (l+r)/2;
	            mergesort(array, l, m);
	            mergesort(array , m+1, r);
	            merge(array, l, m, r);
	        }
	        return array;
	    }
	 
 
 
	 
/*	 public LinkedList<Integer> orderedList(String[] array1,int val)
	 {
		 LinkedList<Integer> array=new LinkedList<Integer>();
		 int size=array1.length;
		 for(int i=0;i<size;i++)
		 {
			 array.add(Integer.parseInt(array1[i]) );
		 }
		 boolean exists=array.contains(val);
		 if(exists)
		 {
			 if (array.get(0) == val) {
		            array.remove(0);
		        } else if (array.get(size- 1)== val) {
		            array.remove(size-1);
		        } else {
		            int i = 0;
		            while (array.get(i)!=val) {
		                i++;
		            }
		            array.remove(i);
		        }
		 }
		 else
		 {
			 if (size == 0) {
		            array.add(val);
		        } else if (array.get(0) > val) {
		            array.add(0, val);
		        } else if (array.get(size- 1) < val) {
		            array.add(size, val);
		        } else {
		            int i = 0;
		            while (array.get(i) < val) {
		                i++;
		            }
		            array.add(i, val);
		        }

		    }
		 return array;

		 } */
	 
}