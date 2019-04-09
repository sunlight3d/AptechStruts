/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import controller.Database;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import model.User;
@Results({
  @Result(name="success", location="/register-success.jsp"),
  @Result(name="error", location="/register-error.jsp"),
  @Result(name="input", location="/register.jsp")
})


public class Register extends ActionSupport {    
    
    private User userBean;
    @Override
    public String execute() throws Exception {       
        int result = Database.getInstance().insertUser(userBean);        
        return SUCCESS;
    }    
    public User getPersonBean() {
        return userBean;
    }
    public void setPersonBean(User personBean) {
        this.userBean = personBean;
    }
    @Override
    public void validate() {
        if(userBean.getFirstName().length() == 0) {
            addFieldError("personBean.firstName", "Firstname is required");
        }
        if(userBean.getLastName().length() == 0) {
            addFieldError("personBean.lastName", "Lastname is required");
        }
        if(userBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required");
        }        
        if(userBean.getAge() <= 18) {
            addFieldError("personBean.age", "Age must >= 18");
        }
    }    
}
