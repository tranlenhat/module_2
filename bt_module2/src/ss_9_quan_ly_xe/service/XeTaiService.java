package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.XeTai;
import ss_9_quan_ly_xe.repository.IXeTaiRepository;
import ss_9_quan_ly_xe.repository.XeTaiRepository;

import java.util.List;

public class XeTaiService implements IXeTaiService{
    private IXeTaiRepository xeTaiRepository = new XeTaiRepository();

    @Override
    public List<XeTai> findXeTai() {
        return xeTaiRepository.finaAllXeTai();
    }

    @Override
    public boolean addXeTai(XeTai xeTai) {
        List<XeTai> xeTaiList = xeTaiRepository.finaAllXeTai();
        for (int i = 0; i < xeTaiList.size(); i++) {
            if (xeTaiList.get(i) == null){
                if(xeTaiList.get(i).getId() == xeTai.getId()){
                    System.out.println("ID đã tồn tại");
                    return false;
                }
            }
        }
        return xeTaiRepository.addXeTai(xeTai);
    }

    @Override
    public boolean deleteXeTai(int id) {
        return xeTaiRepository.deleteXeTai(id);
    }
}
