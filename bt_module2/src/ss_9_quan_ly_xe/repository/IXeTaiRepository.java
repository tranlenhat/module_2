package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeTai;

import java.util.List;

public interface IXeTaiRepository {
    List<XeTai> finaAllXeTai();
    boolean addXeTai(XeTai xeTai);
}
