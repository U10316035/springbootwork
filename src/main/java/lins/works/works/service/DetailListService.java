package lins.works.works.service;

import lins.works.works.entity.DetailListModel;
import lins.works.works.repository.DetailListModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailListService {

    @Autowired
    private DetailListModelRepository detailRepo;

    public List<DetailListModel> findAll(){
        return detailRepo.findAll();
    }

    public void insert(DetailListModel listModel){
        detailRepo.save(listModel);
    }

    public void edit(DetailListModel listModel){
        detailRepo.save(listModel);
    }
}
