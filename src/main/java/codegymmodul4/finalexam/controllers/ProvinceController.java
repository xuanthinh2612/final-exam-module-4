package codegymmodul4.finalexam.controllers;


import codegymmodul4.finalexam.model.National;
import codegymmodul4.finalexam.model.Province;
import codegymmodul4.finalexam.service.national.INationalService;
import codegymmodul4.finalexam.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@Validated
@RequestMapping("/")
public class ProvinceController {

    @Autowired
    IProvinceService provinceService;
    @Autowired
    private INationalService nationalService;
//
//    @ModelAttribute("nationalList")
//    private List<National> nationalList() {
//        List<National> nationalList =  nationalService.findALl();
//        return nationalList;
//    }

    @GetMapping("/showList")
    public ModelAndView showAllProvince() {
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("provinceList", provinceService.findALl());
        return modelAndView;
    }

    @GetMapping("/getDetail/{id}")
    public ModelAndView getProvinceDetail(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/provinceDetail");
        Province province = provinceService.findById(id);
        modelAndView.addObject("province", province);
        return modelAndView;
    }

    @GetMapping("/createNew")
    public ModelAndView ShowCreateForm() {
        List<National> nationalList =  nationalService.findALl();
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("province", new Province());
        modelAndView.addObject("nationalList", nationalList);

        return modelAndView;
    }

    @PostMapping("/createNew")
    public ModelAndView createNew(@Validated @ModelAttribute Province province, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView("create");
        }else {
            provinceService.save(province);
            return new ModelAndView("redirect:/showList");
        }

    }

    @GetMapping("/edit/{id}")
    public ModelAndView showUpdateForm(@PathVariable Long id){

        Province province = provinceService.findById(id);
        return new ModelAndView("create","province",province);

    }
//
//    @PostMapping("/edit")
//    public ModelAndView update(@ModelAttribute Province province, BindingResult bindingResult){
//        if (bindingResult.hasErrors()) {
//            return new ModelAndView("create");
//        }else {
//            provinceService.save(province);
//            return new ModelAndView("redirect:/showList");
//        }
//
//    }

}
