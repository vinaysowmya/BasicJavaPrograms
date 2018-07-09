package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Matrix {
	public static void main(String args[])
	{
		int rows=0,columns=0;
		System.out.println("Enter no of  rows");
		utility util=new utility();
		rows=util.inputInteger();
		System.out.println("Enter no of  columns");
		columns=util.inputInteger();
	System.out.println("Enter values");
	util.matrix(rows,columns);
	}

}
