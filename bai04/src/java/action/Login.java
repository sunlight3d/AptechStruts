/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Database;
import java.util.*;
import model.User;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.*;

public class Login implements SessionAware {
    private User userBean;
    SessionMap<String, String> sessionMap;
    public User getUserBean() {
        return userBean;
    }
    public void setUserBean(User userBean) {
        this.userBean = userBean;
    }

    public String execute() {
        if(Database.getInstance().login(userBean.getEmail(), userBean.getPassword())) {
            return "success";
        }
        return "error";
    }
    @Override
    public void setSession(Map map) {
        this.sessionMap = (SessionMap)map;
        this.sessionMap.put("isLoggedIn", "1");
    } 
}
