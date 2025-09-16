package bai_lam_then_mvc.controller;

import bai_lam_then_mvc.entity.PaymentAccount;
import bai_lam_then_mvc.service.IPaymentAccountService;
import bai_lam_then_mvc.service.PaymentAccountService;
import bai_lam_then_mvc.view.PaymentAccountView;

import java.util.List;
import java.util.Scanner;

public class PaymentAccountController {
    public static void displayMenuPaymentAccount(){
        IPaymentAccountService paymentAccountService = new PaymentAccountService();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("-----Quản lý tài khoản tiết kiệm-----");
            System.out.println("Chức năng: " +
                    "\n 1. Thêm mới" +
                    "\n 2. Xóa" +
                    "\n 3. Xem danh sách các tài khoản ngân hàng" +
                    "\n 4. Tìm kiếm" +
                    "\n 5. Quay lại menu chính");
            System.out.println("Chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Thêm mới");
                    PaymentAccount paymentAccount = PaymentAccountView.inputDataPayment();
                    boolean isAddSuccess = paymentAccountService.add(paymentAccount);
                    if(isAddSuccess){
                        System.out.println("Thêm mới thành công...");
                    }else {
                        System.out.println("Thêm mới thất bại!!!");
                    }
                    break;
                case 2:
                    System.out.println("Xóa");
                    int deID = PaymentAccountView.deleteDataPayment();
                    if(deID != -1){
                        boolean isDeleteSuccess = paymentAccountService.delete(deID);
                        if(isDeleteSuccess){
                            System.out.println("Xóa thành công...");
                        }else {
                            System.out.println("Xóa thất bại !!!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Xem danh sách các tài khoản ngân hàng");
                    List<PaymentAccount> paymentAccountList = paymentAccountService.getAll();
                    PaymentAccountView.displayList(paymentAccountList);
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
