package SyntaxG_Inheritance;

public class Admin extends User {

    private String adminLevel;

    public Admin(String username, String password, String fullname, int birthyear, String nationality, String adminLevel) {

        super(username, password, fullname, birthyear, nationality);
        this.adminLevel = adminLevel;
    }

    public void manageUsers() {
        System.out.println("Admin is managing user accounts.");
    }

    public void displayAdminLevel() {
        System.out.println("Admin level: " + adminLevel);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("- Account Type: Administrator");
        System.out.println("- Admin Level: " + adminLevel);
    }
}
