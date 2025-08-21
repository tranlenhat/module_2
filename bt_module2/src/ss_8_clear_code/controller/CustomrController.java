package ss_8_clear_code.controller;

import ss_8_clear_code.entity.Customr;
import ss_8_clear_code.service.CustomrService;
import ss_8_clear_code.service.ICustomrService;
import ss_8_clear_code.view.CustomrView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomrController {
    private static ICustomrService customrService = new CustomrService();
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
                    List<Customr> customrList = customrService.findAll();
                    CustomrView.displayCustomr(customrList);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Customr customr = CustomrView.inputDataForNewCustomr();
                    boolean isAddSuccess = customrService.add(customr);
                    if (isAddSuccess) {
                        System.out.println("Thêm mới thành công");
                    } else {
                        System.out.println("Thêm mới không thành công");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    int delId = CustomrView.deleteDataForNewCustomr();
                    boolean isDeleteSuccess = customrService.delete(delId);
                    if (isDeleteSuccess){
                        System.out.println("Da Xoa ID Thanh Cong");
                    }else {
                        System.out.println("Khong Tim Thay ID");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm");
                    int searchId = CustomrView.inputIdForSearch();
                    Customr foud = customrService.search(searchId);
                    if(foud != null){
                        System.out.println("Khach hang tim thay " + foud);
                    }else {
                        System.out.println("Khong tim thay khach hang"+foud);
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