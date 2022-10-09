package com.dbutil;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
		final String USERNAME = "root";
		final String PASSWORD = "1234";
		final String URL = "jdbc:mysql://localhost:3306/rms_db?useSSL=false";
		
		try {
			System.out.println("Connecting to database :" +URL);
            Connection myCon = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            System.out.println("Connection Successful...!");
            //Statement insertS = myCon.createStatement();
            
            //String customers = "INSERT INTO `rms_db`.`customers`(customer_id,`customer_name`,`gender`,`email`,`mobile`,`address`) VALUES(\"03\", \"NJ\", \"Male\", \"nj@email.com\", 9876543210, \"No.1, Nethagi nagar, Kulithalai, karur-639001\")";
            
            //insertS.addBatch(customers);
            
            //String menu = "INSERT INTO `rms_db`.`menu`(`product_id`,`product_name`,`price`) VALUES(\"04\",\"Burger\",7.50)";
            
            //insertS.addBatch(menu);
            
            //String members = "INSERT INTO `rms_db`.`members`(`customer_id`,`join_date`) VALUES(\"05\", now())";
            
            //insertS.addBatch(members);
            
            //String sales = "INSERT INTO `rms_db`.`sales`(`customer_id`,`order_date`,`product_id`) VALUES(\"01\",curdate(),\"01\")";
            
            //insertS.addBatch(sales);
            
            //insertS.executeBatch();

            myCon.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
		
	}

}
