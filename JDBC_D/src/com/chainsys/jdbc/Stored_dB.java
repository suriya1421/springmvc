package com.chainsys.jdbc;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
	public class Stored_dB {
		   public static void main(String[] args) {
		      try {
		          Class.forName("oracle.jdbc.driver.OracleDriver");
		          Connection myCon = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		          PreparedStatement ps = myCon.prepareStatement("insert into FileTable values(?,?)");
		          File f = new File("D:\\JavaProjects\\Records.txt");
		          FileReader fr = new FileReader(f);
		          ps.setInt(1, 101);
		          ps.setCharacterStream(2, fr,(int)f.length());
		          int i = ps.executeUpdate();
		          System.out.println(i + " " + "record affected");
		          myCon.close();
		      }catch(Exception err) {
		          err.printStackTrace();
		      }
		}
		}


