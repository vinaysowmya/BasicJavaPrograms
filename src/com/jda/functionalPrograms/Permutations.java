package com.jda.functionalPrograms;

import com.jda.utility.utility;

public class Permutations {
	public static void main(String args[])
	{
		utility util=new utility();
		String str=util.inputString();
		int lngth=str.length();
		int fst=0;
		int lst=lngth-1;
		util.permute(str,fst,lst);
	}

}
