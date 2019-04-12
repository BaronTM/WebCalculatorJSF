package model.styles;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class MainTitleStyle implements CssStyle, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8752496434088599209L;
	
	private int color1R;
	private int color1G;
	private int color1B;
	private int color2R;
	private int color2G;
	private int color2B;
	private int fontSize;
	private String title;
	
	
	public MainTitleStyle() {
		setDefault();
	}
	
	@Override
	public String toString() {
		return "color: rgb(" + color1R  + ", " + color1G + ", " + color1B + ");\n"
				+ "font-size: " + fontSize + "px;\n"
				+ "text-shadow:0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
				+ "0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
				+ "0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
				+ "0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
				+ "0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
				+ "0px 0px 20px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "); \n";
				
	}
	
	@Override
	public void setDefault() {
		this.color1R = 255;
		this.color1G = 255;
		this.color1B = 255;
		
		this.color2R = 243;
		this.color2G = 126;
		this.color2B = 182;		
		
		this.fontSize = 100;	
		
		this.title = "JSF CALCULATOR";
	}
	
	public int getColor1R() {
		return color1R;
	}

	public void setColor1R(int color1r) {
		color1R = color1r;
	}

	public int getColor1G() {
		return color1G;
	}

	public void setColor1G(int color1g) {
		color1G = color1g;
	}

	public int getColor1B() {
		return color1B;
	}

	public void setColor1B(int color1b) {
		color1B = color1b;
	}

	public int getColor2R() {
		return color2R;
	}

	public void setColor2R(int color2r) {
		color2R = color2r;
	}

	public int getColor2G() {
		return color2G;
	}

	public void setColor2G(int color2g) {
		color2G = color2g;
	}

	public int getColor2B() {
		return color2B;
	}

	public void setColor2B(int color2b) {
		color2B = color2b;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
