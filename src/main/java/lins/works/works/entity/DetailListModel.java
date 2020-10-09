package lins.works.works.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Repository;

@Repository
@Document(collection = "test")
public class DetailListModel {
    @Id
    public String _id;
    @Field("name")
    private String name;
    @Field("gender")
    private String gender;
    @Field("birthday")
    private String birthday;
    @Field("height")
    private String height;
    @Field("weight")
    private String weight;

    public DetailListModel(){}

    public DetailListModel(String name, String gender, String birthday, String height, String weight){
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

}
