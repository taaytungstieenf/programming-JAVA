package SyntaxK_PakagesAndJavaLang.model;

public class User {

    private String username;
    private String fullname;
    private int birthYear;

    public User(String username, String fullname, int birthYear) {
        this.username = username;
        this.fullname = fullname;
        this.birthYear = birthYear;
    }

    public String getUsername() {
        return username;
    }

    public String getFullname() {
        return fullname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String toString() {
        return "User{"
                + "username='" + username + '\''
                + ", fullname='" + fullname + '\''
                + ", birthYear=" + birthYear
                + '}';
    }
}
