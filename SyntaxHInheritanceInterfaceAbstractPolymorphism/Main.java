package SyntaxHInheritanceInterfaceAbstractPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println("   HỆ THỐNG GỬI THÔNG BÁO TƯƠNG TÁC OOP   ");
        System.out.println("==========================================");

        while (true) {
            System.out.println("\nChọn kênh gửi thông báo:");
            System.out.println("1. Gửi qua Email");
            System.out.println("2. Gửi qua SMS");
            System.out.println("3. Gửi qua App Push Notification");
            System.out.println("0. Thoát chương trình");
            System.out.print("👉 Lựa chọn của bạn (0-3): ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("⚠️ Vui lòng nhập số hợp lệ!");
                continue;
            }

            if (choice == 0) {
                System.out.println("\n👋 Cảm ơn bạn đã sử dụng hệ thống!");
                break;
            }

            // ĐA HÌNH (Polymorphism): Biến giao diện nhận đối tượng cụ thể
            NotificationService service = null;

            switch (choice) {
                case 1:
                    service = new EmailNotificationService("Hệ thống Banking");
                    break;
                case 2:
                    service = new SmsNotificationService("Mã OTP Telecom");
                    break;
                case 3:
                    service = new PushNotificationService("App Shopee");
                    break;
                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    continue;
            }

            System.out.print("Enter Người nhận (Email/SĐT/UserID): ");
            String recipient = scanner.nextLine();

            System.out.print("Enter Nội dung thông báo: ");
            String message = scanner.nextLine();

            // Thực thi hành vi đa hình
            service.sendNotification(message, recipient);
        }

        scanner.close();
    }
}
