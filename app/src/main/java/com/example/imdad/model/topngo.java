package com.example.imdad.model;

public class topngo {
    String name;
    String ngotype;
    Integer imageurl;

    public topngo(String name, String ngotype, Integer imageurl) {
        this.name = name;
        this.ngotype = ngotype;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgotype() {
        return ngotype;
    }

    public void setNgotype(String ngotype) {
        this.ngotype = ngotype;
    }

    public Integer getImageurl() {
        return imageurl;
    }

    public void setImageurl(Integer imageurl) {
        this.imageurl = imageurl;
    }
}
