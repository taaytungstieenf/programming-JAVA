package SyntaxIExceptionAndRegularExpression;

public class User {
    private String username;
    private String email;
    private String phone;

    public User(String username, String email, String phone) {
        this.username = username;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User [Tên: " + username + " | Email: " + email + " | SĐT: " + phone + "]";
    }
}