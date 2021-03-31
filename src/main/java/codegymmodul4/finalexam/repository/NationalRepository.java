package codegymmodul4.finalexam.repository;

import codegymmodul4.finalexam.model.National;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NationalRepository extends JpaRepository<National, Long> {
}
