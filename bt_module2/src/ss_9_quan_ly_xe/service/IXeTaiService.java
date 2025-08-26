package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.XeTai;

import java.util.List;

public interface IXeTaiService {
    List<XeTai> findXeTai();
    boolean addXeTai(XeTai xeTai);
}
