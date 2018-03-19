package com.kati.helloworld.model;


public class MessageStore {


    private String message;

    public MessageStore() {

        message = "Hello Kati! You are a Struts User";
    }

    public String getMessage()
    {
        return message;
    }

}
