package SyntaxJCollectionAndGeneric;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo GenericRepository dành riêng cho đối tượng Product
        GenericRepository<Product> productRepo = new GenericRepository<>();

        // Thêm sẵn một số dữ liệu mẫu
        productRepo.save(new Product(101, "Laptop Dell XPS", 32000000.0));
        productRepo.save(new Product(102, "Màn hình LG 27 inch", 6500000.0));
        productRepo.save(new Product(103, "Bàn phím Cơ Corsair", 2800000.0));

        while (true) {
            System.out.println("\n==============================================");
            System.out.println("   HỆ THỐNG QUẢN LÝ KHO HÀNG (GENERIC & COLLECTION)");
            System.out.println("==============================================");
            System.out.println("1. Hiển thị danh sách sản phẩm (findAll)");
            System.out.println("2. Thêm sản phẩm mới (save)");
            System.out.println("3. Tìm sản phẩm theo ID (dùng Optional)");
            System.out.println("4. Xóa sản phẩm theo ID (delete)");
            System.out.println("0. Thoát");
            System.out.print("👉 Lựa chọn của bạn: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("\n👋 Cảm ơn bạn đã sử dụng hệ thống!");
                break;
            }

            switch (choice) {
                case "1":
                    System.out.println("\n--- DANH SÁCH SẢN PHẨM TRONG KHO ---");
                    List<Product> products = productRepo.findAll();
                    if (products.isEmpty()) {
                        System.out.println("⚠️ Kho hàng đang trống.");
                    } else {
                        products.forEach(System.out::println);
                        System.out.println("Tổng số lượng: " + productRepo.count() + " sản phẩm.");
                    }
                    break;

                case "2":
                    System.out.println("\n--- THÊM SẢN PHẨM MỚI ---");
                    try {
                        System.out.print("Nhập Mã SP (Số): ");
                        int id = Integer.parseInt(scanner.nextLine());

                        System.out.print("Nhập Tên SP: ");
                        String name = scanner.nextLine();

                        System.out.print("Nhập Giá SP (VNĐ): ");
                        double price = Double.parseDouble(scanner.nextLine());

                        Product newProduct = new Product(id, name, price);
                        productRepo.save(newProduct);
                        System.out.println("✅ Đã thêm sản phẩm thành công!");
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Lỗi: Mã SP và Giá phải là số hợp lệ!");
                    }
                    break;

                case "3":
                    System.out.println("\n--- TÌM KIẾM SẢN PHẨM TEHO ID ---");
                    try {
                        System.out.print("Nhập Mã SP cần tìm: ");
                        int searchId = Integer.parseInt(scanner.nextLine());

                        // Áp dụng Optional để tìm kiếm an toàn
                        Optional<Product> foundProduct = productRepo.findAll().stream()
                                .filter(p -> p.getId() == searchId)
                                .findFirst();

                        // Xử lý kết quả trả về từ Optional
                        if (foundProduct.isPresent()) {
                            System.out.println("🎉 Tìm thấy: " + foundProduct.get());
                        } else {
                            System.out.println("⚠️ Không tìm thấy sản phẩm có mã " + searchId);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Lỗi: ID phải là số hợp lệ!");
                    }
                    break;

                case "4":
                    System.out.println("\n--- XÓA SẢN PHẨM ---");
                    try {
                        System.out.print("Nhập Mã SP cần xóa: ");
                        int deleteId = Integer.parseInt(scanner.nextLine());

                        Optional<Product> targetProduct = productRepo.findAll().stream()
                                .filter(p -> p.getId() == deleteId)
                                .findFirst();

                        if (targetProduct.isPresent()) {
                            productRepo.delete(targetProduct.get());
                            System.out.println("🗑️ Đã xóa sản phẩm thành công!");
                        } else {
                            System.out.println("⚠️ Không tìm thấy sản phẩm có mã " + deleteId + " để xóa.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("❌ Lỗi: ID phải là số hợp lệ!");
                    }
                    break;

                default:
                    System.out.println("⚠️ Lựa chọn không hợp lệ, vui lòng chọn lại!");
                    break;
            }
        }

        scanner.close();
    }
}
