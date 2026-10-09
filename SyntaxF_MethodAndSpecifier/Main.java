package SyntaxF_MethodAndSpecifier;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese"
        );

        user1.displayInfo();

        System.out.println("Age: " + user1.calculateAge(2026));

        user1.updateNationality("Canadian");

        user1.changePassword("Ritchie2Guns", "NewPassword123");

        System.out.println("New password login: " + user1.login("taetaetae333", "NewPassword123"));

        System.out.println("Old password login: " + user1.login("taetaetae333", "Ritchie2Guns"));

        user1.displayInfo();

        // System.out.println(user1.isCorrectUsername("taetaetae333"));
        // System.out.println(user1.isCorrectPassword("NewPassword123"));
    }
}