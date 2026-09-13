package SyntaxIExceptionAndRegularExpression;

// Custom Unchecked Exception dùng để báo lỗi xác thực dữ liệu
public class InvalidUserDataException extends RuntimeException {
    public InvalidUserDataException(String message) {
        super(message);
    }
}