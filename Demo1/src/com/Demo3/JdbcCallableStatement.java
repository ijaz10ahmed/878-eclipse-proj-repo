package com.Demo3;
import java.sql.*;
//public class JdbcCallableStatement {
//public static void main(String[] args) {
	/*	
		Connection con = null;
		Statement pstmt = null;
		ResultSet rs1 = null;
		int eid = 0;
		String ename = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ose","system","0000");
			System.out.println("Connection Established Successfully");

			pstmt= con.prepareStatement("insert into employee values(?,?,?)");
			
			pstmt.setInt(1,101);
			pstmt.setString(2,"arun");
			pstmt.setInt(3,25000);
			pstmt.execute();
			
			pstmt.setInt(1,102);
			pstmt.setString(2,"tharun");
			pstmt.setInt(3,30000);
			pstmt.execute();
			
			pstmt.setInt(1,103);
			pstmt.setString(2,"varun");
			pstmt.setInt(3,28000);
			pstmt.execute();
			
			rs1=pstmt.executeQuery("select * from employee");
			while(rs1.next()) 
			{
				System.out.println(rs1.getInt(1)+", "+rs1.getString(2)+", "+rs1.getInt(3));
			}
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
	}*/



