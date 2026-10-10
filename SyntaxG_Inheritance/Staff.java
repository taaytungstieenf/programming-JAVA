package SyntaxG_Inheritance;

public class Staff extends User {

    private String staffLevel;
    private String staffId;

    public Staff(String username, 
                    String password, 
                    String fullname, 
                    int birthyear, 
                    String nationality, 
                    String staffLevel,
                    String staffId) {

        super(username, password, fullname, birthyear, nationality);

        this.staffLevel = staffLevel;
        this.staffId = staffId;
    }

    public void displayStaffId() {
        System.out.println("Staff ID: " + staffId);
    }
    public void displayStaffLevel() {
        System.out.println("Staff level: " + staffLevel);
    }

    @Override
    public void displayInfo() {

        System.out.println("- Account Type: Administrator");
        System.out.println("- Staff ID: " + staffId);
        System.out.println("- Staff Level: " + staffLevel);

        super.displayInfo();
    }
}
