package casestudy_furama_resort.service;

import casestudy_furama_resort.entity.Employee;
import casestudy_furama_resort.repository.EmployeeRepository;
import casestudy_furama_resort.repository.IEmployeeRepository;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> getAll() {
        return employeeRepository.getAll();
    }

    @Override
    public boolean add(Employee employee) {
        List<Employee> employeeList = employeeRepository.getAll();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i) != null) {
                if (employeeList.get(i).getMaNv() == employee.getMaNv()) {
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            } else {
                break;
            }
        }
        return employeeRepository.add(employee);
    }


    @Override
    public boolean edit(Employee employee) {
        return false;
    }
}
