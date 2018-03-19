package com.kati.helloworld.action;

import com.kati.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;


public class HelloWorldAction extends ActionSupport {

    //private static final long serialVersionUID = 1L;

    /**
     * The model class that stores the message
     * to display in the view.
     */
    private MessageStore messageStore;
    private String name;


    /*
     * Creates the MessageStore model object and
     * returns success.  The MessageStore model
     * object will be available to the view.
     * (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    public String execute() {

        messageStore = new MessageStore() ;

        return SUCCESS;
    }

     /* public String execute() throws Exception {
        return "success";
    }
*/

    public MessageStore getMessageStore() {

        return messageStore;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
