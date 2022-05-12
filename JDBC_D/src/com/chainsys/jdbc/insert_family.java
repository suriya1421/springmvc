package com.chainsys.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insert_family {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		try {
			Statement stat=con.createStatement();
			//int fam=stat.executeUpdate("insert into family values ('siva',5,23,'female')");
			//int fam1 =stat.executeUpdate("update family set name='pandi' where id=4");
			//int fam1 =stat.executeUpdate("delete  family where id=4");
			System.out.println("successfully updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
