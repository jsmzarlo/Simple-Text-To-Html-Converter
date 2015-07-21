package app;

public class Color {
	
	private Color(){}
	
	public static String getFontColor(Colors color) {
		return String.format("<font color='%s'>", color.name().toLowerCase());
	}
	
	public static String getBackgroundColor(Colors color) {
		return String.format("<body bgcolor='%s'>", color.name().toLowerCase());
	}
	
	public enum Colors {
		RED,
		BLUE,
		YELLOW,
		BLACK,
		GREEN,
		BROWN,
		CYAN,
		ORANGE,
		PINK;
		
		private Colors() {}
	}
}
