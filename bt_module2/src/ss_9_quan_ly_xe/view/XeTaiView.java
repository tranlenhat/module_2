package ss_9_quan_ly_xe.view;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.entity.XeMay;
import ss_9_quan_ly_xe.entity.XeTai;

import java.util.List;
import java.util.Scanner;

public class XeTaiView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayXeTai(List<XeTai> xeTaiList){
        for (XeTai xeTai :xeTaiList){
            if (xeTai == null){
                System.out.println(xeTai);
            }else {
                break;
            }
        }
    }
    public static XeTai inputDataXeTai(){
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

        System.out.println("Trọng Tải");
        int trongTai = Integer.parseInt(scanner.nextLine());

        XeTai xeTai = new XeTai(id,bienKiemSoat,tenHangSX,namSX,chuSoHuu,trongTai);
        return xeTai;
    }
    public static int deleteXeTai(){
        System.out.println("Nhập ID cần xóa");
        int delID = Integer.parseInt(scanner.nextLine());
        return delID;
    }
}
