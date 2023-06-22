package com.tns.jdbcTask;
/* store procedure
 *  create or replace procedure addProc(num1 IN number,num2 IN number,num3 OUT number) as 
 *  BEGIN
 *  num3 :=num1+num2;
 *  END;*/
import java.sql.*;
public class CallProc {
    public static void main(String[] args) {
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://10.0.2.134:3306/?user=akashk","akashk","Akash@SQL_DB");
			CallableStatement cstmt=con.prepareCall("{call addProC(?,?,?)}");
			cstmt.setInt(1, 100);
			cstmt.setInt(2, 200);
			cstmt.registerOutParameter(3, Types.INTEGER);
			cstmt.execute();
			int result=cstmt.getInt(3);
			System.out.println("RESULT: "+cstmt.getInt(3));
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
