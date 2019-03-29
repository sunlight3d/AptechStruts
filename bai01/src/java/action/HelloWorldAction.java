/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Message;

public class HelloWorldAction extends ActionSupport {
    private Message message;

    public String execute() {
        message = new Message() ;
        System.out.println("chodd");
        return SUCCESS;
    }

    public Message getMessageStore() {
        return message;
    }
}
