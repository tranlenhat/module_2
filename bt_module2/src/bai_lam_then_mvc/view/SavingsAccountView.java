package bai_lam_then_mvc.view;

import bai_lam_then_mvc.entity.SavingsAccount;

import java.util.List;
import java.util.Scanner;

public class SavingsAccountView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayList(List<SavingsAccount> savingsAccountList){
        for (SavingsAccount savingsAccount : savingsAccountList){
            if(savingsAccountList != null){
                System.out.println(savingsAccountList);
            }else {
                break;
            }
        }
    }
    public static SavingsAccount inputDataSavings(){
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mã tài khoản");
        int maTk = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ tài khoản");
        String tenChuTk = scanner.nextLine();
        System.out.println("Nhập ngày tạo tài khoản");
        String ngayTaoTk = scanner.nextLine();
        System.out.println("Sô tiền gửi tài khoản");
        int soTienGuiTK = Integer.parseInt(scanner.nextLine());
        System.out.println("Ngày gửi tài khoản");
        int ngayGuiTk = Integer.parseInt(scanner.nextLine());
        System.out.println("Lãi suất");
        int laiSuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Kỳ hạn");
        int kyHan = Integer.parseInt(scanner.nextLine());
        SavingsAccount savingsAccount = new SavingsAccount(id,maTk,tenChuTk,ngayTaoTk,soTienGuiTK,ngayGuiTk,laiSuat,kyHan);
        return savingsAccount;
    }
    public static Integer deleteDataSavings(){
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
