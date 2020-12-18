package de.dreinerts.injection;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class WelcomeBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WelcomeBean() {
		// TODO Auto-generated constructor stub
	}
	
	private String strSayWelcome = "This comes from the injected class ";
	
	public String getStrSayWelcome() {
		return strSayWelcome;
	}

	public void setStrSayWelcome(String strSayWelcome) {
		this.strSayWelcome = strSayWelcome;
	}

	
	
}
