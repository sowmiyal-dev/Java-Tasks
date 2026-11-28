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

public class Hospitalmanagement {

    public static void main(String[] args) {

    	//ArrayList – Store the list of patients
        ArrayList<String> patient = new ArrayList<>();
        patient.add("sowmi");
        patient.add("surya");
        patient.add("loganathan");
        patient.add("varma");

        System.out.println("Patient List:"+patient);


      //Deque – Manage patients waiting for consultation from both ends.
        Deque<String> waiting = new ArrayDeque<>();
        waiting.addFirst("surya");
        waiting.addLast("varma");
        waiting.addFirst("sowmiya");

        System.out.println("Waiting Patients:"+ waiting);


      //HashMap – Store patient ID and patient details.
        HashMap<Integer, String> patientrecord = new HashMap<>();
        patientrecord.put(1001, "loganathan");
        patientrecord.put(1002, "dhanush");
        patientrecord.put(1003, "vijay");

        System.out.println("Patient Records:"+ patientrecord);


      //PriorityQueue – Prioritize emergency patients.
        PriorityQueue<Integer> emergency = new PriorityQueue<>();
        emergency.add(3);
        emergency.add(1);
        emergency.add(2);
        
        System.out.println("Emergency Priority:");

        while (!emergency.isEmpty()) {
            System.out.println(emergency.poll());

        }


      //HashSet – Store unique patient contact numbers.
        HashSet<String> contact = new HashSet<>();
        contact.add("9999999999");
        contact.add("9888888888");
        contact.add("9877777777");
        contact.add("9876666666");

        System.out.println("Contact Numbers:"+contact);

        
        //Stack – Maintain the recently visited patient records.
        Stack<String> visited = new Stack<>();
        visited.push("sowmiya");
        visited.push("loganathan");
        visited.push("surya");

        System.out.println("Recently Visited:"+visited);
        System.out.println("Last Visited:"+visited.pop());


        
        //TreeSet – Store patient IDs in sorted order.
        TreeSet<Integer> patientid = new TreeSet<>();
        patientid.add(1003);
        patientid.add(1001);
        patientid.add(1002);

        System.out.println("Sorted Patient IDs:"+patientid);


      //TreeMap – Store patients according to their patient ID in sorted order.
        TreeMap<Integer, String> patientdetails = new TreeMap<>();
        patientdetails.put(1003, "sowmiya");
        patientdetails.put(1001, "surya");
        patientdetails.put(1002, "varma");

        System.out.println("Sorted Patient Details:"+patientdetails);

    }
}

