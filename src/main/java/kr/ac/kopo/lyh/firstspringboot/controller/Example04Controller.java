package kr.ac.kopo.lyh.firstspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Example04Controller {
    @GetMapping("/exam06")
    public String requestMethod(Model model) {
        model.addAttribute("data1","Model예제");
        model.addAttribute("data2","웹요청 URL은 https://localhost:8080/exam06");
        return "viewPage06_1";
    }
    @GetMapping("/exam07")
    public String requestMethod2(ModelMap modelMap) {
        modelMap.addAttribute("message1","ModelMap 클래스는 Model인터페이스를 상속받아서 구현됨");
        modelMap.addAttribute("message2","ModelMap 클래스는 Model인터페이스의 기능과 동일하거나 더 확장된 기능을 사용할수있다");
        List<String> list = new ArrayList<String>();
        list.add("Orange");
        list.add("Ddalgii");
        list.add("K-Melon");

        modelMap.addAttribute("fruitsList",list);

        return "viewPageModelMap";
    }
    @GetMapping("/exam08")
    public ModelAndView requestMethod3() {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("msg1","Model and view 예제");
        modelView.addObject("msg2","Model and view 는 view의 이름을 생성자 또는 메소드를 통해서 설정할수있다.");
        modelView.addObject("msg3","Model and view 클래스는 값이나 객체 참조값을 전달할때 사용하는 메소드가 다르다");
        modelView.addObject("msg4","Model and view 클래스는 요청 메소드의 매개변수를 통해 사용하는 것이 아니라 객체 생성을 해서 사용해야하며, 리턴 값으로 ModelAndView객체의 참조값을 사용한다.");
        List<String> flist = new ArrayList<String>();
        flist.add("Orange");
        flist.add("Ddalgii");
        flist.add("K-Melon");
        modelView.addObject("fList",flist);
        modelView.setViewName("viewPageModelAndView");
        return modelView;
    }
}
