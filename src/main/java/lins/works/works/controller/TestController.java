package lins.works.works.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {
    //透過 @RequestMapping 指定從/會被對應到此hello()方法
    @RequestMapping("/test")
    public String test(HttpServletRequest request){
        request.setAttribute("key", "hello world");
        return "test";
    }
}
