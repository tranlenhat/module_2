package casestudy_furama_resort.repository;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private final String CUSTOMER_FILE = "src/casestudy_furama_resort/data/customer.csv";
    @Override
    public List getAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(CUSTOMER_FILE);
            String[] array = null;
            for (int i = 0; i < stringList.size(); i++){

            }
        } catch (IOException e) {
            System.out.println("Đọc File lỗi");
        }
        return List.of();
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean delete(Object o) {
        return false;
    }
}
