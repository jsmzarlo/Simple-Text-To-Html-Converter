package app;

import java.awt.Component;
import java.io.PrintWriter;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class StyleSelecter {
	StyleSelecter(String line, int i, PrintWriter writer){
		if(line.equals("")){
			writer.println("<br>");
			return;
		}
		
		//Select a color for current text line	
		Object[] colorOptions = Color.Colors.values();
		Component frame = null;
		Icon icon = null;
		Color.Colors color = (Color.Colors)JOptionPane.showInputDialog(
				frame,
				"Select a color for text line " + i + ". \n" + "Text line " + i + ": \n" + line,
				"COLOR",
				JOptionPane.PLAIN_MESSAGE,
				icon,
				colorOptions,
				null);
		String colorStart = Color.getFontColor(color);
		
		//Select a font size for current text line
		Object[] fontSizes = FontSize.values();
		Component frame2 = null;
		Icon icon2 = null;
		FontSize font = (FontSize)JOptionPane.showInputDialog(
				frame2,
				"Select a font size for text line " + i + ". \n" + "Text line " + i + ": \n" + line,
				"FONT SIZE",
				JOptionPane.PLAIN_MESSAGE,
				icon2,
				fontSizes,
				null);
		//String backgroundColor = Color.getBackgroundColor(background);
		String fontSizeStart = font.getFontSizeStart();
		String fontSizeEnd = font.getFontSizeEnd();
		
		//This option allows you to make your entire text line bold
		int bold = JOptionPane.showConfirmDialog(
				frame,
				"Would you like text line " + i + " to be bold? \n" + "Text line " + i + ": \n" + line,
				"Bold",
				JOptionPane.YES_NO_OPTION);
		if(bold==0){
			writer.println(fontSizeStart + colorStart + "<b>" + line + "</b>" + "</font>" + fontSizeEnd);
		}
		else{
			writer.println(fontSizeStart + colorStart + line + "</font>" + fontSizeEnd);
		}
	}
}
