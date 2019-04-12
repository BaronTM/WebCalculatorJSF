package model.styles;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class ButtonStyle implements CssStyle, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 902074839359516693L;
	
	private int color1R;
	private int color1G;
	private int color1B;
	private int color2R;
	private int color2G;
	private int color2B;
	private int color1FR;
	private int color1FG;
	private int color1FB;
	private int color2FR;
	private int color2FG;
	private int color2FB;
	private int fontSize;
	
	private String butStyle;
	private String butHStyle;
	
	public ButtonStyle() {
		setDefault();
	}
	
	@Override
	public String toString() {
			return "background-color: rgb(" + color1R  + ", " + color1G + ", " + color1B + ");";
	}

	@Override
	public void setDefault() {
		this.color1R = 22;
		this.color1G = 160;
		this.color1B = 133;
		
		this.color2R = 255;
		this.color2G = 255;
		this.color2B = 255;
		
		this.color1FR = 255;
		this.color1FG = 255;
		this.color1FB = 255;
		
		this.color2FR = 0;
		this.color2FG = 0;
		this.color2FB = 0;
		
		
		this.fontSize = 20;
	}
	

	@Override
	public void random() {
		this.color1R = (int) (256 * Math.random());
		this.color1G = (int) (256 * Math.random());
		this.color1B = (int) (256 * Math.random());
		
		this.color2R = (int) (256 * Math.random());
		this.color2G = (int) (256 * Math.random());
		this.color2B = (int) (256 * Math.random());
		
		this.color1FR = (int) (256 * Math.random());
		this.color1FG = (int) (256 * Math.random());
		this.color1FB = (int) (256 * Math.random());
		
		this.color2FR = (int) (256 * Math.random());
		this.color2FG = (int) (256 * Math.random());
		this.color2FB = (int) (256 * Math.random());
		
		
		this.fontSize = (int) (41 * Math.random());
		
	}
	
	public String getButStyle() {
		return "background-color: rgb(" + color1R  + ", " + color1G + ", " + color1B + ");" + "\n"
				+ "color: rgb(" + color1FR  + ", " + color1FG + ", " + color1FB + ");" + "\n"
				+ "font-size: " + fontSize + "px;";
	}
	
	public String getButHStyle() {
		return "background-color: rgb(" + color2R  + ", " + color2G + ", " + color2B + ");" + "\n"
				+ "color: rgb(" + color2FR  + ", " + color2FG + ", " + color2FB + ");";
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

	public int getColor1FR() {
		return color1FR;
	}

	public void setColor1FR(int color1fr) {
		color1FR = color1fr;
	}

	public int getColor1FG() {
		return color1FG;
	}

	public void setColor1FG(int color1fg) {
		color1FG = color1fg;
	}

	public int getColor1FB() {
		return color1FB;
	}

	public void setColor1FB(int color1fb) {
		color1FB = color1fb;
	}

	public int getColor2FR() {
		return color2FR;
	}

	public void setColor2FR(int color2fr) {
		color2FR = color2fr;
	}

	public int getColor2FG() {
		return color2FG;
	}

	public void setColor2FG(int color2fg) {
		color2FG = color2fg;
	}

	public int getColor2FB() {
		return color2FB;
	}

	public void setColor2FB(int color2fb) {
		color2FB = color2fb;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

}
