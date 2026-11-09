package task5;

import java.util.Scanner;

public class Q2studentperformance {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[][] marks = new int[3][4];
	 
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Class " + (i + 1) + " Student " + (j + 1) + " mark: ");
	                marks[i][j] = sc.nextInt();
	            }
	        }
	 
	        int topper = marks[0][0];
	        int topClass = 1;
	        int topStudent = 1;
	 
	        for (int i = 0; i < 3; i++) {
	            int total = 0;
	            int highest = marks[i][0];
	 
	            System.out.println("Class " + (i + 1) + " marks:");
	            for (int j = 0; j < 4; j++) {
	                System.out.println(marks[i][j]);
	 
	                total = total + marks[i][j];
	 
	                if (marks[i][j] > highest) {
	                    highest = marks[i][j];
	                }
	                if (marks[i][j] > topper) {
	                    topper = marks[i][j];
	                    topClass = i + 1;
	                    topStudent = j + 1;
	                }
	            }
	 
	            System.out.println("Total: " + total);
	            System.out.println("Highest: " + highest);
	        }
	 
	        System.out.println("Overall topper mark: " + topper);
	        System.out.println("Class: " + topClass + ", Student: " + topStudent);
	    }

}
