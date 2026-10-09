package SyntaxE_ClassAndObject;

public class User {
    private String username;
    private String password;
    private String fullname;
    private int birthyear;
    private String nationality;

    public User(String username, String password, String fullname, int birthyear, String nationality) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.birthyear = birthyear;
        this.nationality = nationality;
    }

    public void displayInfo() {
        System.out.println("\n--- USER INFORMATION ---");
        System.out.println("- Username: " + username);
        System.out.println("- Password: " + password);
        System.out.println("- Full Name: " + fullname);
        System.out.println("- Birth Year: " + birthyear);
        System.out.println("- Nationality: " + nationality + "\n");
    }

    public int calculateAge(int currentYear) {
        return currentYear - birthyear;
    }

    public void updateNationality(String newNationality) {
        nationality = newNationality;
        System.out.println("Nationality updated!");
    }
}