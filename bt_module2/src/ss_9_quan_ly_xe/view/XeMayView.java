package ss_9_quan_ly_xe.view;
import ss_9_quan_ly_xe.entity.XeMay;

import java.util.List;
import java.util.Scanner;

public class XeMayView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayXeMay(List<XeMay> xeMayList){
        for (XeMay xeMay : xeMayList){
            if (xeMay == null){
                System.out.println(xeMay);
            }else {
                break;
            }
        }
    }
    public static XeMay inputDataXeMay(){
        System.out.println("Nhập ID");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập Biển Kiểm Soát");
        String bienKiemSoat = scanner.nextLine();

        System.out.println("Tên Hãng SX");
        String tenHangSX = scanner.nextLine();

        System.out.println("Năm Sản Xuất");
        int namSX = Integer.parseInt(scanner.nextLine());

        System.out.println("Chủ Sở Hữu");
        String chuSoHuu = scanner.nextLine();

        System.out.println("Công Suất");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(id,bienKiemSoat,tenHangSX,namSX,chuSoHuu,congSuat);
        return xeMay;
    }
    public static int deleteXeMay(){
        System.out.println("Nhập ID cần xóa");
        int delID = Integer.parseInt(scanner.nextLine());
        return delID;
    }
}
