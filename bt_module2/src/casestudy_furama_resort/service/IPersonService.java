package casestudy_furama_resort.service;

import casestudy_furama_resort.entity.Employee;

import java.util.List;

public interface IPersonService<T> {
    List<T> getAll();
    boolean add(T t);
    boolean edit(T t);
}
