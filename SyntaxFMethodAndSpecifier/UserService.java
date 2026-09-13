package SyntaxFMethodAndSpecifier;

public class UserService {
    // 1. Thuộc tính private: Lưu danh sách/đếm số người dùng (ẩn với bên ngoài)
    private int userCount = 0;

    // 2. Phương thức private: Helper method để kiểm tra định dạng email
    // Bên ngoài (như Main) KHÔNG THỂ gọi trực tiếp hàm này.
    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    // 3. Phương thức public: Giao diện (API) cho bên ngoài sử dụng
    public boolean registerUser(String username, String email) {
        // Gọi lại hàm private nội bộ để kiểm tra
        if (!isValidEmail(email)) {
            System.out.println("❌ Đăng ký thất bại cho [" + username + "]: Email không hợp lệ!");
            return false;
        }

        userCount++;
        System.out.println("✅ Đăng ký thành công: " + username + " (" + email + ")");
        return true;
    }

    // 4. Phương thức public: Cho phép bên ngoài xem số lượng user (nhưng không thể sửa trực tiếp userCount)
    public int getUserCount() {
        return userCount;
    }
}