package SyntaxFMethodAndSpecifier;

public class UserServiceMethod {

    private int userCount = 0;

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && phoneNumber.length() == 10;
    }

    public boolean registerUser(String username, String email, String phoneNumber) {

        if (!isValidEmail(email)) {
            System.out.println("Register failed for " + username + ", email is invalid!");
            return false;
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            System.out.println("Register failed for " + username + ", phone number is invalid!");
            return false;
        }

        userCount++;
        System.out.println("Register succesfully for " + username);
        return true;
    }

    public int getUserCount() {
        return userCount;
    }
}