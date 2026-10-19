package SyntaxK_PakagesAndJavaLang.service;

import SyntaxK_PakagesAndJavaLang.model.User;

public class UserService {

    public boolean isValidUser(User user) {
        return user != null
                && user.getUsername() != null
                && !user.getUsername().isBlank()
                && user.getFullname() != null
                && !user.getFullname().isBlank()
                && user.getBirthYear() > 1900
                && user.getBirthYear() <= 2026;
    }

    public void displayUserInfo(User user) {
        if (!isValidUser(user)) {
            System.out.println("Invalid user information.");
            return;
        }

        int age = 2026 - user.getBirthYear();

        System.out.println("Username: " + user.getUsername());
        System.out.println("Full name: " + user.getFullname());
        System.out.println("Age: " + age);
        System.out.println("Adult: " + (age >= 18));
    }
}
