package casestudy_furama_resort.repository;

import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    @Override
    public List getAll() {
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
