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

    public String getId(){
        return this._id;
    }

    public String getName(){
        return this.name;
    }

    public String getGender(){
        return this.gender;
    }

    public String getBirthday(){
        return this.birthday;
    }

    public String getHeight(){
        return this.height;
    }

    public String getWeight(){
        return this.weight;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }

    public void setHeight(String height){
        this.height = height;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

}
