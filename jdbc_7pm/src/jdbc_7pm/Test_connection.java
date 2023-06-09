package jdbc_7pm;

import java.sql.DriverManager;

public class Test_connection {
public static void main(String arg[]) throws Exception {
Class.forName("com.mysql.jdbc.Driver");
System.out.println("1. driver loaded");
DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" );
System.out.println("2.connection done");
}
}
