package SyntaxLJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    // Thông tin cấu hình kết nối MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/demo_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "password"; // Thay bằng mật khẩu MySQL của bạn

    // Helper method tạo kết nối DB
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // 1. Lấy danh sách người dùng theo Trạng thái (Tương tự hàm fetchUsers mẫu)
    public List<User> getUsersByStatus(String status) {
        List<User> users = new ArrayList<>();
        String sql = "SELECT id, username, status FROM users WHERE status = ?";

        // Sử dụng try-with-resources tự động đóng Connection, PreparedStatement, ResultSet
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Truyền tham số an toàn tránh SQL Injection
            stmt.setString(1, status);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Long id = rs.getLong("id");
                    String username = rs.getString("username");
                    String userStatus = rs.getString("status");
                    users.add(new User(id, username, userStatus));
                }
            }

        } catch (SQLException e) {
            System.err.println("❌ Lỗi truy vấn CSDL: " + e.getMessage());
        }

        return users;
    }

    // 2. Thêm mới người dùng vào CSDL
    public boolean insertUser(String username, String status) {
        String sql = "INSERT INTO users (username, status) VALUES (?, ?)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, status);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            System.err.println("❌ Lỗi thêm dữ liệu: " + e.getMessage());
            return false;
        }
    }
}
