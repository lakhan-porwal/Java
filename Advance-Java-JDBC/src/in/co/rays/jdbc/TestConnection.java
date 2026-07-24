package in.co.rays.jdbc;

import java.sql.DriverManager;

public class TestConnection {
	public static void main(String[] args) throws Exception {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		
		DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
		
		System.out.println("connection establised succesfully ");
	}

}
