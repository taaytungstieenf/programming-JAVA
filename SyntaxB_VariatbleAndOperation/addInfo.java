package SyntaxB_VariatbleAndOperation;

import java.util.Scanner;

public class addInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your fullname: ");
        String fullname = scanner.nextLine();

        System.out.print("Please enter your birth year: ");
        int bYear = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please enter your birth place: ");
        String bPlace = scanner.nextLine();

        System.out.print("Please enter your nationality: ");
        String nationality = scanner.nextLine();

        scanner.close();
        
        System.out.println("Full Name: " + fullname);
        System.out.println("Birth Year: " + bYear);
        System.out.println("Birth Place: " + bPlace);
        System.out.println("Nationality: " + nationality);

    }
}
