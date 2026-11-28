package task9;

import java.util.HashSet;

public class Hashsetdynamic {

    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // duplicatevalue
        numbers.add(40);
        numbers.add(50);
        numbers.add(10); // duplicatevalu
        numbers.add(60);
        numbers.add(70);
        numbers.add(30); // duplicatevalue

        for (int number:numbers) {
            System.out.println(number);
        }
    }
}