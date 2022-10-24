package com.dbutil;

import java.sql.*;

public class DBConnection {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		
		final String USERNAME = "root";
		final String PASSWORD = "1234";
		final String URL = "jdbc:mysql://localhost:3306/rms_db?useSSL=false";
		
		try {
			Connection myCon = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connection Successful...!");
            
            //Statement insertS = myCon.createStatement();
            
            //String customers = "INSERT INTO `rms_db`.`customers`(customer_id,`customer_name`,`gender`,`email`,`mobile`,`address`) VALUES(\"03\", \"NJ\", \"Male\", \"nj@email.com\", 9876543210, \"No.1, Nethagi nagar, Kulithalai, karur-639001\")";
            
            //insertS.addBatch(customers);
            
            //String menu = "INSERT INTO `rms_db`.`menu`(`product_id`,`product_name`,`price`) VALUES(\"05\",\"Fried Rice\",12.50)";
            
            //insertS.addBatch(menu);
            
            //String members = "INSERT INTO `rms_db`.`members`(`customer_id`,`join_date`) VALUES(\"05\", now())";
            
            //insertS.addBatch(members);
            
            //String sales = "INSERT INTO `rms_db`.`sales`(`customer_id`,`order_date`,`product_id`) VALUES(\"01\",curdate(),\"01\")";
            
            //insertS.addBatch(sales);
            
            //insertS.executeBatch();
            
//            Statement procedureStatement = myCon.createStatement();
//            
//            String dropQuery = "DROP PROCEDURE IF EXISTS RMS_DB.CREATE_TABLE;";
//            
//            String createQuery = "CREATE PROCEDURE rms_db.create_table()\r\n"
//            		+ "begin\r\n"
//            		+ "	CREATE TABLE IF NOT EXISTS DEPARTMENT(\r\n"
//            		+ "		DEPARTMENT_ID DECIMAL(4,0) NOT NULL DEFAULT 0,\r\n"
//            		+ "		DEPARTMENT_NAME VARCHAR(30) NOT NULL DEFAULT 'NULL',\r\n"
//            		+ "		MANAGER_ID DECIMAL(6,0) NOT NULL DEFAULT 0,\r\n"
//            		+ "		LOCATION_ID DECIMAL(4,0) NOT NULL DEFAULT 0,\r\n"
//            		+ "		PRIMARY KEY(DEPARTMENT_ID,MANAGER_ID)\r\n"
//            		+ "	);\r\n"
//            		+ "END";
//            
//            procedureStatement.execute(dropQuery);
//            
//            System.out.println("Dropped existing procedures");
//            
//            procedureStatement.execute(createQuery);
//            
//            System.out.println("Procedure Created in DB");
            
            myCon.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
	public DBConnection() {
		
	}

}
