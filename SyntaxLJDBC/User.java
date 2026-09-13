package SyntaxLJDBC;

public class User {
    private Long id;
    private String username;
    private String status;

    public User(Long id, String username, String status) {
        this.id = id;
        this.username = username;
        this.status = status;
    }

    public Long getId() { return id; }
    public String getUsername() { return username; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return String.format("ID: %-4d | Username: %-20s | Trạng thái: %-10s", id, username, status);
    }
}
