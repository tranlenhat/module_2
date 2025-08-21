package ss_8_clear_code.service;

import ss_8_clear_code.entity.Customr;

import java.util.List;

public interface ICustomrService {
    void addCustomr(Customr customr);
    List<Customr> findAll();
    boolean add(Customr customr);
    boolean delete(int id);
    Customr search(int id);
}
