package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeMay;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IXeMayRepository{
    private static List<XeMay> xeMaysList = new ArrayList<>();
    static {
            xeMaysList.add(new XeMay(1, "59A1-12345", "Honda",  2020, "NhatLee", 110));
            xeMaysList.add(new XeMay(2, "59B2-67890", "Yamaha", 2021, "NhatLee",   150));
            xeMaysList.add(new XeMay(3, "59C3-54321", "Suzuki", 2019, "NhatLee",     125));
    }
    @Override
    public List<XeMay> finAllXeMay() {
        return xeMaysList;
    }

    @Override
    public boolean addXeMay(XeMay xeMay) {
        xeMaysList.add(xeMay);
        return true;
    }
}
