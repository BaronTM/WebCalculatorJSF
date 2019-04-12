package model.styles;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class SignatureStyle implements CssStyle, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6111007238382272276L;
	
	private int color1R;
	private int color1G;
	private int color1B;
	private int color2R;
	private int color2G;
	private int color2B;
	private int fontSize;
	private double duration;
	
	private String blur;

	public SignatureStyle() {
		setDefault();
	}
	
	@Override
	public void setDefault() {
		this.color1R = 255;
		this.color1G = 255;
		this.color1B = 255;
		
		this.color2R = 123;
		this.color2G = 150;
		this.color2B = 184;		
		
		this.fontSize = 30;
		this.duration = 1.5;
	}
	
	@Override
	public void random() {
		this.color1R = (int) (256 * Math.random());
		this.color1G = (int) (256 * Math.random());
		this.color1B = (int) (256 * Math.random());
		
		this.color2R = (int) (256 * Math.random());
		this.color2G = (int) (256 * Math.random());
		this.color2B = (int) (256 * Math.random());
		
		this.fontSize = (int) (51 * Math.random());
		this.duration = (int) (10 * Math.random());
	}
	
	@Override
	public String toString() {
		return "font-size: " + fontSize + "px; \n"
				+ "color: " +  "rgb(" + color1R  + ", " + color1G + ", " + color1B + "); \n"
				+ "animation: blur " + duration + "s ease-out infinite; \n"
				+ "text-shadow: 0px 0px 5px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "),"
						+ " 0px 0px 7px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + ");";
	}
	
	public String getBlur() {
		return "text-shadow:0px 0px 10px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 10px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 15px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 30px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 30px " + "rgb(" + color1R  + ", " + color1G + ", " + color1B + "), "
			      + "0px 0px 30px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px 0px 90px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px 10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px 10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px 10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px 10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px -10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "), "
			      + "0px -10px 60px " + "rgb(" + color2R  + ", " + color2G + ", " + color2B + "); ";
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

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public void setBlur(String blur) {
		this.blur = blur;
	}

	

}
