package com.example.eldroid_final_activity_crud;

public class Products {
    String image, id, name, desc;

    public Products() {

    }

    public Products(String image, String id, String name, String desc) {
        this.image = image;
        this.id = id;
        this.name= name;
        this.desc = desc;

    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
