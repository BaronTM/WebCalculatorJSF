package model;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import model.styles.BackgroundStyle;
import model.styles.ButtonStyle;
import model.styles.CssStyle;
import model.styles.MainTitleStyle;
import model.styles.SetButtonStyle;
import model.styles.SignatureStyle;

@ManagedBean(name = "set", eager = true)
@ApplicationScoped
public class Settings {
	
	
	@ManagedProperty(value = "#{backgroundStyle}")
	private BackgroundStyle background;
	@ManagedProperty(value = "#{buttonStyle}")
	private ButtonStyle button;
	@ManagedProperty(value = "#{mainTitleStyle}")
	private MainTitleStyle main;
	@ManagedProperty(value = "#{setButtonStyle}")
	private SetButtonStyle setButton;
	@ManagedProperty(value = "#{signatureStyle}")
	private SignatureStyle signature;
	
	
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

	public MainTitleStyle getMain() {
		return main;
	}

	public void setMain(MainTitleStyle main) {
		this.main = main;
	}
	
	public SetButtonStyle getSetButton() {
		return setButton;
	}

	public void setSetButton(SetButtonStyle setButton) {
		this.setButton = setButton;
	}	

	public SignatureStyle getSignature() {
		return signature;
	}

	public void setSignature(SignatureStyle signature) {
		this.signature = signature;
	}

	public String setDefault() {
		this.background.setDefault();
		this.button.setDefault();
		this.main.setDefault();
		this.setButton.setDefault();
		this.signature.setDefault();
		return "settings";
	}
	
	public String setRandom() {
		this.background.random();
		this.button.random();
		this.main.random();
		this.setButton.random();
		this.signature.random();
		return "settings";
	}
}
