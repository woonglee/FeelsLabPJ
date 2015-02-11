package com.springapp.mvc;

public class HelloBean {
    private String name;
    private String std;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStd(String std) {
        this.std = std;
    }
    public String getStd(){
        return std;
    }
}

