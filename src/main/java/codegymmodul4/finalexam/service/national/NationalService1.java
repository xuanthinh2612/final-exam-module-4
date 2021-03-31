package codegymmodul4.finalexam.service.national;

import codegymmodul4.finalexam.model.National;
import codegymmodul4.finalexam.repository.NationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationalService1 implements INationalService {

    @Autowired
    NationalRepository nationalRepository;

    @Override
    public List<National> findALl() {
        List<National> nationalList = nationalRepository.findAll();
        return nationalList;
    }

    @Override
    public Page<National> findALl(Pageable pageable) {
        return null;
    }

    @Override
    public National findById(Long id) {
        return null;
    }

    @Override
    public National save(National national) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
