package SyntaxFMethodAndSpecifier;

public class UserServiceMain {
    public static void main(String[] args) {

        UserServiceMethod service = new UserServiceMethod();

        System.out.println("=== REGISTERING PROGRAM ===\n");

        service.registerUser("Nguyen Duc Tay", "nguyenductay121999@gmail.com", "0909246357");
        service.registerUser("Dat Van Tay", "datvantay333.outlook.com", "0123456789");
        service.registerUser("Tieu Tay Tay", "tieutaytay@hotmail.com", "222444666");

        System.out.println("\nTotal successful registers: " + service.getUserCount());
    }
}