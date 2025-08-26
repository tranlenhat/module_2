package ss_9_quan_ly_xe.service;

import ss_9_quan_ly_xe.entity.Oto;
import ss_9_quan_ly_xe.repository.IOtoRepository;
import ss_9_quan_ly_xe.repository.OtoRepository;

import java.util.List;

public class OtoService implements IOtoService{
    private IOtoRepository otoRepository = new OtoRepository();
    @Override
    public List<Oto> findOto() {
        return otoRepository.findOto();
    }

    @Override
    public boolean addOto(Oto oto) {
        List<Oto> otoList = otoRepository.findOto();
        for (int i = 0; i < otoList.size(); i++) {
            if (otoList.get(i) != null){
                if (otoList.get(i).getId() == oto.getId()){
                    System.out.println("Id đã tồn tại");
                    return false;
                }
            }
        }
        return otoRepository.addOto(oto);
    }
}
