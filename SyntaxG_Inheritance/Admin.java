package SyntaxG_Inheritance;

public class Admin extends User {

    private String adminLevel;
    private String adminId;

    public Admin(String username, 
                    String password, 
                    String fullname, 
                    int birthyear, 
                    String nationality, 
                    String adminLevel,
                    String adminId) {

        super(username, password, fullname, birthyear, nationality);

        this.adminLevel = adminLevel;
        this.adminId = adminId;
    }

    public void displayAdminId() {
        System.out.println("Admin ID: " + adminId);
    }
    public void displayAdminLevel() {
        System.out.println("Admin level: " + adminLevel);
    }

    @Override
    public void displayInfo() {

        System.out.println("- Account Type: Administrator");
        System.out.println("- Admin ID: " + adminId);
        System.out.println("- Admin Level: " + adminLevel);

        super.displayInfo();
    }
}
