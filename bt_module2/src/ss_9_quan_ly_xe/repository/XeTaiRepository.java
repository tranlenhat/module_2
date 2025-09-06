package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeMay;
import ss_9_quan_ly_xe.entity.XeTai;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IXeTaiRepository{
    private static List<XeTai> xeTaiList = new ArrayList<>();
    static {
        xeTaiList.add(new XeTai(1, "51D-12345", "Hyundai", 2019, "NhatLee", 5000));
        xeTaiList.add(new XeTai(2, "51C-67890", "Isuzu", 2020, "NhatLee", 3500));
        xeTaiList.add(new XeTai(3, "51E-24680", "Hino", 2021, "NhatLee", 7000));
    }

    @Override
    public List<XeTai> finaAllXeTai() {
        return xeTaiList;
    }

    @Override
    public boolean addXeTai(XeTai xeTai) {
        return false;
    }

    @Override
    public boolean deleteXeTai(int id) {
        for (XeTai xeTai : xeTaiList){
            if (xeTai.getId() == id){
                xeTaiList.remove(xeTai);
                return true;
            }
        }
        return false;
    }
}
