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

import com.jda.utility.utility;

public class Customer {
	
		public long mobileno;
		private String name;
		private int amount;
		public Customer(String name, long mobileno,  int amount){
			this.mobileno = mobileno;
			this.name = name;
			this.amount = amount;
		}
		

		public void setname(String name)
		{
			this.name = name;
		}
		public void setprice(long mobileno)
		{
			this.mobileno = mobileno;
		}
		public void setquantity(int amount)
		{
			this.amount = amount;
		}
		public String getname()
		{
		
			return name;
		}
		public double getmobileno()
		{
			return mobileno;
		}
		public int getamount()
		{
			return amount;
		}
		
		@Override
		public String toString(){
			//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
			return "{" + "\"name\":\"" + name + ",\"" + "\"mobileno\":\"" + mobileno + ",\"amount\":\"" + amount + "}";
		}
		
	
		

}
