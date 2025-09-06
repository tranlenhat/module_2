package ss_9_quan_ly_xe.controller;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeMay;
import ss_9_quan_ly_xe.service.IXeMayService;
import ss_9_quan_ly_xe.service.XeMayService;
import ss_9_quan_ly_xe.view.XeMayView;

import java.util.List;
import java.util.Scanner;

public class QuanLyXeMayController {
    private static IXeMayService xeMayService = new XeMayService();
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("------------------> Quản Lý Xe Máy <-----------------------");
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
                    List<XeMay> xeMayList = xeMayService.findAllXeMay();
                    for (XeMay xeMay : xeMayList){
                        System.out.println(xeMay);
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    XeMay xeMay = XeMayView.inputDataXeMay();
                    boolean flag2 = xeMayService.addXeMay(xeMay);
                    if(flag2){
                        System.out.println("Thêm mới thành công...");
                    }else {
                        System.out.println("Thêm mới thất bại...");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    int delID = XeMayView.deleteXeMay();
                    boolean flag3 = xeMayService.deleteXeMay(delID);
                    if(flag3){
                        System.out.println("Xóa ID thành công");
                    }else {
                        System.out.println("Không tìm thấy ID");
                    }
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
