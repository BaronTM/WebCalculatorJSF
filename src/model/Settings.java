package model;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.styles.BackgroundStyle;
import model.styles.CssStyle;

@ManagedBean(name = "set", eager = true)
@ApplicationScoped
public class Settings {
	
	
	@ManagedProperty(value = "#{backgroundStyle}")
	private BackgroundStyle background;
	
	public Settings() {
	}

	public BackgroundStyle getBackground() {
		return background;
	}

	public void setBackground(BackgroundStyle background) {
		this.background = background;
	}
}
