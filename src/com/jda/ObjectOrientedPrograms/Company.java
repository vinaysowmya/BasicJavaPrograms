package com.jda.ObjectOrientedPrograms;

public class Company {
	public double price;
	private String name;
	private int quantity;
	public Company(String name, double price,  int quantity){
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}
	

	public void setname(String name)
	{
		this.name = name;
	}
	public void setprice(double price)
	{
		this.price = price;
	}
	public void setquantity(int quantity)
	{
		this.quantity = quantity;
	}
	public String getname()
	{
	
		return name;
	}
	public double getprice()
	{
		return price;
	}
	public int getquantity()
	{
		return quantity;
	}
	
	@Override
	public String toString(){
		//return String.format(" + "\"No of Shares +" + quantity,name,price,quantity);
		return "{" + "\"name\":\"" + name + ",\"" + "\"noofshare\":\"" + quantity + ",\"shareprice\":\"" + price + "}";
	}
	

}
