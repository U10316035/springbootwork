package lins.works.works.controller;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import lins.works.works.repository.DetailListModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DetailController {
    @Autowired
    private DetailListModelRepository detailRepo;

    @RequestMapping("/detail")
    public String main(HttpServletRequest request){
        request.setAttribute("data", detailRepo.findAll());
        return "detail";
    }
}
