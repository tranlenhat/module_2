package ss_8_clear_code.controller;

import java.util.Scanner;

public class MainController {
    public static void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag =true;
        while (flag) {
            System.out.println("------------Chọn chức năng quản ly----------");
            System.out.println("Chức năng: " +
                    "\n 1. Quản lý Khach Hang" +
                    "\n 2. Thoát"
            );
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Chức năng quản lý khach hang");
                    CustomrController.displayMenu();
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
