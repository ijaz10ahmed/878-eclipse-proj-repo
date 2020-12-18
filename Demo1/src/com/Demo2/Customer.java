package com.Demo2;

public class Customer {
	private String name;
	private String contactno;
	private Address addobj;
	public Customer(String name, String contactno, Address addobj) {
		this.name = name;
		this.contactno = contactno;
		this.addobj = addobj;
}
void displaydetails()
{
	System.out.println("name "+name);
	System.out.println("contactno "+contactno);
	System.out.println("roadname "+addobj.getRoadname());
	System.out.println("Buildingname "+addobj.getBuildingname());
	System.out.println("Pincode "+addobj.getPincode());
	System.out.println("city "+addobj.getCity());
}
}