package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlTest {

	public static void main(String[] args) {
		try {
			// Step 1: Establish the Connection b/w JavaPgm to MySql
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon","root","root");
			System.out.println(con.isClosed());

			// Step 2: Create the Statement Object to Pass Sqlquery to db server
			Statement st = con.createStatement();

			// Step 3: Execute Query and store the results into a ResultSet
			ResultSet rs = null;

	        int a = st.executeUpdate("drop table Customers");
	        System.out.println(a);
	        //Process or execute the sql query which is passing to db
	        int i=st.executeUpdate("create table Customers(id int,name char(10), address varchar(50))");
	        System.out.println(i);
	        int j = st.executeUpdate("insert into Customers values(111, 'Naresh', 'Kphb'), (333, 'Kalpana', 'Bangalore')");
	        System.out.println(j);
	        rs = st.executeQuery("select * from Customers");

			while(rs.next()){
				int custID = rs.getInt("id");
				String name = rs.getString("name");
				String address = rs.getString("Address");
				System.out.println(custID + " " + name + " " + address);
			}
			st.close();
			con.close();
			System.out.println(con.isClosed());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
