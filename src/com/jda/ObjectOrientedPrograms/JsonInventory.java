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

public class JsonInventory {
	public static void main(String args[]) throws ParseException, FileNotFoundException, IOException
	{
		JSONParser parser=new JSONParser ();
		Object obj=parser.parse(new FileReader("C:/practise/BasicJavaPrograms/src/com/jda/ObjectOrientedPrograms/File1.JSON"));
		 JSONObject jsonObject = (JSONObject) obj;
		 String str=(String)jsonObject.get("NAME");
		 System.out.println(str);
		 
		 String wt = null;
		 int amnt = 0;
		
		 System.out.println("Rice:");
		 JSONArray Rice = (JSONArray) jsonObject.get("Rice");
		 Iterator<Map.Entry> itr1 ;
			Iterator itr11 = Rice.iterator();
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
	            if((pair.getKey()).equals("Weight"))
	            {
	            	wt=(String) pair.getValue();
	            	// System.out.println(wt);
	            }
	           
	            if((pair.getKey()).equals("pricePerKg"))
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
          	
	            System.out.println(pair.getKey() + " : " + pair.getValue());
	           
	        }
	        System.out.println("Amount till now " +amnt);
		     }
	        System.out.println("\nPulses:");
	        
	    //    Map Pulses = ((Map)jsonObject.get("Pulses"));
	        
	        JSONArray Pulses = (JSONArray) jsonObject.get("Pulses");
			 Iterator<Map.Entry> itr2 ;
				Iterator itr22 = Pulses.iterator();
	         
	        // iterating address Map
	        String wt2=null,wt3=null;
	      //  Iterator<Map.Entry>
	        while (itr22.hasNext()) 
		     {
		         itr2 = ((Map) itr22.next()).entrySet().iterator();
		         int a=0;
	        while (itr2.hasNext()) {
	            Map.Entry pair = itr2.next();
	            if((pair.getKey()).equals("Weight"))
	            {
	            	wt2=(String) pair.getValue();
	            	//System.out.println(wt2);
	            }
	            if((pair.getKey()).equals("pricePerKg"))
	            {
	            	String val=(String) pair.getValue();
	            //	System.out.println(val);
	            	
	            	//System.out.println(w2);
	            	 a=Integer.parseInt(val);
	            	//System.out.println(a);
	            	
	            }
	            int w2=Integer.parseInt(wt2);
	            int b=w2*a;;
            	//System.out.println(b);
            
            	amnt=amnt+b;
            	
	            System.out.println(pair.getKey() + " : " + pair.getValue());
	           
	        }
	        System.out.println("Amount till now " +amnt);
		     }

	        System.out.println("\nWheat:");
	        JSONArray Wheat = (JSONArray) jsonObject.get("Wheat");
			 Iterator<Map.Entry> itr3 ;
				Iterator itr33 = Wheat.iterator();
	         
	        // iterating address Map
	      //  String wt2=null,wt3=null;
	      //  Iterator<Map.Entry>
	        while (itr33.hasNext()) 
		     {
		         itr3 = ((Map) itr33.next()).entrySet().iterator();
		         int a=0;
	        while (itr3.hasNext()) {
	            Map.Entry pair = itr3.next();
	            if((pair.getKey()).equals("Weight"))
	            {
	            	wt3=(String) pair.getValue();
	            }
	            if((pair.getKey()).equals("pricePerKg"))
	            {
	            	String val=(String) pair.getValue();
	            //	System.out.println(val);
	            	
	            //	System.out.println(w);
	            	a=Integer.parseInt(val);
	            //	System.out.println(a);
	            	
	            }
	            int w=Integer.parseInt(wt3);
	            int b=w*a;;
            	//System.out.println(b);
            
            	amnt=amnt+b;
            	//amnt=amnt+(w*a);
            	
	            System.out.println(pair.getKey() + " : " + pair.getValue());
	           
	        }
	        System.out.println("Total Amount " +amnt);
		     }

		
	}

}
