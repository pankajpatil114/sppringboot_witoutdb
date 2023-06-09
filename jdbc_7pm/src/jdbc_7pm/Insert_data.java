package jdbc_7pm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert_data {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. driver loaded");
		Connection cn =DriverManager.getConnection("jdbc:mysql://localhost:3306/db_11994","root","root" );
		System.out.println("2.connection done");
     Statement st = cn.createStatement();	
	String str ="insert in to student values(3,'nisha',88)";
	int k = st.executeUpdate(str);
	System.out.println(k+"rows inserted >>");
	cn.close();
	
	}
		}


