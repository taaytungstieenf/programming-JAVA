package SyntaxB_VariatbleAndOperation;

import java.util.Scanner;

public class Numerics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        		
		System.out.print("Please input number x: ");
		int x = scanner.nextInt();
		System.out.print("Please input number y: ");
		int y = scanner.nextInt();
        scanner.nextLine();
		System.out.print("Please input number z: ");
		int z = scanner.nextInt();

		scanner.close();

        System.out.println("=== ARITHMETIC OPERATORS ===");
        System.out.println("x + y: " + (x + y));
        System.out.println("x - y: " + (x - y));
        System.out.println("x * y: " + (x * y));
    	System.out.println("x / y: " + (x / y));
    	System.out.println("x % y: " + (x % y));

        System.out.println("\n=== COMPARISON OPERATORS ===");
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        System.out.println("\n=== LOGICAL OPERATORS ===");
        System.out.println("(x > y) && (x > 0): " + ((x > y) && (x > 0)));
        System.out.println("(x < y) || (x > 0): " + ((x < y) || (x > 0)));
        System.out.println("!(x > y): " + (!(x > y)));

        System.out.println("\n=== ASSIGNMENT OPERATORS ===");

        System.out.println("z += 5: " + (z += 5));
        System.out.println("z -= 3: " + (z -= 3));
        System.out.println("z *= 2: " + (z *= 2));
        System.out.println("z /= 4: " + (z /= 4));
        System.out.println("z %= 3: " + (z %= 3));
    }
}

