package app.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnector {
	
	
	
	Connection conn;
	public static void main(String[] args) {
		DBconnector test = new DBconnector();
		test.connInit();
	}
	
	public DBconnector() {
	try {
	Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("Nie zarejestrowano klasy sterownika!");
	}

	}
	
	 public Connection connInit() {
		 String url = "jdbc:mysql://localhost:3306/chmura";
		 String user = "root";
		 String pass = "***";				 
		 try {
		 conn = DriverManager.getConnection(url,user,pass);
		 } catch (SQLException e){
			 System.out.println("Nie mogê ustanowiæ po³¹czenia");
		 }
		 return conn;
		 
	 
	 }
}
