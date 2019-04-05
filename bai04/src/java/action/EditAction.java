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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import service.EditServiceInMemory;

@Results({
  @Result(name="edit", location="/edit.jsp"), 
})


public class EditAction extends ActionSupport {    
    private Person personBean;
    private String[] sports = {"Football", "Voleyball", "Basketball"};
    private String[] carModels = {"Mazda", "Ford", "Nissan" ,"Honda", "Toyota"};
    private String[] genders = {"Male", "Female", "Not sure"};
    private EditServiceInMemory editServiceInMemory;
    
    @Override
    public String execute() throws Exception {       
        
        return ERROR;
    }
    @Override
    public String input() throws Exception {       
        
        return ERROR;
    }    
    
    public Person getPersonBean() {
        return personBean;
    }
    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
    public List<String> getSports() {
        return Arrays.asList(sports);
    }
    public List<String> getGenders() {
        return Arrays.asList(genders);
    }
    public String[] getCarModels() {
        return carModels;
    }
}

