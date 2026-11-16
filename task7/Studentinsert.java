package task7;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Studentinsert {
String createdb="create database college_db";
String create="create table college_db.student("
		+ "id int primary key,"
		+ "name varchar(50),"+
		"age int,"
		+ "course varchar(50)"
		+ ")";
Dbconnection call= new Dbconnection();
Connection conn=call.dbconnection();

public void createdatabase() {
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(createdb);
		System.out.println("college database is creatd");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

public void createtable() {
	try {
		Statement st=conn.createStatement();
		st.executeUpdate(create);
		System.out.println("student table is created");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
	System.out.println("error:"+e.getMessage());
	}
}

String insert="insert into college_db.student(id,name,age,course) values(?,?,?,?)";
public void insertstudent() {

	int ids[]= {1,2,3};
	String names[]= {"sowmiya","surya","varma"};
	int ages[]= {20,21,19};
	String courses[]= {"java","python","sql"};

	try {
		PreparedStatement ps=conn.prepareStatement(insert);
		for(int i=0;i<3;i++) {
		ps.setInt(1, ids[i]);
		ps.setString(2, names[i]);
		ps.setInt(3, ages[i]);
		ps.setString(4, courses[i]);
		int row=ps.executeUpdate();// 1
		if(row==1) {
			System.out.println("Student inserted successfully");
		}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}

}

}