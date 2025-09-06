package ss_10_ArrayList_LinkedList;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        productManager.addProduct(new Product(1, "Laptop", 1500));
        productManager.addProduct(new Product(2, "Phone", 800));
        productManager.addProduct(new Product(3, "Tablet", 1200));

        System.out.println("Danh sách sản phẩm:");
        productManager.display();

        System.out.println("\n--- Sửa sản phẩm id=2 ---");
        productManager.editProduct(2, "Smartphone", 900);
        productManager.display();

        System.out.println("\n--- Xoá sản phẩm id=1 ---");
        productManager.deleteProduct(1);
        productManager.display();

        System.out.println("\n--- Tìm kiếm sản phẩm có tên 'tab' ---");
        productManager.searchByName("tab");

        System.out.println("\n--- Sắp xếp tăng dần theo giá ---");
        productManager.sortAscending();
        productManager.display();

        System.out.println("\n--- Sắp xếp giảm dần theo giá ---");
        productManager.sortDescending();
        productManager.display();
    }
}
