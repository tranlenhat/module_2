package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.entity.PhuongTien;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IOtoRepository{
    private static List<Oto> otosList = new ArrayList<>();
    static {
        otosList.add(new Oto(1,"43B-777.77","HuynhDai",  2025,"NhatLee",49,"Xe du lịch"));
        otosList.add(new Oto(2,"43B-888.88","KimLong",2025,"NhatLee",49,"Xe khách"));
        otosList.add(new Oto(3,"43B-999.99","Thaco",  2025,"NhatLee",49,"Xe du lịch"));
    }
    @Override
    public List<Oto> findOto() {
        return otosList;
    }

    @Override
    public boolean addOto(Oto oto) {
        otosList.add(oto);
        return true;
    }
}
