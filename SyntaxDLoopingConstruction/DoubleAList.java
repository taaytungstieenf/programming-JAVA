package SyntaxDLoopingConstruction;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoubleAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = new ArrayList<>();

        System.out.println("Please enter a list of numbers separated by spaces:");
        String input = scanner.nextLine();

        String[] parts = input.trim().split("\\s+");

        for (String part : parts) {
            if (!part.isEmpty()) {
                try {
                    double num = Double.parseDouble(part);
                    numbers.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Warning: '" + part + "' is not a valid number and will be skipped.");
                }
            }
        }

        System.out.println("\nResults after doubling:");
        for (double num : numbers) {
            double doubled = num * 2;
            System.out.println(num + " -> " + doubled);
        }

        scanner.close();
    }
}