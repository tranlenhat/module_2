package ss_8_clear_code.service;

import ss_8_clear_code.entity.Customr;
import ss_8_clear_code.resository.CustomrResository;
import ss_8_clear_code.resository.ICustomrResository;

import java.util.ArrayList;
import java.util.List;

public class CustomrService implements ICustomrService {
    private ICustomrResository customrResository = new CustomrResository();

    @Override
    public void addCustomr(Customr customr) {

    }

    @Override
    public List<Customr> findAll() {
        return customrResository.findAll();
    }


    @Override
    public boolean add(Customr customr) {
        List<Customr> customrs = customrResository.findAll();
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
    public Customr search(int id) {
        return customrResository.search(id);
    }
}
