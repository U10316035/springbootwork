package lins.works.works.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import lins.works.works.entity.DetailListModel;
import lins.works.works.repository.DetailListModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DetailController {
    @Autowired
    private DetailListModelRepository detailRepo;

    @RequestMapping("/detail")
    public String main(HttpServletRequest request){
        //request.setAttribute("data",detailRepo.findAll());
        return "detail";
        //return detailRepo.findAll();
    }

    @RequestMapping(value = "/detail_data", produces="application/json")
    @ResponseBody
    public List<DetailListModel> data() {
        return detailRepo.findAll();
    }
}
