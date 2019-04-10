package action;

import com.opensymphony.xwork2.*;
import javax.servlet.http.*;
import org.apache.struts2.ServletActionContext;
public class Profile extends ActionSupport {
    @Override
    public String execute() {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpSession session = request.getSession();
        String checkLogin = (String)session.getAttribute("isLoggedIn");
        return checkLogin.equals("1") ? "success":"error";        
    }
}
