package task3.payment.studenet;

public class Student {
	    String name;
	    int rollNo;
	    int mark;

	    Student(String name, int rollNo, int mark) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.mark = mark;
	    }

	    void display() {
	        System.out.println("Name   : " + name);
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Mark   : " + mark);
//	        System.out.println("");
	    }
	}

