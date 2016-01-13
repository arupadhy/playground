package com.arvind.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HTMLPageController {

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public String view(Model model) {
        model.asMap().put("data", new String[]{"arvind"});
        return "view";
    }

}
