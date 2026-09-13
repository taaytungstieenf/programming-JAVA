package SyntaxKFileHandlingInJava;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileStorageService storageService = new FileStorageService();

        while (true) {
            System.out.println("\n==============================================");
            System.out.println("   HỆ THỐNG LƯU TRỮ & QUẢN LÝ FILE (JAVA NIO)");
            System.out.println("==============================================");
            System.out.println("1. Tạo & Lưu File mới (saveFile)");
            System.out.println("2. Đọc nội dung File");
            System.out.println("3. Xem danh sách File trong thư mục 'uploads'");
            System.out.println("0. Thoát");
            System.out.print("👉 Lựa chọn của bạn: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("\n👋 Cảm ơn bạn đã sử dụng hệ thống!");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("\n--- TẠO & LƯU FILE MỚI ---");
                    System.out.print("Nhập tên file (VD: log.txt, note.txt): ");
                    String filename = scanner.nextLine().trim();

                    if (filename.isEmpty()) {
                        System.out.println("⚠️ Tên file không được để trống!");
                        break;
                    }

                    System.out.print("Nhập nội dung văn bản muốn lưu: ");
                    String contentStr = scanner.nextLine();

                    // Chuyển chuỗi thành mảng byte[] theo bảng mã UTF-8
                    byte[] contentBytes = contentStr.getBytes(StandardCharsets.UTF_8);

                    try {
                        storageService.saveFile(filename, contentBytes);
                    } catch (IOException e) {
                        System.out.println("❌ Lỗi IO khi ghi file: " + e.getMessage());
                    }
                    break;

                case "2":
                    System.out.println("\n--- ĐỌC NỘI DUNG FILE ---");
                    System.out.print("Nhập tên file cần đọc: ");
                    String readFileName = scanner.nextLine().trim();

                    try {
                        String content = storageService.readFile(readFileName);
                        if (content != null) {
                            System.out.println("\n📖 NỘI DUNG FILE [" + readFileName + "]:");
                            System.out.println("----------------------------------------------");
                            System.out.println(content);
                            System.out.println("----------------------------------------------");
                        } else {
                            System.out.println("⚠️ Không tìm thấy file '" + readFileName + "' trong thư mục uploads.");
                        }
                    } catch (IOException e) {
                        System.out.println("❌ Lỗi IO khi đọc file: " + e.getMessage());
                    }
                    break;

                case "3":
                    System.out.println("\n--- DANH SÁCH FILE ---");
                    try {
                        storageService.listAllFiles();
                    } catch (IOException e) {
                        System.out.println("❌ Lỗi khi đọc thư mục: " + e.getMessage());
                    }
                    break;

                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ, vui lòng thử lại!");
                    break;
            }
        }

        scanner.close();
    }
}
