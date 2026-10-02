package SyntaxCDecisionMakingConstructs;

import java.util.Scanner;

public class loginFunctionMedium {
    public static void main(String[] args) {

        String username = "root";
        String password = "admin";
        int attempts = 3;

        while(attempts >= 0){

            Scanner scanner = new Scanner(System.in);

            System.out.print("username: ");
            String user = scanner.nextLine();

            System.out.print("password: ");
            String pass = scanner.nextLine();

            if(pass.equals(password) && user.equals(username)){
                System.out.print("Log in successful");
                break;
            }
            else if(user.equals(username)) {
                System.out.println("Wrong password!");
                attempts--;
            }
            else {
                System.out.println("Invalidroot username");
                attempts--;
            }

            if (attempts < 0) {
                System.out.println("your account has been blocked!");
            }
        }
    }
}