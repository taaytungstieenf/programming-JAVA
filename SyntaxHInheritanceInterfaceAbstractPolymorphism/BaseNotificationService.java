package SyntaxHInheritanceInterfaceAbstractPolymorphism;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// ABSTRACT CLASS: Chứa thuộc tính chung & xử lý logic dùng chung (Inheritance)
public abstract class BaseNotificationService implements NotificationService {
    protected String senderName;

    public BaseNotificationService(String senderName) {
        this.senderName = senderName;
    }

    @Override
    public void sendNotification(String message, String recipient) {
        if (recipient == null || recipient.trim().isEmpty()) {
            System.out.println("❌ Lỗi: Người nhận không hợp lệ!");
            return;
        }

        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"));
        System.out.println("\n----------------------------------------");
        System.out.println("⏰ Thời gian: " + timestamp);
        System.out.println("👤 Người gửi: " + senderName);

        // Gọi phương thức abstract được triển khai ở các lớp con
        deliverMessage(message, recipient);

        System.out.println("✅ Trạng thái: Đã gửi thành công.");
        System.out.println("----------------------------------------");
    }

    // Abstract method: Buộc các lớp con phải ghi đè
    protected abstract void deliverMessage(String message, String recipient);
}