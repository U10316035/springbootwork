package lins.works.works.controller;

import lins.works.works.entity.DetailListModel;
import lins.works.works.service.DetailListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    DetailListService ds = new DetailListService();

    @RequestMapping("/")
    public String main(HttpServletRequest request){
        request.setAttribute("key", "hello world");
        return "main";
    }

    //pass value from detail to main page
    @RequestMapping("/to_main")
    public String fromDetail(@RequestBody DetailListModel listModel, HttpServletRequest request){
        request.setAttribute("id", listModel.getId());
        request.setAttribute("name", listModel.getName());
        request.setAttribute("gender", listModel.getGender());
        request.setAttribute("birthday", listModel.getBirthday());
        request.setAttribute("height", listModel.getHeight());
        request.setAttribute("weight", listModel.getWeight());
        return "main";
    }

    //new data to mongodb
    @RequestMapping("/new_data")
    @ResponseBody
    public String newData(@RequestBody DetailListModel listModel, HttpServletRequest request){
        ds.insert(listModel);
        return "ok";
    }

    //edit data that already exist in mongodb
    @RequestMapping("/edit_data")
    @ResponseBody
    public String editData(@RequestBody DetailListModel listModel, HttpServletRequest request){
        ds.edit(listModel);
        return "ok";
    }
}
