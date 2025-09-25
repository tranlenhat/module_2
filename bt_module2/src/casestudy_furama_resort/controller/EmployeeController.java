package casestudy_furama_resort.controller;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.entity.Employee;
import casestudy_furama_resort.service.CustomerService;
import casestudy_furama_resort.service.EmployeeService;
import casestudy_furama_resort.service.ICustomerService;
import casestudy_furama_resort.service.IEmployeeService;
import casestudy_furama_resort.view.CustomerView;
import casestudy_furama_resort.view.EmployeeView;

import java.util.List;
import java.util.Scanner;

public class EmployeeController {
    public static void displayMenu(){
        IEmployeeService employeeService = new EmployeeService();
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
                    List<Employee> employeeList = employeeService.getAll();
                    EmployeeView.displayList(employeeList);
                    break;
                case 2:
                    System.out.println("Add new employee");
                    Employee employee = EmployeeView.inputDataEmployee();
                    boolean isAddSuccess = employeeService.add(employee);
                    if(isAddSuccess){
                        System.out.println("Thêm mới thành công...");
                    }else {
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
