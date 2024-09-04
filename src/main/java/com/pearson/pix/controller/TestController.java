package com.pearson.pix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController
{
    @RequestMapping("/")
    public String mainPage()
    {
        return "success";
    }

    @RequestMapping("/index")
    public String indexLoginPage()
    {
        return "login";
    }
    @RequestMapping("/login")
    public String loginPage()
    {
        return "close";
    }
}
