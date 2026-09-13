package SyntaxIExceptionAndRegularExpression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   HỆ THỐNG ĐĂNG KÝ TÀI KHOẢN (REGEX & EXCEPTION)");
        System.out.println("==============================================");

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Nhập thông tin đăng ký tài khoản");
            System.out.println("0. Thoát");
            System.out.print("👉 Lựa chọn của bạn: ");

            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                System.out.println("\n👋 Đã thoát chương trình!");
                break;
            }

            if (!choice.equals("1")) {
                System.out.println("⚠️ Lựa chọn không hợp lệ, vui lòng thử lại.");
                continue;
            }

            // Nhập thông tin người dùng từ Console
            System.out.print("1. Nhập Họ và Tên: ");
            String name = scanner.nextLine();

            System.out.print("2. Nhập Email: ");
            String email = scanner.nextLine();

            System.out.print("3. Nhập Số điện thoại (10 số): ");
            String phone = scanner.nextLine();

            System.out.print("4. Nhập Mật khẩu: ");
            String password = scanner.nextLine();

            // Khối Try-Catch để kiểm tra ngoại lệ
            try {
                // Tiến hành Validate bằng Regex
                UserValidator.validateEmail(email);
                UserValidator.validatePhone(phone);
                UserValidator.validatePassword(password);

                // Nếu không ném ra Exception -> Khởi tạo User thành công
                User newUser = new User(name, email, phone);

                System.out.println("\n----------------------------------------------");
                System.out.println("🎉 ĐĂNG KÝ THÀNH CÔNG!");
                System.out.println(newUser);
                System.out.println("----------------------------------------------");

            } catch (InvalidUserDataException e) {
                // Bắt Exception do Custom Exception ném ra khi sai Regex
                System.out.println("\n----------------------------------------------");
                System.out.println("🚫 LỖI XÁC THỰC DỮ LIỆU:");
                System.out.println(e.getMessage());
                System.out.println("----------------------------------------------");
            } catch (Exception e) {
                System.out.println("❌ Lỗi hệ thống: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
