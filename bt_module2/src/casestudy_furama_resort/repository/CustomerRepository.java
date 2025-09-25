package casestudy_furama_resort.repository;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String CUSTOMER_FILE = "src/casestudy_furama_resort/data/customer.csv";

    @Override
    public List<Customer> getAll() {
        List<Customer> customerList = new LinkedList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER_FILE);
            String[] array = null;
            for (int i = 0; i <stringList.size() ; i++) {
                array = stringList.get(i).split(",");
                Customer customer = new Customer(
                        array[0],                          // hoTen
                        array[1],        // ngaySinh
                        array[2],                          // gioiTinh
                        array[3],        // soCmnd
                        array[4],        // soDt
                        array[5],                          // email
                        array[6],        // maKh
                        array[7],                          // loaiKhach
                        array[8]                           // diaChi
                );
                customerList.add(customer);
            }
        } catch (IOException e) {
            System.out.println("Đọc file lỗi: " + e.getMessage());
        }
        return customerList;
    }

    @Override
    public boolean add(Customer customer) {
        List<String> list = new ArrayList<>();
        list.add(customer.getInFoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(Customer customer) {
        List<Customer> customerList = getAll();
        boolean isSuccessEdit = false;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getMaKh().equals(customer.getMaKh())) {
                customerList.set(i, customer);
                isSuccessEdit = true;
                break;
            }
        }
        if (isSuccessEdit) {
            List<String> stringList = new ArrayList<>();
            for (Customer c : customerList) {
                stringList.add(c.getInFoToCSV());
            }
            try {
                ReadAndWriteFile.writeListStringToCSV(CUSTOMER_FILE, stringList, false);
            } catch (IOException e) {
                System.out.println("Lỗi ghi file: " + e.getMessage());
                return false;
            }
        }
        return isSuccessEdit;
    }
}
