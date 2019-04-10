package model;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import javax.swing.text.html.CSS;
import javax.ws.rs.BeanParam;

import model.styles.BackgroundStyle;
import model.styles.CssStyle;

@Named
@ApplicationScoped
public class Settings {
	
	private List<CssStyle> styleElements;
	
	@Inject
	private BackgroundStyle background;
	
	public Settings() {
		this.styleElements.add(this.background);
	}

	public BackgroundStyle getBackground() {
		return background;
	}

	public void setBackground(BackgroundStyle background) {
		this.background = background;
	}
}
