package ss_9_quan_ly_xe.controller;

import ss_8_clear_code.view.CustomerView;
import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.service.IOtoService;
import ss_9_quan_ly_xe.service.OtoService;
import ss_9_quan_ly_xe.view.OtoView;

import java.util.List;
import java.util.Scanner;

public class QuanLyOtoController {
    private static IOtoService otoService = new OtoService();
    public static void displayMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("<--------------------> Quản Lý Oto <------------------------->");
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
                    List<Oto> otosList = otoService.findOto();
                    for (Oto oto : otosList) {
                        System.out.println(oto);
                    }
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Oto oto = OtoView.inputDataOto();
                    boolean isAddSuccess = otoService.addOto(oto);
                    if(isAddSuccess){
                        System.out.println("Thêm mới thành công...");
                    }else {
                        System.out.println("Thêm mới thất bại!!!");
                    }
                    break;
                case 3:
                    System.out.println("Xoá");
                    int delID = OtoView.deleteOto();
                    boolean isDeleteSuccess = otoService.deleteOto(delID);
                    if (isDeleteSuccess){
                        System.out.println("Xóa ID thành công...");
                    }else {
                        System.out.println("Không Tìm Thấy ID...");
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
