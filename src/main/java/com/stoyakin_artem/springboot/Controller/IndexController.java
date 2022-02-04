package com.stoyakin_artem.springboot.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"", "/", "/index"})
    public String getIndexPage() {
        return "index";
    }

    @GetMapping({"/oups"})
    public String GetOupsPage() {
        return "notimplemented";
    }
}
