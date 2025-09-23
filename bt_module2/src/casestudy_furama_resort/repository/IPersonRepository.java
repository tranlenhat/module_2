package casestudy_furama_resort.repository;

import java.util.List;

public interface IPersonRepository<T> {
    List<T> getAll();
    boolean add(T t);
    boolean delete(T t);
}
