package SyntaxG_Inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nA CUSTOMER DISPLAY\n");

        Customer customer = new Customer(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese",
                "Premium",
                "CU00001"
        );

        // Display customer information
        customer.updateNationality("American");
        customer.displayInfo();
        System.out.println("- Age: " + customer.calculateAge(2026));

        // Login functionality
        System.out.println("\n? LOGIN AREA");
        customer.changePassword("Ritchie2Guns", "NewPassword123");
        
        System.out.println(
                ". Login with old password: "
                + customer.login("taetaetae333", "Ritchie2Guns")
        );
        System.out.println(
                ". Login with new password: "
                + customer.login("taetaetae333", "NewPassword123")
        );

        System.out.println("--------------------------------");

        System.out.println("\nB STAFF DISPLAY\n");

        Staff staff = new Staff(
                "taetaetae333",
                "Ritchie2Guns",
                "Nguyen Duc Tay",
                1999,
                "Vietnamese",
                "Premium",
                "CU00001"
        );

        // Display customer information
        staff.updateNationality("American");
        staff.displayInfo();
        System.out.println("- Age: " + staff.calculateAge(2026));

        // Login functionality
        System.out.println("\n? LOGIN AREA");
        staff.changePassword("Ritchie2Guns", "NewPassword123");
        
        System.out.println(
                ". Login with old password: "
                + staff.login("taetaetae333", "Ritchie2Guns")
        );
        System.out.println(
                ". Login with new password: "
                + staff.login("taetaetae333", "NewPassword123")
        );

        System.out.println("--------------------------------");

        System.out.println("\nC ADMIN DISPLAY");

        Admin admin = new Admin(
                "admin001",
                "AdminPassword123",
                "System Administrator",
                1990,
                "Vietnamese",
                "Level 1",
                "AD00001"
        );

        // Display customer information
        admin.updateNationality("American");
        admin.displayInfo();
        System.out.println("- Age: " + admin.calculateAge(2026));

        // Login functionality
        System.out.println("\n? LOGIN AREA");
        admin.changePassword("AdminPassword123", "NewAdminPassword");

        System.out.println(
                ". Login with old password: "
                + admin.login("admin001", "AdminPassword123")
        );
        System.out.println(
                ". Login with new password: "
                + admin.login("admin001", "NewAdminPassword")
        );
    }
}
