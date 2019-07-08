package com.jda.DataStructurePrograms;

import com.jda.utility.utility;

public class Calender {
	public static void main(String args[]) {

		utility util = new utility();
		System.out.println("Enter month");
		int month =util.inputInteger();
		System.out.println("Enter year");
		int year =util.inputInteger();

		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
		"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && util.leapyear(year))
		days[month] = 29;
		System.out.print(" "+months[month] + " " + year);
		System.out.println();
		System.out.print("  S  M Tu  W Th  F  S");
		System.out.println();
		int [][]arr=new int[6][7];
		int d = util.day(1, month, year);
		int count=1;
		for(int i=0;i<6;i++)
		{
		for(int j=0;j<7;j++)
		{
		if(i==0&&j<d)
		arr[i][j]=0;
		else
		{if(count<=days[month])
		{
		arr[i][j]=count;
		count++;
		}
		else
		arr[i][j]=0;
		}

		}

		}
		for(int i=0;i<6;i++)
		{
		for(int j=0;j<7;j++)
		{if(arr[i][j]<=9)
		{if(arr[i][j]==0)
		System.out.print("   ");
		else
		System.out.print("  "+arr[i][j]);
		}
		else
		System.out.print(" "+arr[i][j]);
		}
		System.out.println();
		}
	}

}
