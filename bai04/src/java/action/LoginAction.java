/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import model.Person;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
  @Result(name="success", location="/loginSuccess.jsp"),
  @Result(name="error", location="/loginError.jsp"),
  @Result(name="input", location="/login.jsp")
})


public class LoginAction extends ActionSupport {    
    
    private Person personBean;
    @Override
    public String execute() throws Exception {       
        if(personBean.getEmail().equals("hoang@gmail") && personBean.getPassword().equals("123456")) {
            return SUCCESS;
        }
        return ERROR;
    }    
    
    public Person getPersonBean() {
        return personBean;
    }
    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
    public void validate() {        
        if(personBean.getEmail().length() == 0) {
            addFieldError("personBean.email", "Email is required");
        }        
        if(personBean.getPassword().length() == 0) {
            addFieldError("personBean.password", "Password is required");
        }
    }    
}

