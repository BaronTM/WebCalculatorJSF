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

	private String[] gradientOptions = { "LINEAR", "RADIAL", "OFF" };

	private String gradient;
	private String color1;
	private int color1R;
	private int color1G;
	private int color1B;
	private String color2;
	private int color2R;
	private int color2G;
	private int color2B;

	public BackgroundStyle() {
		setDefault();
	}

	@Override
	public void setDefault() {
		this.gradient = gradientOptions[0];
		this.color1 = "#606c88";
		this.color1R = Integer.parseInt(color1.substring(1, 3), 16);
		this.color1G = Integer.parseInt(color1.substring(3, 5), 16);
		this.color1B = Integer.parseInt(color1.substring(5), 16);
		this.color2 = "#04b7fb";
		this.color2R = Integer.parseInt(color2.substring(1, 3), 16);
		this.color2G = Integer.parseInt(color2.substring(3, 5), 16);
		this.color2B = Integer.parseInt(color2.substring(5), 16);
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

	public void increment(String str) {
		switch (str) {
		case "R1": {
			if (color1R < 255)
				color1R++;
			break;
		}
		}
	}

	public void decrement(String str) {
		switch (str) {
		case "R1": {
			if (color1R > 0)
				color1R--;
			break;
		}
		}
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

	public String getColor2() {
		return color2;
	}

	public void setColor2(String color2) {
		this.color2 = color2;
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
