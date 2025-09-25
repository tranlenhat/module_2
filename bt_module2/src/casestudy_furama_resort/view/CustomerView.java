package casestudy_furama_resort.view;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.util.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<Customer> customerList) {
        for (Customer customer : customerList) {
            if (customer != null) {
                System.out.println(customer);
            }
        }
    }

    public static Customer inputDataCustomer() {
        String hoTen ="";
        do {
            System.out.println("Nhập tên khách hàng chữ đầu viết hoa");
            hoTen =scanner.nextLine();
        }while (!Validate.checkName(hoTen));

        System.out.println("Nhập ngày sinh (yyyy):");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhập giới tính:");
        String gioiTinh = scanner.nextLine();

        String soCmnd;
        do {
            System.out.println("Nhập số CMND (9 hoặc 12 số):");
            soCmnd = scanner.nextLine();
        } while (!Validate.checkCmnd(soCmnd));

        String soDt;
        do {
            System.out.println("Nhập số điện thoại (10 số, bắt đầu từ 0):");
            soDt = scanner.nextLine();
        } while (!Validate.checkSoDienThoai(soDt));

        System.out.println("Nhập email:");
        String email = scanner.nextLine();

        String maKh;
        do {
            System.out.println("Nhập mã khách hàng (dạng KH-YYYY):");
            maKh = scanner.nextLine();
        } while (!Validate.checkMaKh(maKh));

        System.out.println("Nhập loại khách:");
        String loaiKhach = scanner.nextLine();

        System.out.println("Nhập địa chỉ:");
        String diaChi = scanner.nextLine();

        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email, maKh, loaiKhach, diaChi);
        return customer;
    }
}
