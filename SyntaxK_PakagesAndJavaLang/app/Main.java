package SyntaxK_PakagesAndJavaLang.app;

import SyntaxK_PakagesAndJavaLang.model.User;
import SyntaxK_PakagesAndJavaLang.service.UserService;

public class Main {

    public static void main(String[] args) {

        User user = new User(
                "tung123",
                "Nguyen Van Tung",
                2000
        );

        UserService userService = new UserService();

        System.out.println("=== USER OBJECT ===");
        System.out.println(user);

        System.out.println("\n=== USER INFORMATION ===");
        userService.displayUserInfo(user);
    }
}
