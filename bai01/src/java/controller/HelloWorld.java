/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import com.opensymphony.xwork2.ActionSupport;
import model.Message;

public class HelloWorld extends ActionSupport {
    private Message message;
    @Override
    public String execute() {
        this.message = new Message();
        return SUCCESS;
    }
    
    
}
