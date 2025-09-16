package bai_lam_then_mvc.repository;

import java.util.List;

public interface IBankAccountRepository<T> {
    List<T> getAll();
    boolean add(T t);
    boolean delete(int id);
}
