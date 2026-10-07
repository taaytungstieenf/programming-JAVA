package SyntaxHInheritanceInterfaceAbstractPolymorphism;

public class SmsNotificationService extends BaseNotificationService {
    public SmsNotificationService(String senderName) {
        super(senderName);
    }

    @Override
    protected void deliverMessage(String message, String recipient) {
        System.out.println("📱 [SMS GATEWAY] Đang gửi qua mạng viễn thông...");
        System.out.println("📞 SĐT nhận: " + recipient);
        System.out.println("💬 Nội dung: " + message);
    }
}
