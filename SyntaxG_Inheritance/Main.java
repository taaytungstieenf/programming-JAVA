package SyntaxG_Inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("========== REGULAR USER ==========");

        Customer customer = new Customer(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese",
                "Premium"
        );

        customer.displayInfo();
        System.out.println("Age: " + customer.calculateAge(2026));

        System.out.println("\n--- LOGIN TEST ---");
        System.out.println(
                "Login successful: "
                + customer.login("taetaetae333", "Ritchie2Guns")
        );

        customer.viewPersonalProfile();
        customer.displayMembership();

        System.out.println("\n========== ADMIN ==========");

        Admin admin = new Admin(
                "admin001",
                "AdminPassword123",
                "System Administrator",
                1990,
                "Vietnamese",
                "Level 1"
        );

        admin.displayInfo();
        System.out.println("Age: " + admin.calculateAge(2026));

        System.out.println("\n--- LOGIN TEST ---");
        System.out.println(
                "Login successful: "
                + admin.login("admin001", "AdminPassword123")
        );

        admin.manageUsers();
        admin.displayAdminLevel();

        System.out.println("\n--- CHANGE PASSWORD ---");
        admin.changePassword("AdminPassword123", "NewAdminPassword");

        System.out.println(
                "Login with new password: "
                + admin.login("admin001", "NewAdminPassword")
        );
    }
}
