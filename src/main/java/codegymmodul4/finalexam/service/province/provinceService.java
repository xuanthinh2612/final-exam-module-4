package codegymmodul4.finalexam.service.province;

import codegymmodul4.finalexam.model.National;
import codegymmodul4.finalexam.model.Province;
import codegymmodul4.finalexam.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class provinceService implements IProvinceService{

    @Autowired
    ProvinceRepository provinceRepository;

    @Override
    public List<Province> findALl() {
        return provinceRepository.findAll();
    }

    @Override
    public Page<Province> findALl(Pageable pageable) {
        return null;
    }

    @Override
    public Province findById(Long id) {
        return provinceRepository.findById(id).get();
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public void deleteById(Long id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public List<Province> findAllByNational(National national){
        return provinceRepository.findAllByNational(national);
    }
}
