package com.kati.helloworld.action;

import com.kati.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

// The model class that stores the message to display in the view.
public class HelloWorldAction extends ActionSupport {

    //Creates the MessageStore model object and returns success.
    // The MessageStore model  object will be available to the view.
    private MessageStore messageStore;
    private String name;

  /*  public String execute() {

        messageStore = new MessageStore() ;

        return SUCCESS;
    }
*/

 /*   public String execute() throws Exception {

        messageStore = new MessageStore() ;

        if ("Kati".equals(name)) {
            return SUCCESS;
        } else {
            return ERROR;
        }
    }
 */

    public String execute() {
        if ("Kati".equals(name)) return SecondAction.GOOD;
        return SecondAction.BAD;
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
