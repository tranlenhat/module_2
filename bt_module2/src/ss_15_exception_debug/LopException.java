package ss_15_exception_debug;
import java.util.Scanner;

public class LopException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh a");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập cạnh b");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhập cạnh c");
            int c = Integer.parseInt(scanner.nextLine());

            tamGia(a,b,c);
            System.out.println("Ba cạnh hợp lệ, tạo thành một tam giác!");
        }catch (IllegalArgumentException e){
            System.out.println("Lỗi tam giac: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Lỗi nhập dữ liệu: " + e.getMessage());
        }

    }
    public static void tamGia(int a, int b,int c) throws IllegalTriangleException {
        if(a<=0||b<=0||c<=0){
            throw new IllegalTriangleException(" Cạnh tam giác không được âm hoặc bằng 0");
        }else if (a+b<=c|| b+c <= a|| a+c <= b){
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại");
        }
    }
}

