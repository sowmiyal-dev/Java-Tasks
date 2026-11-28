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

public class Onlineshoppingmanagement {

    public static void main(String[] args) {

    	//ArrayList – Store all customer orders.
        ArrayList<String> orders = new ArrayList<>();
        orders.add("Mobile");
        orders.add("Laptop");
        orders.add("Headphone");
        orders.add("Keyboard");

        System.out.println("Customer Orders:"+orders);


      //Deque – Manage pending orders from both ends.
        Deque<String> pending = new ArrayDeque<>();
        pending.addFirst("Mobile");
        pending.addLast("Laptop");
        pending.addFirst("Headphone");

        System.out.println("Pending Orders:"+pending);


      //HashMap – Store order ID and order details.
        HashMap<Integer, String> orderdetails = new HashMap<>();
        orderdetails.put(1001, "Mobile");
        orderdetails.put(1002, "Laptop");
        orderdetails.put(1003, "Headphone");

        System.out.println("Order Details:"+orderdetails);


      //PriorityQueue – Process orders based on priority.
        PriorityQueue<Integer> priority = new PriorityQueue<>();
        priority.add(3);
        priority.add(1);
        priority.add(2); 

        System.out.println("Order Priority:");

        while (!priority.isEmpty()) {
            System.out.println(priority.poll());

        }


      //HashSet – Store unique customer IDs.
        HashSet<Integer> customerid = new HashSet<>();
        customerid.add(101);
        customerid.add(102);
        customerid.add(103);
        customerid.add(101);

        System.out.println("Customer IDs:"+customerid);


     //Stack – Maintain recently cancelled orders.
        Stack<String> cancelled = new Stack<>();
        cancelled.push("Mobile");
        cancelled.push("Laptop");
        cancelled.push("Keyboard");

        System.out.println("Cancelled Orders:"+cancelled);
        System.out.println("Recently Cancelled:"+cancelled.pop());


       //TreeSet – Store product IDs in sorted order.
        TreeSet<Integer> productid = new TreeSet<>();
        productid.add(3003);
        productid.add(3001);
        productid.add(3002);

        System.out.println("Sorted Product IDs:"+productid);


      //TreeMap – Store order details sorted by order ID.
        TreeMap<Integer, String> sortedorders = new TreeMap<>();
        sortedorders.put(1003, "Headphone");
        sortedorders.put(1001, "Mobile");
        sortedorders.put(1002, "Laptop");

        System.out.println("Sorted Orders:"+sortedorders);

    }
}