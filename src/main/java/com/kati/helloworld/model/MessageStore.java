package com.kati.helloworld.model;


public class MessageStore {


    private String message;
    private String message2;


    public MessageStore() {

        message = "Hello! You are a Struts User";
        message2 = "Hello! This is the second msg";

    }

    public String getMessage()
    {
        return message;
    }

    public String getMessage2() {
        return message2;
    }
}
