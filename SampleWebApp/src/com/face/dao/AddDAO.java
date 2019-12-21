package com.face.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.face.bo.AddBO;
import com.mysql.jdbc.Connection;

public class AddDAO {



	public static void save(Connection conn, AddBO abo) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement st=conn.createStatement();
		String query="insert into productlist values('"+abo.getProductid()+"','"+abo.getProductname()+"')";
		int result=st.executeUpdate(query);
		if(result==1) {
			System.out.println("Data inserted successfully");
		}
		else {
			System.out.println("Inserted Failed");
		}
		
	
		
	}

	public static ArrayList list(Connection conn, List list) throws SQLException {
		// TODO Auto-generated method stub
		Statement st=conn.createStatement();
		String query="select*from productlist";
		ResultSet rs=st.executeQuery(query);
		if(rs.next()) {
			do {
				System.out.println();
			}while(rs.next());
		}
		else {
			System.out.println("Records are not Found");
			
		}
		return null;
	}

}
