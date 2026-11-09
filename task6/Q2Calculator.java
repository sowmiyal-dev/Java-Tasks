
package task6;

interface Calculator {
    int calculate(int a, int b);
}

public class Q2Calculator {

    public static void main(String[] args) {

        int a = 20, b = 10;

        // Addition
        Calculator add = (x, y) -> x + y;
        System.out.println("Addition: " + add.calculate(a, b));

        // Subtraction
        Calculator sub = (x, y) -> x - y;
        System.out.println("Subtraction: " + sub.calculate(a, b));

        // Multiplication
        Calculator mul = (x, y) -> x * y;
        System.out.println("Multiplication: " + mul.calculate(a, b));

        // Division
        Calculator div = (x, y) -> x / y;
        System.out.println("Division: " + div.calculate(a, b));
    }
}
