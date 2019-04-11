package model.styles;

import java.io.Serializable;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;

@ManagedBean(eager = true)
@ApplicationScoped
public class BackgroundStyle implements CssStyle, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2636765418031588337L;

	private String[] gradientOptions = {"LINEAR", "RADIAL", "OFF"};

	private String gradient;
	private int color1R;
	private int color1G;
	private int color1B;
	private int color2R;
	private int color2G;
	private int color2B;

	public BackgroundStyle() {
		setDefault();
	}

	@Override
	public void setDefault() {
		this.gradient = gradientOptions[0];
		this.color1R = 96;
		this.color1G = 108;
		this.color1B = 136;
		this.color2R = 4;
		this.color2G = 183;
		this.color2B = 251;
	}

	@Override
	public String toString() {
		if (gradient.equals("LINEAR"))
			return "background: linear-gradient(to right, rgb(" + color1R  + ", " + color1G + ", " + color1B + "), rgb("
					+ color2R  + ", " + color2G + ", " + color2B + "));";
		else if (gradient.equals("RADIAL"))
			return "background: radial-gradient(rgb(" + color1R  + ", " + color1G + ", " + color1B + "), rgb("
					+ color2R  + ", " + color2G + ", " + color2B + "));";
		else
			return "background: linear-gradient(to right, rgb(" + color1R  + ", " + color1G + ", " + color1B + "), rgb("
					+ color1R  + ", " + color1G + ", " + color1B + "));";
	}

	public String getGradient() {
		return gradient;
	}

	public void setGradient(String gradient) {
		this.gradient = gradient;
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

	public String[] getGradientOptions() {
		return gradientOptions;
	}

}
