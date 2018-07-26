package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;







import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jda.utility.utility;

public class StockAccount {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
	JSONParser parser=new JSONParser ();
	Object obj=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Customer.JSON"));
	 JSONObject jsonObject = (JSONObject) obj;
	
	// System.out.println("Stock Report:");
	 JSONArray Customer = (JSONArray) jsonObject.get("CUSTOMER");
	 Object obj1=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Stock.JSON"));
	 JSONObject jsonObject1 = (JSONObject) obj1;
	 JSONArray Stock = (JSONArray) jsonObject1.get("STOCK"); 
	 
	/* ObjectMapper mapper = new ObjectMapper();

     // read JSON from a file
     Map<String, Object> stock = mapper.readValue(new File(
             "C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Stock.JSON"),
             new TypeReference<Map<String, Object>>(){});
     
     System.out.println(stock.get("No of Shares"));
     
    ObjectMapper mapper1 = new ObjectMapper();

     // read JSON from a file
     Map<String, Object> customer = mapper1.readValue(new File(
             "C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/Customer.JSON"),
             new TypeReference<Map<String, Object>>(){});
     System.out.println(stock.get("Customer Name"));  */
	// System.out.println(Customer.get(1));
	 int size=Customer.size();
	 String amt=null;
	 utility util=new utility();
	 System.out.println("Enter the person");
	 String str=util.inputString();
	// Customer cus=new Customer();
	 for(int i=0;i<size;i++)
	 {
		 JSONObject jsonObject2 = (JSONObject) obj;
		 jsonObject2=(JSONObject) Customer.get(i);
		 String n= (String) jsonObject2.get("Customer Name");
		// System.out.println(n);
		 if(n.equals(str))
		 {
		  amt=(String) jsonObject2.get("Amount");
		 }
		 
	 }
	// System.out.println(Integer.parseInt(amnt));
	
	
	 int size1=Stock.size();
	 String prices=null;
	 String numb=null;
	// utility util=new utility();
	 System.out.println("Enter the company name");
	 String str1=util.inputString();
	// Customer cus=new Customer();
	 for(int i=0;i<size1;i++)
	 {
		 JSONObject jsonObject2 = (JSONObject) obj;
		 jsonObject2=(JSONObject) Stock.get(i);
		 String n= (String) jsonObject2.get("Stock Name");
		// System.out.println(n);
		 if(n.equals(str1))
		 {
		  prices=(String) jsonObject2.get("Stock Price");
		  numb=(String) jsonObject2.get("No of Shares");
		 }
		 
	 }
	 int amnt=Integer.parseInt(amt);
	 int price=Integer.parseInt(prices);
	 int num=Integer.parseInt(numb);
	 int shares=0;
	 System.out.println("Enter no of shares u want to buy");
	 int shares1=util.inputInteger();
	 int fnl=0;
	// System.out.println(Integer.parseInt(amnt));
	 if(amnt>=price)
	 {
		
		  shares=amnt/price;
		  if(shares>shares1)
		  {
			  amnt=(amnt-(shares1*price));
			  fnl=shares1;
		  }
		  else
		  { amnt=(amnt-(shares*price));
			  fnl=shares;
		  }
		
		 }
	 
	 else
	 {
		 System.out.println("U can't invest");
	 }
	 System.out.println("no of shares" +fnl);
	 System.out.println("Final amount" +amnt);
	}

}
