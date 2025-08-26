package ss_8_clear_code.controller;

import ss_8_clear_code.entity.Customer;
import ss_8_clear_code.service.CustomerService;
import ss_8_clear_code.service.ICustomerService;
import ss_8_clear_code.view.CustomerView;

import java.util.List;
import java.util.Scanner;

public class CustomerController {
    private static ICustomerService customrService = new CustomerService();
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("----------Quan ly khach hang--------------");
            System.out.println("Chuc nang:  +" +
                    "\n 1.Danh Sach" +
                    "\n 2.Them moi" +
                    "\n 3.Xoa" +
                    "\n 4.Tim kiem"+
                    "\n 5.Quay lai menu chinh");
            System.out.println("Chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<Customer> customrList = customrService.findAll();
                    CustomerView.displayCustomr(customrList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customer customr = CustomerView.inputDataForNewCustomr();
                    boolean isAddSuccess = customrService.add(customr);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    int delId = CustomerView.deleteDataForNewCustomr();
                    boolean isDeleteSuccess = customrService.delete(delId);
                    if (isDeleteSuccess){
                        System.out.println("Da Xoa ID Thanh Cong");
                    }else {
                        System.out.println("Khong Tim Thay ID");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    String name = CustomerView.inputIdForSearch();
                    List<Customer> customerList = customrService.search(name);
                    if(customerList.isEmpty()){
                        CustomerView.displayCustomr(customerList);
                    }else {
                        System.out.println("Khong tim thay khach hang");
                    }
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
}
}