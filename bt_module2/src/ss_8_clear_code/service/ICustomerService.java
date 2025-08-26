package ss_8_clear_code.service;

import ss_8_clear_code.entity.Customer;

import java.util.List;

public interface ICustomerService {
    void addCustomr(Customer customr);
    List<Customer> findAll();
    boolean add(Customer customr);
    boolean delete(int id);
    List<Customer> search(String name);
}
