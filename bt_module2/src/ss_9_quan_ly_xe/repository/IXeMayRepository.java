package ss_9_quan_ly_xe.repository;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeMay;

import java.util.List;

public interface IXeMayRepository {
    List<XeMay> finAllXeMay();
    boolean addXeMay(XeMay xeMay);
}
