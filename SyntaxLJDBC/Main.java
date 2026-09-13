package SyntaxLJDBC;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserRepository userRepo = new UserRepository();

        while (true) {
            System.out.println("\n==============================================");
            System.out.println("   HỆ THỐNG QUẢN LÝ USER CSDL (JDBC DEMO)");
            System.out.println("==============================================");
            System.out.println("1. Xem danh sách User đang 'ACTIVE' (fetchUsers)");
            System.out.println("2. Xem danh sách User theo trạng thái tùy chọn");
            System.out.println("3. Thêm User mới vào MySQL");
            System.out.println("0. Thoát");
            System.out.print("👉 Lựa chọn của bạn: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("\n👋 Đã thoát chương trình!");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("\n--- DANH SÁCH USER ACTIVE ---");
                    List<User> activeUsers = userRepo.getUsersByStatus("ACTIVE");
                    if (activeUsers.isEmpty()) {
                        System.out.println("⚠️ Không tìm thấy user nào hoặc chưa kết nối được MySQL.");
                    } else {
                        activeUsers.forEach(System.out::println);
                    }
                    break;

                case "2":
                    System.out.print("\nNhập trạng thái cần tìm (ACTIVE / INACTIVE): ");
                    String statusInput = scanner.nextLine().trim().toUpperCase();

                    List<User> filteredUsers = userRepo.getUsersByStatus(statusInput);
                    System.out.println("\n--- DANH SÁCH USER [" + statusInput + "] ---");
                    if (filteredUsers.isEmpty()) {
                        System.out.println("⚠️ Không có user nào có trạng thái " + statusInput);
                    } else {
                        filteredUsers.forEach(System.out::println);
                    }
                    break;

                case "3":
                    System.out.println("\n--- THÊM USER MỚI ---");
                    System.out.print("Nhập Username: ");
                    String newUsername = scanner.nextLine().trim();

                    System.out.print("Nhập Trạng thái (ACTIVE/INACTIVE): ");
                    String newStatus = scanner.nextLine().trim().toUpperCase();

                    if (newUsername.isEmpty() || newStatus.isEmpty()) {
                        System.out.println("⚠️ Dữ liệu nhập không được trống!");
                        break;
                    }

                    boolean success = userRepo.insertUser(newUsername, newStatus);
                    if (success) {
                        System.out.println("🎉 Đã thêm User " + newUsername + " vào CSDL thành công!");
                    } else {
                        System.out.println("❌ Thêm User thất bại.");
                    }
                    break;

                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ!");
                    break;
            }
        }

        scanner.close();
    }
}