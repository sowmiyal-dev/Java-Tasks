package task9;

import java.util.ArrayList;

public class Arraylistdynamic {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("sowmi");
        students.add("logu");
        students.add("surya");
        students.add("varma");
        students.add("arun");

        for (int i=0; i<students.size(); i++) {
            System.out.println(students.get(i)); 
        }
    }
}