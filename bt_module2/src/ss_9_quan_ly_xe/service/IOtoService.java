package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.entity.PhuongTien;

import java.util.List;

public interface IOtoService {
    List<Oto> findOto();
    boolean addOto(Oto oto);
}
