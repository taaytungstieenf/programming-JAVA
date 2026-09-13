package SyntaxKFileHandlingInJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileStorageService {

    private final Path uploadDir = Path.of("uploads");

    // 1. Ghi/Lưu File dưới dạng byte[] (Giữ nguyên đoạn code mẫu của bạn)
    public void saveFile(String filename, byte[] content) throws IOException {
        Path path = uploadDir.resolve(filename);
        
        // Tạo thư mục "uploads" nếu chưa tồn tại
        if (!Files.exists(path.getParent())) {
            Files.createDirectories(path.getParent());
        }
        
        // Ghi mảng byte vào file
        Files.write(path, content);
        System.out.println("✅ File đã lưu thành công tại: " + path.toAbsolutePath());
    }

    // 2. Đọc nội dung file dạng Text
    public String readFile(String filename) throws IOException {
        Path path = uploadDir.resolve(filename);
        if (!Files.exists(path)) {
            return null;
        }
        return Files.readString(path);
    }

    // 3. Liệt kê tất cả các file đã lưu trong thư mục "uploads"
    public void listAllFiles() throws IOException {
        if (!Files.exists(uploadDir)) {
            System.out.println("⚠️ Thư mục 'uploads' chưa được tạo.");
            return;
        }

        try (Stream<Path> stream = Files.list(uploadDir)) {
            List<Path> files = stream.filter(Files::isRegularFile).toList();
            if (files.isEmpty()) {
                System.out.println("⚠️ Chưa có file nào trong thư mục 'uploads'.");
            } else {
                System.out.println("--- DANH SÁCH FILE ĐÃ LƯU ---");
                for (Path file : files) {
                    long size = Files.size(file);
                    System.out.println("📄 " + file.getFileName() + " (" + size + " bytes)");
                }
            }
        }
    }
}
