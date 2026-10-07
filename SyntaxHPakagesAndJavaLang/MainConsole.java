package SyntaxGPakagesAndJavaLang;

// Phải import ApiResponse vì nó ở package com.example.model
// import SyntaxGPakagesAndJavaLang.ApiResponse;

// Scanner thuộc java.util nên cũng cần import
import java.util.Scanner;

public class MainConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ màn hình console
        System.out.print("Nhập tên của bạn: ");
        String name = scanner.nextLine();

        // Xử lý chuỗi bằng phương thức của java.lang.String
        ApiResponse response;
        if (name.trim().isEmpty()) {
            response = new ApiResponse("LỖI", "Tên không được để trống!");
        } else {
            // java.lang.Math được dùng trực tiếp mà không cần import
            int randomCode = (int) (Math.random() * 1000); 
            response = new ApiResponse("THÀNH_CÔNG", "Xin chào " + name.toUpperCase() + "! Mã lượt chơi: " + randomCode);
        }

        // In kết quả ra console (System thuộc java.lang)
        System.out.println("\nKết quả trả về:");
        System.out.println(response);

        scanner.close();
    }
}
