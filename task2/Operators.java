
package task2;

public class Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 20;
        int b = 10;

        System.out.println("1. Arithmetic Operators");
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Division: " + (a / b));

        // 2. Relational Operators
        System.out.println("\n2. Relational Operators");
        System.out.println("Equal: " + (a == b));
        System.out.println("Greater: " + (a > b));
        System.out.println("Smaller: " + (a < b));

        // 3. Assignment Operators
        int num = 20;

        System.out.println("\n3. Assignment Operators");
        num += 10;
        System.out.println("After += : " + num);

        num -= 5;
        System.out.println("After -= : " + num);

        num *= 2;
        System.out.println("After *= : " + num);

        num /= 5;
        System.out.println("After /= : " + num);

        // 4. Student Marks Calculation
        int marks = 85;
        int totalMarks = 100;

        double percentage = (double) marks / totalMarks * 100;

        System.out.println("\n4. Student Marks Calculation");
        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + percentage + "%");

        // 5. Product Price Calculation
        double price = 999.50;
        int quantity = 3;
        double discount = 10;

        double totalPrice = price * quantity;
        double discountAmount = totalPrice * discount / 100;

        totalPrice -= discountAmount;

        System.out.println("\n5. Product Price Calculation");
        System.out.println("Product Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.printf("Final Price: ₹%.2f%n", totalPrice);
    }
}
