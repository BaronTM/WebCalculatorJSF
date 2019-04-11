package model;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.styles.BackgroundStyle;
import model.styles.ButtonStyle;
import model.styles.CssStyle;

@ManagedBean(name = "set", eager = true)
@ApplicationScoped
public class Settings {
	
	
	@ManagedProperty(value = "#{backgroundStyle}")
	private BackgroundStyle background;
	@ManagedProperty(value = "#{buttonStyle}")
	private ButtonStyle button;
	
	public Settings() {
	}

	public BackgroundStyle getBackground() {
		return background;
	}

	public void setBackground(BackgroundStyle background) {
		this.background = background;
	}
		
	public ButtonStyle getButton() {
		return button;
	}

	public void setButton(ButtonStyle button) {
		this.button = button;
	}

	public String setDefault() {
		this.background.setDefault();
		this.button.setDefault();
		return "settings";
	}
}
