package de.dreinerts.injection;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HelloBean() {
		// TODO Auto-generated constructor stub
	}
	
	@Inject
	private WelcomeBean welcome;
	
	private String strName;
	
	public WelcomeBean getWelcome() {
		return welcome;
	}

	public void setWelcome(WelcomeBean welcome) {
		this.welcome = welcome;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}
	
	public String getSayWelcome() {
		if("".equals(strName) || strName == null) {
			return "";
		} else {
			return welcome.getStrSayWelcome() + strName;
		}
	}
	
	
}
