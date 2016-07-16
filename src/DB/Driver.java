package DB;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


import ResourceManagment.HumanResource;
import ResourceManagment.Job;
import ResourceManagment.Subsystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Driver {

	private static Driver self = null;
	private File dbDescriptor = null;
	private Connection connect = null;
	public static long lastID;

	public static final String TAG_DATABASE = "database";
	public static final String TAG_TABLE = "table";
	public static final String TAG_CREATE_SUPER_USER = "creat_user";

	private static final String DB_URL = "jdbc:mysql://localhost:3306/";
	private static final String DATABASE_NAME = "simoorgh-managment-system";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "";
	private static final String COMMA_SEP = " ,\n ";



	public static Driver getInstance() {
		if (self == null) {
			System.out.println("create new driver");
			return new Driver();
		}
		System.out.println("the driver is exist");
		return self;
	}
	public Driver(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			connect = DriverManager.getConnection(DB_URL+DATABASE_NAME, USER_NAME, PASSWORD);
			System.out.println("connection stablish");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection not stablish");
		}


	}


	public void insert(String tableName,Object...args ) {

		try{
			String command = "INSERT INTO " + "`simoorgh-managment-system`.`"+tableName +"`" + " VALUES (";
			for (int i = 0; i < args.length-1; i++)
				command += " ?,";
			command += "?);";
			System.out.println(command);
			// PreparedStatements can use variables and are more efficient
			PreparedStatement statment = connect.prepareStatement(command);

			for (int i = 1; i <= args.length; i++)
				statment.setObject(i, args[i - 1]);

			System.out.println(statment.toString());
			statment.executeUpdate();




		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public long getLastID() {
		// TODO Auto-generated method stub
		return lastID;
	}
	public ResultSet getAllRows(String tableName) {
		// TODO Auto-generated method stub
		try{
			String query="select * from " + "`simoorgh-managment-system`.`"+tableName +"`;" ;
			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			ResultSet rs=statement.executeQuery(query);

			return rs;

		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;


	}
	public ResultSet getARow(String tableName , String id,String id2){
		try{
			String query="select * from " + "`simoorgh-managment-system`.`"+tableName +"`"+"where "+
					id +"='"+id2+"';" ;
			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			ResultSet rs=statement.executeQuery(query);

			return rs;

		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;

	}
	public void delete(String tableName,String column ,String value) {
		// TODO Auto-generated method stub
		try{
			String query="delete from " + "`simoorgh-managment-system`.`"+tableName +"`"+
					"where `"+column+"`="+value+";" ;
			System.out.println(query);
			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			statement.executeUpdate(query);



		}
		catch(Exception e){
			e.printStackTrace();
		}

	}
	public int countObject(String tableName) {
		// TODO Auto-generated method stub
		try{
			String q="SELECT COUNT(*) FROM "+ "`simoorgh-managment-system`.`"+tableName +"`;" ;

			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			ResultSet rs=statement.executeQuery(q);
			while(rs.next())
				return rs.getInt(1);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	public void estimate(int humanCount, int moduleCount, ArrayList<String> technology) {
		// TODO Auto-generated method stub
		try{
		String q="SELECT projectName FROM "+ "`simoorgh-managment-system`.`project` "+"where "+"humanCount="+humanCount+
				" and "+"moduleCount="+moduleCount+";" ;
		Statement statement = connect.createStatement();

		// Result set get the result of the SQL query
		ResultSet rs=statement.executeQuery(q);
		while(rs.next())
			System.out.println(rs);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}
	public ResultSet getModulesOFProject(String string) {
		// TODO Auto-generated method stub
		try{
			String q="SELECT name FROM "+ "`simoorgh-managment-system`.`module` "+"where "+"project="+string+";" ;
			Statement statement = connect.createStatement();

			// Result set get the result of the SQL query
			ResultSet rs=statement.executeQuery(q);
			
			while(rs.next())
				System.out.println(rs);
			return rs;
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			return null;
		
	}
}





