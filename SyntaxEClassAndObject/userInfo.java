package SyntaxEClassAndObject;

public class userInfo {
    private String username;
    private String password;
    private String fullname;
    private int birthyear;
    private String nationality;

    public userInfo(String username, String password, String fullname, int birthyear, String nationality) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.birthyear = birthyear;
        this.nationality = nationality;
    }

    // 1st method: Display user information
    public void displayInfo() {
        System.out.println("\n--- USER INFORMATION ---");
        System.out.println("- Username: " + username);
        System.out.println("- Full Name: " + fullname);
        System.out.println("- Birth Year: " + birthyear);
        System.out.println("- Nationality: " + nationality + "\n");
    }

    // 2nd method: Calculate age
    public int calculateAge(int currentYear) {
        return currentYear - birthyear;
    }

    // 3rd method: Update nationality
    public void updateNationality(String newNationality) {
        nationality = newNationality;
        System.out.println("Nationality updated!");
    }

    // 4th method: Change password
    public void changePassword(String oldPassword, String newPassword) {
        if (password.equals(oldPassword)) {
            password = newPassword;
            System.out.println("Password changed successfully!");
        } else {
            System.out.println("Incorrect old password!");
        }
    }

    // 5th method: login
    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername)
                && password.equals(inputPassword);
    }
}