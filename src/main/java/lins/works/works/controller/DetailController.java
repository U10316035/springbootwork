package lins.works.works.controller;

import lins.works.works.entity.DetailListModel;
import lins.works.works.service.DetailListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DetailController {
    //@Autowired
    //private DetailListModelRepository detailRepo;
    @Autowired
    DetailListService ds = new DetailListService();

    @RequestMapping("/detail")
    public String main(HttpServletRequest request){
        return "detail";
    }

    //get all user data in mongodb
    @RequestMapping(value = "/detail_data", produces="application/json")
    @ResponseBody
    public List<DetailListModel> data() {
        return ds.findAll();
    }
}
