/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import model.Person;
@Results({
  @Result(name="success", location="/thankyou.jsp")
})


public class Register extends ActionSupport {
    private static final long serialVersionUID = 1L;
    
    private Person personBean;
    @Override
    public String execute() throws Exception {       
        return SUCCESS;
    }    
    public Person getPersonBean() {
        return personBean;
    }
    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
}
