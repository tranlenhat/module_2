package ss_8_clear_code.resository;

import ss_8_clear_code.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1, "Nhất", "Trannsqiw@gmail.com", "Da Nang"));
        customerList.add(new Customer(2, "Nam", "namqwerfg@gmail.com", "Gia Lai"));
    }

    @Override
    public void addCustomr(Customer customr) {
        customerList.add(customr);
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public boolean add(Customer customr) {
        return customerList.add(customr);
    }

    @Override
    public boolean delete(int id) {
        for (Customer customr : customerList) {
            if (customr.getId() == id) {
                customerList.remove(customr);
                return true;
            }
        }
        return false;
    }

    @Override
    public List <Customer> search(String name) {
        List<Customer> searchList = new ArrayList<>();
        for (Customer customer : customerList){
            if(customer.getName().contains(name) ){
                searchList.add(customer);
            }
        }
        return searchList;
    }


}
