package com.jda.ObjectOrientedPrograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockReport {
	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException
	{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/File3.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 
		 String wt = null;
		 int amnt = 0;
		
		 System.out.println("Stock Report:");
		 JSONArray Stock = (JSONArray) jsonObject.get("STOCK");
		 Iterator<Map.Entry> itr1 ;
			Iterator itr11 = Stock.iterator();
			int totalPrice =0;
			int price =0;
			
			while (itr11.hasNext()) 
		     {
		         itr1 = ((Map) itr11.next()).entrySet().iterator();
		// Map Rice = ((Map)jsonObject.get("Rice"));
         
	        // iterating address Map
	      //  Iterator<Map.Entry> itr1 = Rice.entrySet().iterator();
		         int a=0;
	        while (itr1.hasNext()) {
	            Map.Entry pair = itr1.next();
	            if((pair.getKey()).equals("No of Shares"))
	            {
	            	wt=(String) pair.getValue();
	            	// System.out.println(wt);
	            }
	           
	            if((pair.getKey()).equals("Stock Price"))
	            {
	            	String val=(String) pair.getValue();
	            //	System.out.println(val);
	            
	            	//System.out.println(w);
	            	 a=Integer.parseInt(val);
	            	//System.out.println(a);
	            	
	            }
	        	int w=Integer.parseInt(wt);
	        	int b=w*a;
         //   	System.out.println(b);
            
            	amnt=amnt+b;
            	
          	
	           // System.out.println(pair.getKey() + " : " + pair.getValue());
	           
	        }
	        System.out.println("Stocks Price till now " +amnt);
	       
		     }
			 System.out.println("Total Stocks Price " +amnt);
	}

}
