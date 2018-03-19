package com.kati.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;


public class ThirdAction extends ActionSupport{

    private String name;


    public String execute() {
        if ("Zoli".equals(name)) return SecondAction.GOOD;
        return SecondAction.BAD;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
