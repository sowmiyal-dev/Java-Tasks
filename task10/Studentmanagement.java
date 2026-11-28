package task10;

import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Collections;

public class Studentmanagement {

    public static void main(String[] args) {

    	//ArrayList – Store all registered student names.
        ArrayList<String> students = new ArrayList<>();
        students.add("Sowmiya");
        students.add("Surya");
        students.add("Varma");
        students.add("Logu");

        System.out.println("Student List:"+students);


      //Deque – Manage students waiting for exam registration.
        Deque<String> registration = new ArrayDeque<>();

        registration.addFirst("Sowmiya");
        registration.addLast("Surya");
        registration.addFirst("Varma");

        System.out.println("Registration Waiting:"+registration);


      //HashMap – Store student ID and marks.
        HashMap<Integer, Integer> marks = new HashMap<>();
        marks.put(101, 85);
        marks.put(102, 90);
        marks.put(103, 75);
        marks.put(104, 95);

        System.out.println("Student Marks:"+marks);


      //PriorityQueue – Display students based on highest marks.
        PriorityQueue<Integer> ranking = new PriorityQueue<>(Collections.reverseOrder());
        ranking.add(85);
        ranking.add(90);
        ranking.add(75);
        ranking.add(95);

        System.out.println("Student Ranking:");

        while (!ranking.isEmpty()) {
            System.out.println(ranking.poll());

        }


      //HashSet – Store unique student email IDs.
        HashSet<String> email = new HashSet<>();
        email.add("sowmi@gmail.com");
        email.add("surya@gmail.com");
        email.add("varma@gmail.com");
        email.add("sowmi@gmail.com");

        System.out.println("Student Emails:"+email);


      //Stack – Track the recently entered student records.
        Stack<String> records = new Stack<>();
        records.push("Sowmiya");
        records.push("Surya");
        records.push("Varma");

        System.out.println("Student Records:"+records);
        System.out.println("Recently Entered:"+records.pop());


      //TreeSet – Store student roll numbers in sorted order.
        TreeSet<Integer> rollno = new TreeSet<>();
        rollno.add(103);
        rollno.add(101);
        rollno.add(104);
        rollno.add(102);

        System.out.println("Sorted Roll Numbers:"+rollno);

        
        //TreeMap – Store student details based on roll numbers in sorted order.
        TreeMap<Integer, String> studentdetails = new TreeMap<>();

        studentdetails.put(103, "Varma");
        studentdetails.put(101, "Sowmiya");
        studentdetails.put(104, "Logu");
        studentdetails.put(102, "Surya");

        System.out.println("Sorted Student Details:"+studentdetails);

    }
}