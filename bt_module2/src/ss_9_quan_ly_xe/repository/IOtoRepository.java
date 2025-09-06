package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.entity.PhuongTien;

import java.util.List;

public interface IOtoRepository {
    List<Oto> findOto();
    boolean addOto(Oto oto);
    boolean deleteOto(int id);
}
