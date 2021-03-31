package codegymmodul4.finalexam.repository;

import codegymmodul4.finalexam.model.National;
import codegymmodul4.finalexam.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProvinceRepository extends JpaRepository<Province, Long> {

    List<Province> findAllByNational(National national);
}
