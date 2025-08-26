package ss_9_quan_ly_xe.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("------------------> Chọn Chức Năng Quản Lý Phương Tiện Giao Thông <-----------------");
            System.out.println("Chức năng: " +
                    "\n 1. Quản lý Xe Oto" +
                    "\n 2. Quản lý Xe Xe Tải" +
                    "\n 3. Quản lý Xe Xe Máy" +
                    "\n 4. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chức Năng Quản Lý Oto");
                    QuanLyOtoController.displayMenu();
                    break;
                case 2:
                    System.out.println("Chức Năng QUản Lý Xe Tải");
                    QuanLyXeTaiController.displayMenu();
                case 3:
                    System.out.println("Chức Năng QUản Lý Xe Máy");
                    QuanLyXeMayController.displayMenu();
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
