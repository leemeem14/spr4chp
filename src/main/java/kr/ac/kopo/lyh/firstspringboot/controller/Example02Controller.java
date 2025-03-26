package kr.ac.kopo.lyh.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Example02Controller {
    @RequestMapping(value = "/exam02", method = RequestMethod.GET)
    public String requestMethod() {
        return "@RestController 연습중";
    }
    @RequestMapping(value = "/exam03", method = RequestMethod.GET)
    public @ResponseBody String getMessage() {
        return "@RestController getMessage 연습중";
    }
}
