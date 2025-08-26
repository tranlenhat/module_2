package ss_9_quan_ly_xe.controller;

import ss_9_quan_ly_xe.entity.XeTai;
import ss_9_quan_ly_xe.service.IXeTaiService;
import ss_9_quan_ly_xe.service.XeTaiService;
import ss_9_quan_ly_xe.view.XeMayView;
import ss_9_quan_ly_xe.view.XeTaiView;

import java.util.List;
import java.util.Scanner;

public class QuanLyXeTaiController {
    private static IXeTaiService xeTaiService = new XeTaiService();
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("----------Quản Lý Xe Tải--------------");
            System.out.println("Chức Năng:  +" +
                    "\n 1.Danh Sách" +
                    "\n 2.Thêm Mới" +
                    "\n 3.Xóa" +
                    "\n 4.Tìm Kiếm"+
                    "\n 5.Quay Lại Menu Chính");
            System.out.println("Chọn chức năng");
            Scanner scanner = new Scanner(System.in);
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách");
                    List<XeTai> xeTaiList = xeTaiService.findXeTai();
                    for (XeTai xeTai : xeTaiList){
                        System.out.println(xeTai);
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    XeTai xeTai = XeTaiView.inputDataXeTai();
                    boolean flag3 = xeTaiService.addXeTai(xeTai);
                    if(flag3){
                        System.out.println("Thêm mới thành công...");
                    }else {
                        System.out.println("Thêm mới thất bại...");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
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
