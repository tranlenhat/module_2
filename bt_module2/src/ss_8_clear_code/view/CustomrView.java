package ss_8_clear_code.view;

import ss_8_clear_code.entity.Customr;

import java.util.List;
import java.util.Scanner;

public class CustomrView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayCustomr(List<Customr> customrList){
        for (Customr customr : customrList){
            if(customr != null){
                System.out.println(customr);
            }else {
                break;
            }
        }
    }
    public static Customr inputDataForNewCustomr(){
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap Ten");
        String ten = scanner.nextLine();

        System.out.println("Nhap email");
        String email = scanner.nextLine();

        System.out.println("Nhap Dia Chi");
        String address = scanner.nextLine();

        Customr customr = new Customr(id,ten,email,address);
        return customr;
    }
    public static int deleteDataForNewCustomr(){
        System.out.print("Nhap id muon xoa: ");
        int delId = Integer.parseInt(scanner.nextLine());
        return delId;
    }
    public static int inputIdForSearch(){
        System.out.println("Nhap id muon tim");
        return Integer.parseInt(scanner.nextLine());
    }
}
