/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import static com.opensymphony.xwork2.Action.SUCCESS;
import controller.Database;
import java.util.ArrayList;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import model.Country;
@Results({
  @Result(name="success", location="/country-detail.jsp"),
  @Result(name="error", location="/country-error.jsp"),  
})


public class CountryAction extends ActionSupport {    
    
    private Country countryBean;
    @Override
    public String execute() throws Exception {               
        return SUCCESS;
    }    
    public Country getCountryBean() {
        return countryBean;
    }
    public ArrayList<Country> getCountries() {
        return Database.getInstance().findAllCountries();
    }
    public void setCountryBean(Country personBean) {
        this.countryBean = personBean;
    }
    @Override
    public void validate() {
        
    }    
}
