package SyntaxGPakagesAndJavaLang;

public class ApiResponse {
    private String status;
    private String message;

    public ApiResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    // Đè hàm toString() từ java.lang.Object
    @Override
    public String toString() {
        return "ApiResponse [Trạng thái = " + status + ", Thông báo = " + message + "]";
    }
}