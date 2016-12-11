package CS151;

import java.awt.Color;

public class DTextModel extends DShapeModel {

	private String text;
	private String font;

	public DTextModel() {
		text = "Hello";
		font = "Dialog";
	}

	public String getText() {
		return text;
	}

	public String getFont() {
		return font;
	}

	public void setText(String text) {
		this.text = text;
		notifyListeners();
	}

	public void setFont(String font) {
		this.font = font;
		notifyListeners();
	}
	
	public Color getColor() {
		return color;
	}
	


	public void setColor(Color color) {
		this.color = color;
		notifyListeners();
	}
}
