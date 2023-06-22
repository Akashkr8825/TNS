package com.tns.jdbcTask;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Add {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cstmt=null;
		String qry="insert into employee.emp values(?,?,?)";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://10.0.2.134:3306/?user=akashk","akashk","Akash@SQL_DB");
			cstmt= con.prepareCall(qry);
			
			cstmt.setInt(1, 11);
			cstmt.setString(2, "sandy");
			cstmt.setString(3, "EEE");
			
			cstmt.execute();
			cstmt.close();
			con.close();
			
			System.out.println("record added successfully!!!!");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
