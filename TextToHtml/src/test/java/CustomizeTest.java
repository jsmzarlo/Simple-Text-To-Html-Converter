import static org.junit.Assert.*;
import app.Color;
import app.FontSize;
import org.junit.Test;

public class CustomizeTest{
	
	@Test
	public void testBackground() {
		String backgroundColor = Color.getBackgroundColor(Color.Colors.GREEN);
		assertTrue(backgroundColor.equals("<body bgcolor='green'>"));
	}
	
	@Test
	public void testFontColor() {
		String fontColor = Color.getFontColor(Color.Colors.CYAN);
		assertTrue(fontColor.equals("<font color='cyan'>"));
	}
	
	@Test
	public void testFontSize() {
		assertTrue(FontSize.LARGE.getFontSizeStart().equals("<h1>"));
		assertTrue(FontSize.LARGE.getFontSizeEnd().equals("</h1>"));
	}
}