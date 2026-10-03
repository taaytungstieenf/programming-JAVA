
package SyntaxEClassAndObject;

public class Main {
    public static void main(String[] args) {

        userInfo user1 = new userInfo(
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

        // 4. Change password
        user1.changePassword("Ritchie2Guns", "NewPassword123");

        // 5. Log in with new password
        System.out.println("New login: " + user1.login("taetaetae333", "NewPassword123"));

        // 6. Log in with old password
        System.out.println("Old login: " + user1.login("taetaetae333", "Ritchie2Guns"));

        // 7. Display updated user information
        user1.displayInfo();
    }
}