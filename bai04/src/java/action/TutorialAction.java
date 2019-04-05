/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

public class TutorialAction extends ActionSupport {
    
    @Override
    public String execute() {
        System.out.println("Hello from Execute");
        return SUCCESS;
    }
    
}
