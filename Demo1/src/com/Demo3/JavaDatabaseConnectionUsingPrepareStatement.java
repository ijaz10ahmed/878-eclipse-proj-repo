package com.Demo3;
import java.sql.*;

public class JavaDatabaseConnectionUsingPrepareStatement {
public static void main(String[] args) {
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs1 = null;
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ose","system","0000");
		System.out.println("Connection Established Successfully");

		pstmt= con.prepareStatement("insert into employee values(?,?,?)");
		
		pstmt.setInt(1,1);
		pstmt.setString(2,"arun");
		pstmt.setInt(3,2500);
		pstmt.execute();
		
		pstmt.setInt(1,2);
		pstmt.setString(2,"tharun");
		pstmt.setInt(3,3000);
		pstmt.execute();
		
		pstmt.setInt(1,3);
		pstmt.setString(2,"varun");
		pstmt.setInt(3,2800);
		pstmt.execute();
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally
	{
		try {
			if(pstmt!=null)
			{
				pstmt.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
}
