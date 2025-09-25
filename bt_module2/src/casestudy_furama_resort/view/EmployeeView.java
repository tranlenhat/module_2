package casestudy_furama_resort.view;

import casestudy_furama_resort.entity.Employee;
import casestudy_furama_resort.util.Validate;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private static Scanner scanner = new Scanner(System.in);

    public static void displayList(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static Employee inputDataEmployee() {
        String hoTen ="";
        do {
            System.out.println("Nhập tên nhân viên chữ đầu viết hoa");
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

        String maNv;
        do {
            System.out.println("Nhập mã nhân viên (dạng NV-YYYY):");
            maNv = scanner.nextLine();
        } while (!Validate.checkMaNv(maNv));

        System.out.println("Nhập trình độ (Trung cấp / Cao đẳng / Đại học / Sau đại học):");
        String trinhDo = scanner.nextLine();

        System.out.println("Nhập vị trí (Lễ tân / Phục vụ / Chuyên viên / Giám sát / Quản lý / Giám đốc):");
        String viTri = scanner.nextLine();

        System.out.println("Nhập lương:");
        double luong = Double.parseDouble(scanner.nextLine());
        
        Employee employee = new Employee(hoTen, ngaySinh, gioiTinh, soCmnd, soDt, email, maNv, trinhDo, viTri, luong);
        return employee;
    }
}
