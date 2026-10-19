package SyntaxK_PakagesAndJavaLang.model;

public class User {

    private String username;
    private String pasword;
    private String fullname;
    private int birthYear;
    private String nationality;

    public User(String username, String pasword, String fullname, 
                int birthYear, String nationality) {

        this.username = username;
        this.pasword = pasword;
        this.fullname = fullname;
        this.birthYear = birthYear;
        this.nationality = nationality;
    }

    public String getUsername() {
        return username;
    }
    public String getPasword() {
        return pasword;
    }
    public String getFullname() {
        return fullname;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public String getNationality() {
        return nationality;
    }

    @Override
    public String toString() {
        return "User{"  + "username='" + username + '\''
                        + ", pasword='" + pasword + '\''
                        + ", fullname='" + fullname + '\''
                        + ", birthYear=" + birthYear
                        + ", nationality='" + nationality + '\''
                        + '}';
    }
}
