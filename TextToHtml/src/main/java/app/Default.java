package app;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JFileChooser;

public class Default {
	
	public Default() {}
	
	public void process(JFileChooser chooser) throws IOException {
		PrintWriter writer = new PrintWriter(chooser.getSelectedFile() + ".html", "UTF-8");
		writer.println("<html>");
		writer.println(Color.getBackgroundColor(Color.Colors.CYAN));
		
		Path path = Paths.get(chooser.getSelectedFile().toURI());
		List<String> lines = Files.readAllLines(path, Charset.defaultCharset());
		for (String line : lines) {
			if(line.equals("")){
				writer.println("<br>");
			}
			else{
				writer.println(FontSize.MEDIUM.getFontSizeStart() + line + FontSize.MEDIUM.getFontSizeEnd());
			}
		}
		
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
	}
}