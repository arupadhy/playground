package com.arvind.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HTMLPageController {

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.addAttribute("name", "Some name to be displayed");
        return "view";
    }

}
