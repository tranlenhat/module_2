package ss_10_ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product){
        products.add(product);
    }
    public void editProduct(int id, String name, double price){
        for (Product product:products){
            if(product.getId()==id){
                product.setName(name);
                product.setPrice(price);
                System.out.println("Đã sửa sản phẩm có id = " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id = " + id);
    }
    public void deleteProduct(int id) {
        for (Product p : products) {
            if (p.getId() == id) {
                products.remove(p);
                System.out.println("Đã xóa sản phẩm có id = " + id);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có id = " + id);
    }
    public void display() {
        for (Product p : products) {
            System.out.println(p);
        }
    }

    public void searchByName(String name) {
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(p);
            }
        }
    }
    public void sortAscending() {
        products.sort(Comparator.comparing(Product::getPrice));
    }

    public void sortDescending() {
        products.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

