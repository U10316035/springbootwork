package lins.works.works.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DetailController {
    @RequestMapping("/detail")
    public String main(HttpServletRequest request){
        return "detail";
    }
}
