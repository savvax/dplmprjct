package com.ifmojava.dplmprjct.controllers;

import com.ifmojava.dplmprjct.entity.University;
import com.ifmojava.dplmprjct.repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class SomeController {

//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }


    private UniversityRepository universityRepository;

    @Autowired
    public SomeController(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("university", new University());
        return "index";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String submitForm(@ModelAttribute University university){
        universityRepository.save(university);
        return "index";
    }

}
