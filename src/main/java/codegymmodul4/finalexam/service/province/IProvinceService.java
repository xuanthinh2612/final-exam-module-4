package codegymmodul4.finalexam.service.province;

import codegymmodul4.finalexam.model.National;
import codegymmodul4.finalexam.model.Province;
import codegymmodul4.finalexam.service.IService;

import java.util.List;

public interface IProvinceService extends IService<Province> {

    List<Province> findAllByNational(National national);
}
