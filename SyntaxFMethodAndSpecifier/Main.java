package SyntaxFMethodAndSpecifier;

public class Main {

    public static void main(String[] args) {

        // Create Object
        User user1 = new User(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese"
        );


        // =========================
        // 1. Display user information
        // =========================

        user1.displayInfo();


        // =========================
        // 2. Calculate age
        // =========================

        System.out.println(
                "Age: " + user1.calculateAge(2026)
        );


        // =========================
        // 3. Update nationality
        // =========================

        user1.updateNationality("Canadian");


        // =========================
        // 4. Change password
        // =========================

        user1.changePassword(
                "Ritchie2Guns",
                "NewPassword123"
        );


        // =========================
        // 5. Login with new password
        // =========================

        System.out.println(
                "New password login: "
                + user1.login(
                        "taetaetae333",
                        "NewPassword123"
                )
        );


        // =========================
        // 6. Login with old password
        // =========================

        System.out.println(
                "Old password login: "
                + user1.login(
                        "taetaetae333",
                        "Ritchie2Guns"
                )
        );


        // =========================
        // 7. Display updated information
        // =========================

        user1.displayInfo();


        // =========================
        // 8. TRY PRIVATE METHOD
        // =========================

        // KHÔNG ĐƯỢC:
        // user1.isCorrectUsername("taetaetae333");

        // KHÔNG ĐƯỢC:
        // user1.isCorrectPassword("NewPassword123");
    }
}