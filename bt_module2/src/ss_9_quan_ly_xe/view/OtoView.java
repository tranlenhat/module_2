package ss_9_quan_ly_xe.view;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.entity.PhuongTien;

import java.util.List;
import java.util.Scanner;

public class OtoView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayOto(List<Oto> otoList){
        for (Oto oto :otoList){
            if (oto == null){
                System.out.println(oto);
            }else {
                break;
            }
        }
    }
    public static Oto inputDataOto(){
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

        System.out.println("Số Chỗ Ngồi");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());

        System.out.println("Kiểu Xe");
        String kieuXe = scanner.nextLine();

        Oto oto = new Oto(id,bienKiemSoat,tenHangSX,namSX,chuSoHuu,soChoNgoi,kieuXe);
        return oto;
    }
}
