package databaseCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JDBCMySqlConnection {
	public static void main(String[] args) {
		   try {
		
			   Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecpliseddbc", "root", "root");//Establishing connection
			   System.out.println("Connected With the database successfully");
			   Statement createTable=connection.createStatement();
				createTable.execute("create table studentDetails(stud_id INTEGER,stud_name VARCHAR(15),stud_age INTEGER,stud_address VARCHAR(50))");
				createTable.execute("insert into studentDetails values(1,'leo',25,'tharamani')");
				System.out.println("data store successfully");
				
				ResultSet retrivedata=createTable.executeQuery("select * from studentDetails");
				while(retrivedata.next()) {
					int id=retrivedata.getInt("stud_id");
					String name=retrivedata.getString(2);
					int age=retrivedata.getInt("stud_age");
					String address=retrivedata.getString(4);
					
					System.out.println("id:"+id+"\nname :"+name+"\nage :"+age+"\naddress :"+address);
				}
		
		} catch (SQLException e) {
		System.out.println("Error while connecting to the database");
		}}
}
