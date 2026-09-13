package SyntaxIExceptionAndRegularExpression;

import java.util.regex.Pattern;

public class UserValidator {

    // 1. Regex SĐT: Bắt đầu bằng 0, theo sau là 9 chữ số (Tổng 10 số)
    private static final Pattern PHONE_PATTERN = Pattern.compile("^0\\d{9}$");

    // 2. Regex Email: Cấu trúc chuẩn name@domain.ext
    private static final Pattern EMAIL_PATTERN = 
        Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");

    // 3. Regex Mật khẩu: Tối thiểu 8 ký tự, phải chứa ít nhất 1 chữ hoa và 1 số
    private static final Pattern PASSWORD_PATTERN = 
        Pattern.compile("^(?=.*[A-Z])(?=.*\\d).{8,}$");

    // Kiểm tra Số điện thoại
    public static void validatePhone(String phone) {
        if (phone == null || !PHONE_PATTERN.matcher(phone).matches()) {
            throw new InvalidUserDataException(
                "❌ Số điện thoại không hợp lệ! (Phải bắt đầu bằng 0 và đúng 10 chữ số)"
            );
        }
    }

    // Kiểm tra Email
    public static void validateEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidUserDataException(
                "❌ Email không hợp lệ! (Ví dụ chuẩn: example@domain.com)"
            );
        }
    }

    // Kiểm tra Mật khẩu
    public static void validatePassword(String password) {
        if (password == null || !PASSWORD_PATTERN.matcher(password).matches()) {
            throw new InvalidUserDataException(
                "❌ Mật khẩu yếu! (Phải từ 8 ký tự trở lên, gồm ít nhất 1 chữ hoa và 1 chữ số)"
            );
        }
    }
}
