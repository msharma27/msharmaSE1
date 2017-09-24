package jsf_managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
@SessionScoped
@ManagedBean
public class Login_validation{
	/**
	 * 
	 */
	private String username;
	private String password;
	private String msg;
	
	public Login_validation() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String Checkvalid(){
        if(username.equals("admin") && password.equals("admin")){
	         
	           return "login_success";
		 }
		else{
			   return "error_login";
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}