package model.styles;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;


@Named
@ApplicationScoped
public class BackgroundStyle implements CssStyle, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2636765418031588337L;

	private String[] gradientOptions = {"LINEAR", "RADIAL", "OFF"};
	
	private String gradient;
	private String color1;
	private String color2;
	
	public BackgroundStyle() {
		setDefault();
	}	
	
	@Override
	public void setDefault() {
		this.gradient = gradientOptions[0];
		this.color1 = "#606c88";
		this.color2 = "#04b7fb";
	}
	
	@Override
	public String toString() {
		if (gradient.equals("LINEAR")) 
			return "background: linear-gradient(to right, " + color1 + ", " + color2 + ");";
		else if (gradient.equals("RADIAL"))
			return "background: radial-gradient(" + color1 + ", " + color2 + ");";
		else 
			return "background: linear-gradient(to right, " + color1 + ", " + color1 + ");";
	}

	public String getGradient() {
		return gradient;
	}

	public void setGradient(String gradient) {
		this.gradient = gradient;
	}

	public String getColor1() {
		return color1;
	}

	public void setColor1(String color1) {
		this.color1 = color1;
	}

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
	}

	public String[] getGradientOptions() {
		return gradientOptions;
	}

	
}
