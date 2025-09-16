package bai_lam_then_mvc.controller;

import java.util.Scanner;

public class BankAccountController {
    public static void displayMenuBankAccount(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG-----");
            System.out.println("CHỨC NĂNG: " +
                    "\n1. Quản lý tài khoản tiết kiệm" +
                    "\n2. Quản lý tài khoản thanh toán"+
                    "\n3. Thoát chương trình");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Chức năng quản lý tài khoản tiết kiệm");
                    PaymentAccountController.displayMenuPaymentAccount();
                    break;
                case 2:
                    System.out.println("Chức năng quản lý tài khoản thanh toán");
                    SavingsAccountController.displayMenuSavingsAccount();
                    break;
                default:
                    System.out.println("Đã kết thúc chương trình");
                    flag = false;
                    break;
            }
        }
    }
}
