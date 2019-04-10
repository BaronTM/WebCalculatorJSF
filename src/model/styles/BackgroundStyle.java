package model.styles;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class BackgroundStyle implements CssStyle {

	private enum Gradient{LINEAR, RADIAL};
	
	private Gradient gradient;
	private String color1;
	private String color2;
	
	public BackgroundStyle() {
		setDefault();
	}	
	
	@Override
	public void setDefault() {
		this.gradient = Gradient.LINEAR;
		this.color1 = "#606c88";
		this.color2 = "#04b7fb";
	}
	
	@Override
	public String toString() {
		if (gradient == Gradient.LINEAR) 
			return "background: linear-gradient(to right, " + color1 + ", " + color2 + ");";
		else 
			return "background: linear-gradient(to left, " + color1 + ", " + color2 + ");";
	}
	

	
}
