package casestudy_furama_resort.service;

import casestudy_furama_resort.entity.Customer;
import casestudy_furama_resort.repository.CustomerRepository;
import casestudy_furama_resort.repository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    private ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public boolean add(Customer customer) {
        List<Customer> customerList = customerRepository.getAll();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i) != null) {
                if (customerList.get(i).getMaKh() == customer.getMaKh()) {
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            } else {
                break;
            }
        }
        return customerRepository.add(customer);
    }

    @Override
    public boolean edit(Customer customer) {
        return false;
    }
}
