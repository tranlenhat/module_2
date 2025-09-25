package ss_8_clear_code.service;

import ss_8_clear_code.entity.Customer;
import ss_8_clear_code.resository.CustomerRepository;
import ss_8_clear_code.resository.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService {
    private ICustomerRepository customrResository = new CustomerRepository();

    @Override
    public void addCustomr(Customer customr) {
        return;
    }

    @Override
    public List<Customer> findAll() {
        return customrResository.findAll();
    }


    @Override
    public boolean add(Customer customr) {
        List<Customer> customrs = customrResository.findAll();
        for (int i = 0; i < customrs.size(); i++) {
            if (customrs.get(i) != null) {
                if (customrs.get(i).getId()==customr.getId()){
                    System.out.println("id đã tồn tại");
                    return false;
                }
            }
        }
        return customrResository.add(customr);
    }

    @Override
    public boolean delete(int id) {
        return customrResository.delete(id);
    }

    @Override
    public List <Customer> search(String name) {
        return  customrResository.search(name);
    }


}
