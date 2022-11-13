package data.access.exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DatabaseUtility implements DatabaseAccessor {

	@Override
	public String[] ExecuteSingleColumn(String sql) {
		try (Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","password");
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql);) {
				
				while(myRs.next()) {
					System.out.println(myRs.getString("title") | myRs.getString("inventory_id"));
				}
			}
			catch(Exception exc){
				exc.printStackTrace();
			}
				return null;
	}

	@Override
	public String ExecuteSingleCell(String sql) {
		
		try (Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","password");
				Statement myStmt = myConn.createStatement();
				ResultSet myRs = myStmt.executeQuery(sql);) {
				
				return myRs.getString("HighestPayment");
				while(myRs.next()) {
					System.out.println(myRs.getString("HighestPayment"));
				
				}
			}
			catch(Exception exc){
				exc.printStackTrace();
			}
			
			return result;
	}

	@Override
	public DataRow[] Execute(String sql) {
		try (Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","password");
			Statement myStmt = myConn.createStatement();
			ResultSet myRs = myStmt.executeQuery(sql);) {
			
			while(myRs.next()) {
				System.out.println(myRs.getString("city"));
			}
		}
		catch(Exception exc){
			exc.printStackTrace();
		}
		
		return null;
	}

}
