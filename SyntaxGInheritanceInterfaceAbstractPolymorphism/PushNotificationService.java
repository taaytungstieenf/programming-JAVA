package SyntaxHInheritanceInterfaceAbstractPolymorphism;

public class PushNotificationService extends BaseNotificationService {
    public PushNotificationService(String senderName) {
        super(senderName);
    }

    @Override
    protected void deliverMessage(String message, String recipient) {
        System.out.println("🔔 [PUSH NOTIFICATION] Đang đẩy qua Firebase/APNS...");
        System.out.println("📲 User ID: " + recipient);
        System.out.println("💬 Nội dung: " + message);
    }
}
