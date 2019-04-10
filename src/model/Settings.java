package model;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.swing.text.html.CSS;

@ManagedBean(name = "set", eager = true)
@ApplicationScoped
public class Settings {
	
	private String headerStyle;
	
	public Settings() {
		headerStyle = "font-size: 40px;";		
	}
	
	public String getHeaderStyle() {
		return this.headerStyle;
	}
}
