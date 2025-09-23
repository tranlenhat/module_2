package casestudy_furama_resort.controller;

import java.util.Scanner;

public class EmployeeController {
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("<--------------------> Employee Management <------------------------->");
            System.out.println("Chức Năng:  +" +
                    "\n 1.Display list employees" + //Danh Sach
                    "\n 2.Add new employee" +       //Them moi
                    "\n 3.Edit employee" +          //Chinh Sua
                    "\n 4.Return main menu" );      //Quay lai menu
            System.out.println("Chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display list employees");
                    break;
                case 2:
                    System.out.println("Add new employee");
                    break;
                case 3:
                    System.out.println("Edit employee");
                    break;
                default:
                    System.out.println("Return main menu");
                    flag = false;
                    break;
            }
        }
    }
}
