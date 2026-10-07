package SyntaxHInheritanceInterfaceAbstractPolymorphism;

public class EmailNotificationService extends BaseNotificationService {
    public EmailNotificationService(String senderName) {
        super(senderName);
    }

    @Override
    protected void deliverMessage(String message, String recipient) {
        System.out.println("📧 [EMAIL SYSTEM] Đang kết nối SMTP Server...");
        System.out.println("📩 Gửi tới Mail: " + recipient);
        System.out.println("💬 Nội dung: " + message);
    }
}
