package com.example.curs13;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Locale;

@Controller
public class TestController {

    @RequestMapping(value ="/time", method = RequestMethod.GET)
    public String time(Locale locale, Model model){
        System.out.println("Home Page Requested, locale = " + locale);


    }
}
