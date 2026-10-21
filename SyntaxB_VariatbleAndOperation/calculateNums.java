package SyntaxB_VariatbleAndOperation;

import java.util.Scanner;

public class calculateNums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        scanner.close();

        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        double quotient = (double) num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + pro);
        System.out.println("Quotient: " + quotient);
    }
    
}
