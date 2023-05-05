package com.example.imdad.model;

public class ngo {
    String name;
    String no;
    Integer imageurl;

    public ngo(String name, String no, Integer imageurl) {
        this.name = name;
        this.no = no;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
