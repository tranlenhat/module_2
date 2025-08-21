package ss_8_clear_code.resository;

import ss_8_clear_code.entity.Customr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CustomrResository implements ICustomrResository{
    private static List<Customr> customrs = new ArrayList<>();
    static {
        customrs.add(new Customr(1, "Nhat", "Trannsqiw", "91 nht"));
        customrs.add(new Customr(2, "Nam", "nam@gmail.com", "Ha Noi"));
    }

    @Override
    public void addCustomr(Customr customr) {
        customrs.add(customr);
    }

    @Override
    public List<Customr> findAll() {
        return customrs;
    }

    @Override
    public boolean add(Customr customr) {
        return customrs.add(customr);
    }

    @Override
    public boolean delete(int id) {
        for (Customr customr : customrs) {
            if (customr.getId() == id) {
                customrs.remove(customr);
                return true;
            }
        }
        return false;
    }

    @Override
    public Customr search(int id) {
        for (Customr customr : customrs){
            if(customr.getId() == id){
                return customr;
            }
        }
        return null;
    }


}
