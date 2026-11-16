package task7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentinsert studentinsert= new Studentinsert();
		Employeeinsert employeeinsert= new Employeeinsert();
		Productinsert productinsert= new Productinsert();

		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("--Task7 portal--");
			System.out.println("1.create college_db");
			System.out.println("2.create student table");
			System.out.println("3.insert 3 students");
			System.out.println("4.create company_db");
			System.out.println("5.create employee table");
			System.out.println("6.insert 3 employees");
			System.out.println("7.create shopping_db");
			System.out.println("8.create product table");
			System.out.println("9.insert product");
			System.out.println("0.exit");
			System.out.print("Enter your Option:");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				studentinsert.createdatabase();
				break;
			case 2:
				studentinsert.createtable();
				break;
			case 3:
				studentinsert.insertstudent();
				break;
			case 4:
				employeeinsert.createdatabase();
				break;
			case 5:
				employeeinsert.createtable();
				break;
			case 6:
				employeeinsert.insertemployee();
				break;
			case 7:
				productinsert.createdatabase();
				break;
			case 8:
				productinsert.createtable();
				break;
			case 9:
				productinsert.insertproduct();
				break;
			case 0:
				System.out.println("exit ...");
				break;
				default:
					System.out.println("incorrect option");

			}

		}while(choice!=0);

	}

}