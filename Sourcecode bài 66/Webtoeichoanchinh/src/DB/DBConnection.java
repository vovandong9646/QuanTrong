package DB;

import java.sql.*;

public class DBConnection 
{
	public static Connection CreateConnection()
	{
		Connection conn = null;
		
		//String url = "jdbc:mysql://localhost:3306/toeicmyclass?useUnicode=true&amp;characterEncoding=utf8";
		//String username = "root";
		//String password = "1234";
		
		String url = "jdbc:mysql://localhost:3306/toeicmyclass?useUnicode=true&amp;characterEncoding=utf8";
		String username = "root";
		String password = "root";
		
		try 
		{
			//load driver
			Class.forName("com.mysql.jdbc.Driver");
			//create connection
			conn = DriverManager.getConnection(url,username,password);
			System.out.println("ket noi thanh cong");
			
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("ket noi that bai");
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			System.out.println("ket noi that bai");
			e.printStackTrace();
		}	
		return conn;
	}

	public static void main(String[] args) {
		Connection c = DBConnection.CreateConnection();
		if(c!=null) {
			System.out.println("thanh cong");
		}else {
			System.out.println("that bai");
		}
	}
}


