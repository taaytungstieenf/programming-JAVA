package SyntaxFMethodAndSpecifier;

public class User {

    // =========================
    // PRIVATE FIELDS
    // =========================

    private String username;
    private String password;
    private String fullname;
    private int birthyear;
    private String nationality;


    // =========================
    // PUBLIC CONSTRUCTOR
    // =========================

    public User(String username, String password, String fullname,
                    int birthyear, String nationality) {

        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.birthyear = birthyear;
        this.nationality = nationality;
    }


    // =========================
    // PUBLIC METHODS
    // =========================

    // 1st method: Display user information
    public void displayInfo() {

        System.out.println("\n--- USER INFORMATION ---");
        System.out.println("- Username: " + username);
        System.out.println("- Full Name: " + fullname);
        System.out.println("- Birth Year: " + birthyear);
        System.out.println("- Nationality: " + nationality);
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

        if (isCorrectPassword(oldPassword)) {

            password = newPassword;

            System.out.println("Password changed successfully!");

        } else {

            System.out.println("Incorrect old password!");
        }
    }


    // 5th method: Login
    public boolean login(String inputUsername, String inputPassword) {

        return isCorrectUsername(inputUsername)
                && isCorrectPassword(inputPassword);
    }


    // =========================
    // PRIVATE METHODS
    // =========================

    // Private method 1:
    // Check whether the username is correct
    private boolean isCorrectUsername(String inputUsername) {

        return username.equals(inputUsername);
    }


    // Private method 2:
    // Check whether the password is correct
    private boolean isCorrectPassword(String inputPassword) {

        return password.equals(inputPassword);
    }
}
