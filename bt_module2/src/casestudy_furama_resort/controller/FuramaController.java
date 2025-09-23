package casestudy_furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("------------------> QUẢN LÝ KHÁCH SẠN <-----------------");
            System.out.println("Chức năng: "     +
                    "\n 1. Employee Managemen"   +
                    "\n 2. Customer Managemen"   +
                    "\n 3. Facility Management"  +
                    "\n 4. Booking Managerment"  +
                    "\n 5. Promotion Management " +
                    "\n 6. Exit"
            );
            System.out.println("Chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    EmployeeController.displayMenu();
                    break;
                case 2:
                    CustomerController.displayMenu();
                    break;
                case 3:
                    System.out.println("Facility Management");
                    break;
                case 4:
                    System.out.println("Booking Managerment");
                    break;
                case 5:
                    System.out.println("Promotion Management");
                default:
                    System.out.println("Exit");
                    flag = false;
                    break;
            }
        }
    }
}
