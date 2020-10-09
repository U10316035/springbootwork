package lins.works.works.repository;

import lins.works.works.entity.DetailListModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DetailListModelRepository extends MongoRepository<DetailListModel, String> {
    public Optional<DetailListModel> findByName(String name);
}
