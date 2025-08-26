package ss_8_clear_code.view;

import ss_8_clear_code.entity.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);
    public static void displayCustomr(List<Customer> customrList){
        for (Customer customr : customrList){
            if(customr != null){
                System.out.println(customr);
            }else {
                break;
            }
        }
    }
    public static Customer inputDataForNewCustomr(){
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhap Ten");
        String ten = scanner.nextLine();

        System.out.println("Nhap email");
        String email = scanner.nextLine();

        System.out.println("Nhap Dia Chi");
        String address = scanner.nextLine();

        Customer customr = new Customer(id,ten,email,address);
        return customr;
    }
    public static int deleteDataForNewCustomr(){
        System.out.print("Nhap id muon xoa: ");
        int delId = Integer.parseInt(scanner.nextLine());
        return delId;
    }
    public static String inputIdForSearch(){
        System.out.println("Nhap ten muon tim");
        return  scanner.nextLine();
    }
}
