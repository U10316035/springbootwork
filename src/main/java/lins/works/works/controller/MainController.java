package lins.works.works.controller;

import lins.works.works.entity.DetailListModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(HttpServletRequest request){
        request.setAttribute("key", "hello world");
        return "main";
    }

    @RequestMapping("/to_main")
    public String fromDetail(@RequestBody DetailListModel listModel, HttpServletRequest request){
        request.setAttribute("name", listModel.getName());
        request.setAttribute("gender", listModel.getGender());
        request.setAttribute("birthday", listModel.getBirthday());
        request.setAttribute("height", listModel.getHeight());
        request.setAttribute("weight", listModel.getWeight());
        return "main";
    }
}
