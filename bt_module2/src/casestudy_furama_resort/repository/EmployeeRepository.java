package casestudy_furama_resort.repository;

import casestudy_furama_resort.entity.Employee;
import casestudy_furama_resort.util.ReadAndWriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_FILE = "src/casestudy_furama_resort/data/employee.csv";

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new LinkedList<>();

        try {
            List<String> stringList = ReadAndWriteFile.readFileCSV(EMPLOYEE_FILE);
            String[] array = null;
            for (int i = 0; i <stringList.size() ; i++) {
                array = stringList.get(i).split(",");
                Employee employee = new Employee(
                        array[0],                         // hoTen
                        array[1],       // ngaySinh
                        array[2],                         // gioiTinh
                        array[3],       // soCmnd
                        array[4],       // soDt
                        array[5],                         // email
                        array[6],       // maNv
                        array[7],                         // trinhDo
                        array[8],                         // viTri
                        Double.parseDouble(array[9])      // luong
                );
                employeeList.add(employee);
            }
        } catch (IOException e) {
            System.out.println("Đọc File lỗi");
        }
        return employeeList;
    }

    @Override
    public boolean add(Employee employee) {
        List<String> list = new ArrayList<>();
        list.add(employee.getInFoToCSV());
        try {
            ReadAndWriteFile.writeListStringToCSV(EMPLOYEE_FILE, list, true);
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
            return false;
        }
        return true;
    }

    @Override
    public boolean edit(Employee employee) {
        return false;
    }
}
