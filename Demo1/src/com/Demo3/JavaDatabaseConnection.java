package com.Demo3;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JavaDatabaseConnection {
public static void main(String[] args) {
	
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	int prdid = 0;
	String prdname = null;
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ose","system","0000");
		System.out.println("Connection Established Successfully");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter product id:");
		prdid=sc.nextInt();
		stmt= con.createStatement();
		
		System.out.println("Enter product name:");
		prdname=sc.next();
		int rowsaffected = 0;
		rowsaffected = stmt.executeUpdate("update product set name='"+prdname+"' where id="+prdid);
		System.out.println(rowsaffected + " are updated");
		
		rs=stmt.executeQuery("select * from product");
		while(rs.next()) 
		{
			System.out.println(rs.getInt("id")+", "+rs.getString(2)+", "+rs.getInt(3));
		}
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			if(stmt!=null)
			{
				stmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
