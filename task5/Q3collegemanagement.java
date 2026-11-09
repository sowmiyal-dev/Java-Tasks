package task5;

import java.util.Scanner;

public class Q3collegemanagement {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] marks = new int[2][2][3];
 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("Dept " + (i + 1) + " Class " + (j + 1) + " Student " + (k + 1) + " mark: ");
                    marks[i][j][k] = sc.nextInt();
                }
            }
        }
 
        int overallHighest = marks[0][0][0];
 
        for (int i = 0; i < 2; i++) {
            int deptHighest = marks[i][0][0];
 
            System.out.println("Department " + (i + 1));
 
            for (int j = 0; j < 2; j++) {
                int total = 0;
 
                System.out.println("Class " + (j + 1) + " marks:");
                for (int k = 0; k < 3; k++) {
                    System.out.println(marks[i][j][k]);
 
                    total = total + marks[i][j][k];
 
                    if (marks[i][j][k] > deptHighest) {
                        deptHighest = marks[i][j][k];
                    }
                    if (marks[i][j][k] > overallHighest) {
                        overallHighest = marks[i][j][k];
                    }
                }
 
                System.out.println("Class average: " + total / 3.0);
            }
 
            System.out.println("Department highest: " + deptHighest);
        }
 
        System.out.println("Overall highest: " + overallHighest);
    }

}
