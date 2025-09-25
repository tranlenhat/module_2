package casestudy_furama_resort.controller;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.service.CustomerService;
import casestudy_furama_resort.service.ICustomerService;
import casestudy_furama_resort.view.CustomerView;
import java.util.List;
import java.util.Scanner;

public class CustomerController {
    public static void displayMenu(){
        ICustomerService customerService = new CustomerService();
        boolean flag = true;
        while (flag){
            System.out.println("<--------------------> Customer Management <------------------------->");
            System.out.println("Chức Năng:  +" +
                    "\n 1.Display list customers" +
                    "\n 2.Add new customer" +
                    "\n 3.Edit customer" +
                    "\n 4.Return main menu" );
            System.out.println("Chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Display list employees");
                    List<Customer> customerList = customerService.getAll();
                    CustomerView.displayList(customerList);
                    break;
                case 2:
                    System.out.println("Add new customer");
                    Customer customer = CustomerView.inputDataCustomer();
                    boolean isAddSuccess = customerService.add(customer);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công...");
                    } else {
                        System.out.println("Thêm mới thất bại!!!");
                    }
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
