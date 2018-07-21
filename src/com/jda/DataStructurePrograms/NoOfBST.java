package com.jda.DataStructurePrograms;

import com.jda.utility.utility;

public class NoOfBST {
	public static void main(String args[]) {
		utility util = new utility();
		System.out.println(" no.of cases");
		int cases=util.inputInteger();
		while(cases>0)
		{
		int num=0;
		
		System.out.println(" no.of nodes");
		num=util.inputInteger();
		long result=util.Cat(num);
		System.out.println("BST's can be formed  "+result);
		cases--;
		}
}
}
