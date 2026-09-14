package SyntaxJCollectionAndGeneric;

import java.util.ArrayList;
import java.util.List;
// import java.util.Optional;

// Lớp Generic lưu trữ mọi loại đối tượng T
public class GenericRepository<T> {
    // Collection: List lưu trữ các phần tử kiểu T
    private List<T> items = new ArrayList<>();

    // 1. Thêm mới phần tử
    public void save(T item) {
        items.add(item);
    }

    // 2. Lấy toàn bộ danh sách
    public List<T> findAll() {
        return items;
    }

    // 3. Xóa một phần tử
    public boolean delete(T item) {
        return items.remove(item);
    }

    // 4. Đếm số lượng phần tử trong Collection
    public int count() {
        return items.size();
    }
}
