package com.jda.functionalPrograms;


import com.jda.utility.utility;

public class ReplaceString {
	public static void main(String args[] )
	{
	//	Scanner S=new Scanner(System.in);
	//	String inputString=S.nextLine();
		utility utility=new utility();
		String inputString=utility.inputString();
		String template="Hello<<username>>,How are you?";
		String replacedString=utility.replaceString(template,inputString);
		System.out.println(replacedString);
	//	S.close();
	}

}
