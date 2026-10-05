
package SyntaxEClassAndObject;

public class Main {
    public static void main(String[] args) {

        User user1 = new User(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese"
        );

        // 1. Display user information
        user1.displayInfo();

        // 2. Calculate age
        System.out.println("Age: " + user1.calculateAge(2026));

        // 3. Update nationality
        user1.updateNationality("Canadian");

        // 4. Display updated user information
        user1.displayInfo();
    }
}