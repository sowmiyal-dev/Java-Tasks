package task5;

import java.util.Scanner;

public class Q1studentmark {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[10];
        int total = 0, pass = 0, fail = 0;
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark: ");
            marks[i] = sc.nextInt();
        }
 
        int highest = marks[0];
        int lowest = marks[0];
 
        System.out.println("Student Marks:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(marks[i]);
 
            total = total + marks[i];
 
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }
 
        double average = total / 10.0;
 
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Pass: " + pass);
        System.out.println("Fail: " + fail);
    }

}
