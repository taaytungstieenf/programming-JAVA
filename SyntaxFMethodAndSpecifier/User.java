package SyntaxFMethodAndSpecifier;

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

    private boolean isCorrectUsername(String inputUsername) {
        return username.equals(inputUsername);
    }
    private boolean isCorrectPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void displayInfo() {

        System.out.println("\n--- USER INFORMATION ---");
        System.out.println("- Username: " + username);
        System.out.println("- Password: " + password);
        System.out.println("- Full Name: " + fullname);
        System.out.println("- Birth Year: " + birthyear);
        System.out.println("- Nationality: " + nationality);
    }

    public int calculateAge(int currentYear) {
        return currentYear - birthyear;
    }

    public void updateNationality(String newNationality) {
        nationality = newNationality;
        System.out.println("Nationality updated!");
    }

    public void changePassword(String oldPassword, String newPassword) {

        if (isCorrectPassword(oldPassword)) {
            password = newPassword;
            System.out.println("Password changed successfully!");

        }
        else {
            System.out.println("Incorrect old password!");
        }
    }

    public boolean login(String inputUsername, String inputPassword) {
        
        return isCorrectUsername(inputUsername) && isCorrectPassword(inputPassword);
    }

}
