package kr.ac.kopo.lyh.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Example01Controller {
    @RequestMapping(value = "exam01",method = RequestMethod.GET)

    public String requestMethod() {
        return "viewPage01";
    }
}
