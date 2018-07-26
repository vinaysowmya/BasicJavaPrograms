package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccount {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
	JSONParser parser=new JSONParser ();
	Object obj=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Customer.JSON"));
	 JSONObject jsonObject = (JSONObject) obj;
	 
	 String wt = null;
	 int amnt = 0;
	
	// System.out.println("Stock Report:");
	 JSONArray Customer = (JSONArray) jsonObject.get("CUSTOMER");
	 Object obj1=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Stock.JSON"));
	 JSONObject jsonObject1 = (JSONObject) obj1;
	 
	// String wt = null;
	// int amnt = 0;
	
	// System.out.println("Stock Report:");
	 JSONArray Stock = (JSONArray) jsonObject.get("STOCK");
	}

}
