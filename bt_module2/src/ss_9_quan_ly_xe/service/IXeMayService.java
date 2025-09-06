package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.PhuongTien;
import ss_9_quan_ly_xe.entity.XeMay;

import java.util.List;

public interface IXeMayService {
    List<XeMay> findAllXeMay();
    boolean addXeMay(XeMay xeMay);
    boolean deleteXeMay(int id);
}
