package task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Productinsert {
String createdb="create database shopping_db";
String create="create table shopping_db.product("
		+ "product_id int primary key,"
		+ "product_name varchar(100),"+
		"price double,"
		+ "quantity int"
		+ ")";
Dbconnection call= new Dbconnection();
Connection conn=call.dbconnection();
Scanner sc = new Scanner(System.in);

public void createdatabase(){
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(createdb);
		System.out.println("shopping database is creatd");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

public void createtable(){
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(create);
		System.out.println("product table is created");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

String insert="insert into shopping_db.product(product_id,product_name,price,quantity) values(?,?,?,?)";
public void insertproduct(){

	System.out.println("---Add Product details---");
	System.out.println("Enter product id");
	int productid=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter product name");
	String productname=sc.nextLine();
	System.out.println("Enter product price");
	double price=sc.nextDouble();
	System.out.println("Enter your quantity");
	int quantity=sc.nextInt();
	sc.nextLine();
	try {
		PreparedStatement ps=conn.prepareStatement(insert);
		ps.setInt(1, productid);
		ps.setString(2, productname);
		ps.setDouble(3, price);
		ps.setInt(4, quantity);
		int row=ps.executeUpdate();
		if(row==1){
			System.out.println("Product added successfully");
		}
	} catch (SQLException e){
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}

}

}