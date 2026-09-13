package SyntaxFMethodAndSpecifier;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng UserService
        UserService service = new UserService();

        System.out.println("=== BẮT ĐẦU CHẠY CHƯƠNG TRÌNH ĐĂNG KÝ ===\n");

        // --- THỬ NGHỆM 1: Gọi các phương thức public ---
        // Trường hợp 1: Email hợp lệ
        service.registerUser("nguyenvana", "ana@gmail.com");

        // Trường hợp 2: Email sai định dạng (thiếu @)
        service.registerUser("tranvanb", "invalid-email-format");

        // Trường hợp 3: Đăng ký thêm 1 user hợp lệ
        service.registerUser("lethic", "c.le@company.com");

        // Kiểm tra tổng số user đã đăng ký thành công
        System.out.println("\nTổng số người dùng hiện tại: " + service.getUserCount());


        // --- THỬ NGHỆM 2: Truy cập các thành phần private (BỎ COMMENT ĐỂ KIỂM TRA LỖI) ---
        
        // ❌ LỖI BIÊN DỊCH: Không thể gọi trực tiếp hàm private từ lớp Main!
        // service.isValidEmail("test@gmail.com"); 

        // ❌ LỖI BIÊN DỊCH: Không thể thay đổi trực tiếp biến private từ lớp Main!
        // service.userCount = 100;
    }
}