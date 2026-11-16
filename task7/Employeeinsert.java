package task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employeeinsert {
String createdb="create database company_db";
String create="create table company_db.employee("
		+ "emp_id int primary key,"
		+ "emp_name varchar(50),"+
		"salary double,"
		+ "department varchar(50)"
		+ ")";
Dbconnection call= new Dbconnection();
Connection conn=call.dbconnection();
Scanner sc = new Scanner(System.in);

public void createdatabase(){
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(createdb);
		System.out.println("company database is creatd");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

public void createtable(){
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(create);
		System.out.println("employee table is created");
	} catch (SQLException e){
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

String insert="insert into company_db.employee(emp_id,emp_name,salary,department) values(?,?,?,?)";
public void insertemployee(){

	System.out.println("---Add 3 employee details---");
	for(int i=1;i<=3;i++){
	System.out.println("Enter employee "+i+" id");
	int empid=sc.nextInt();
	sc.nextLine();
	System.out.println("Enter employee name");
	String empname=sc.nextLine();
	System.out.println("Enter salary");
	double salary=sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter department");
	String department=sc.nextLine();
	try {
		PreparedStatement ps=conn.prepareStatement(insert);
		ps.setInt(1, empid);
		ps.setString(2, empname);
		ps.setDouble(3, salary);
		ps.setString(4, department);
		int row=ps.executeUpdate();
		if(row==1) {
			System.out.println("employee inserted successfull");
			System.out.println("employee id:"+empid+",employee name:"+empname);
		}
	} catch (SQLException e){
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
	}
	}

}

}