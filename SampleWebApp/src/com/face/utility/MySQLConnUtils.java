package com.face.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnUtils {
	static Connection conn=null;
	public static Properties loadPropertiesFile() throws IOException {
		Properties prop =new Properties();
		InputStream in=new FileInputStream("C:\\Users\\user_2\\eclipse-workspace\\SampleWebApp\\resources\\jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
		}
public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
	Properties prop=loadPropertiesFile();
	final String driver=prop.getProperty("driver");
	final String url=prop.getProperty("url");
	final String Username=prop.getProperty("Username");
	final String Password=prop.getProperty("Password");
	try {
		Class.forName(driver);
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
		throw e;
	}
	try {
		conn=DriverManager.getConnection(url,Username,Password);
	} catch (SQLException e) {
		System.out.println("Connection Failed! check output console");
		e.printStackTrace();
		throw e;
	}
	
	
			return conn;
	}
	
}
