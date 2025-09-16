package bai_lam_then_mvc.controller;

import bai_lam_then_mvc.entity.SavingsAccount;
import bai_lam_then_mvc.service.ISavingsAccountService;
import bai_lam_then_mvc.service.SavingsAccountService;
import bai_lam_then_mvc.view.SavingsAccountView;

import java.util.List;
import java.util.Scanner;

public class SavingsAccountController {
    public static void displayMenuSavingsAccount(){
        ISavingsAccountService savingsAccountService = new SavingsAccountService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----Quản lý tài khoản thanh toán-----");
            System.out.println("Chức năng: " +
                    "\n 1. Thêm mới" +
                    "\n 2. Xóa" +
                    "\n 3. Xem danh sách các tài khoản ngân hàng" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Qua lại menu chính");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Thêm mới");
                    SavingsAccount savingsAccount = SavingsAccountView.inputDataSavings();
                    boolean isAddSuccess = savingsAccountService.add(savingsAccount);
                    if(isAddSuccess){
                        System.out.println("Thêm mới thành công...");
                    }else {
                        System.out.println("Thêm mới thất bại !!!");
                    }
                    break;
                case 2:
                    System.out.println("Xóa");
                    break;
                case 3:
                    System.out.println("Xem danh sách các tài khoản ngân hàng");
                    List<SavingsAccount> savingsAccountList = savingsAccountService.getAll();
                    SavingsAccountView.displayList(savingsAccountList);
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
