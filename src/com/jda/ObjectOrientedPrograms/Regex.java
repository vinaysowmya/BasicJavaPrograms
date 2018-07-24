package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.utility;

public class Regex {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/File2.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 String str=(String)jsonObject.get("DATA");
		 String delimiter =  " ";
	     //   Pattern pattern = Pattern.compile(delimiter,
	       //                                 Pattern.CASE_INSENSITIVE);
	 
	        // Used to perform case insensitive search of the string
	     //   String[] result = pattern.split(str);
	       
	       
	        utility util=new utility();
	        
	        System.out.println("Enter your name");
	        Pattern pattern = Pattern.compile("<<name>>");
	        Matcher mtch = pattern.matcher(str);
	        String name=util.inputString();
	       String rslt= mtch.replaceAll(name);
	       
	       Pattern pattern1 = Pattern.compile("<<full name>>");
	        Matcher mtch1 = pattern1.matcher(rslt);
	       System.out.println("Enter your  full name");
	        String fullname=util.inputString();
	       String rslt1= mtch1.replaceAll(fullname);
	       
	       Pattern pattern2 = Pattern.compile("91xxxxxxxxxx");
	        Matcher mtch2 = pattern2.matcher(rslt1);
	       System.out.println("Enter your mobile number");
	        String number=util.inputString();
	       String rslt2= mtch2.replaceAll(number);
	     //  System.out.println(rslt2);
	       
	       Pattern pattern3 = Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
	        Matcher mtch3 = pattern3.matcher(rslt2);
	       System.out.println("Enter date");
	        String date=util.inputString();
	       String rslt3= mtch3.replaceAll(date);
	        System.out.println(rslt3);
	       
	    /*    while (mtch.find())
	        {
	        	//String replacedString=template.replaceAll("<<username>>",inputString);
	        	 System.out.println("Pattern found from " + mtch.start() +
                         " to " + (mtch.end()-1));
	        } */
	       
	        	 
	            
	             
	           		
		
	}

}
