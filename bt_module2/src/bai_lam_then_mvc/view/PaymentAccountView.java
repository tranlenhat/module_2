package bai_lam_then_mvc.view;

import bai_lam_then_mvc.entity.PaymentAccount;

import java.util.List;
import java.util.Scanner;

public class PaymentAccountView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<PaymentAccount> paymentList){
        for (PaymentAccount paymentAccount : paymentList){
            if(paymentAccount != null){
                System.out.println(paymentAccount);
            }else {
                break;
            }
        }
    }
    public static PaymentAccount inputDataPayment(){
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã tài khoản");
        int maTk = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ tài khoản");
        String tenChuTk = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String ngayTaoTk = scanner.nextLine();
        System.out.println("Nhập số thẻ");
        int soThe = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số tiền trong thẻ");
        int soTienTrongThe = Integer.parseInt(scanner.nextLine());
        PaymentAccount paymentAccount = new PaymentAccount(id,maTk,tenChuTk,ngayTaoTk,soThe,soTienTrongThe);
        return paymentAccount;
    }
    public static Integer deleteDataPayment(){
        System.out.println("Nhập ID cần xóa (Hoặc muốn hủy nhập: ok để hủy)");
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("ok")){
            System.out.println("Hủy thao tác xóa");
            return -1;
        }
        int deleteID;
        try {
            deleteID = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("ID không hợp lệ, hủy thao tác.");
            return -1;
        }

        System.out.println("Bạn chắc chắn muốn xóa tài khoản với ID = " + deleteID + " Không ? chọn (yes/no)");
        String conFirm = scanner.nextLine();
        if(conFirm.equalsIgnoreCase("yes")){
            return deleteID;
        }else {
            System.out.println("Hủy thao tác xóa");
            return null;
        }

    }
}
