package app;

public enum FontSize {
	
	SMALL("<h5>", "</h5>"),
	MEDIUM("<h3>", "</h3>"),
	LARGE("<h1>", "</h1>");
	
	private String fontSizeStart = null;
	private String fontSizeEnd = null;
	
	private FontSize(String fontSizeStart, String fontSizeEnd){
		this.fontSizeStart = fontSizeStart;
		this.fontSizeEnd = fontSizeEnd;
	}
	
	public String getFontSizeStart() {
		return fontSizeStart;
	}
	
	public String getFontSizeEnd() {
		return fontSizeEnd;
	}
}
