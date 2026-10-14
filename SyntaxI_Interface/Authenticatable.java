package SyntaxI_Interface;

public interface Authenticatable {

    boolean login(String inputUsername,
                  String inputPassword);

    void changePassword(String oldPassword,
                        String newPassword);
}
