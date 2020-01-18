package com.ifmojava.springweb.controllers;

import com.ifmojava.springweb.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class UserController {
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String showForm(User user) {
        return "add_user";
    }

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String submitForm(
            @ModelAttribute @Valid User user,
            BindingResult result
    )
    {
        if (result.hasErrors()){
            return "add_user";
        }
        System.out.println(user.getLogin());
        return "add_user";
    }
}
