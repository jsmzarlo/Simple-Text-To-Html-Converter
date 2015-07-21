package app;

import java.awt.Component;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Customize {
	public Customize() {}
	
	public void process(JFileChooser chooser) throws IOException {
		PrintWriter writer = new PrintWriter(chooser.getSelectedFile() + ".html", "UTF-8");
		writer.println("<html>");
		
		//Select a color for the background of your web page
		Object[] backgroundOptions = Color.Colors.values();
		Component frame3 = null;
		Icon icon3 = null;
		Color.Colors background = (Color.Colors)JOptionPane.showInputDialog(
				frame3,
				"Select a color for the background",
				"BACKGROUND COLOR",
				JOptionPane.PLAIN_MESSAGE,
				icon3,
				backgroundOptions,
				null);
		String backgroundColor = Color.getBackgroundColor(background);
		writer.println(backgroundColor);  
		
		Path path = Paths.get(chooser.getSelectedFile().toURI());
		List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
		
		int i = 1;
		for (String line : lines) {
			new StyleSelecter(line, i, writer);
			i++;
		}
		
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
}
