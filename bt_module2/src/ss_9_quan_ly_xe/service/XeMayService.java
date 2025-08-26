package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.XeMay;
import ss_9_quan_ly_xe.repository.IXeMayRepository;
import ss_9_quan_ly_xe.repository.XeMayRepository;

import java.util.List;

public class XeMayService implements IXeMayService{
    private IXeMayRepository xeMayRepository = new XeMayRepository();

    @Override
    public List<XeMay> findAllXeMay() {
        return xeMayRepository.finAllXeMay();
    }

    @Override
    public boolean addXeMay(XeMay xeMay) {
        List<XeMay> xeMayList = xeMayRepository.finAllXeMay();
        for (int i = 0; i < xeMayList.size(); i++) {
            if (xeMayList.get(i) == null){
                if(xeMayList.get(i).getId() == xeMay.getId()){
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            }
        }
        return xeMayRepository.addXeMay(xeMay);
    }
}
