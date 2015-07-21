package app;

import java.awt.Component;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class LoadFile{
	public LoadFile() throws IOException{
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("Select a text file to convert");
		
		if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			
			Object[] options = {"Default settings", "Customized settings"};
			Component frame = null;
			int n = JOptionPane.showOptionDialog(frame,
					"How would you like to customize your web page?",
					"Cusomization Type",
					JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					options,
					options[0]);
			
			if(n == JOptionPane.OK_OPTION)
			{
				new Default().process(chooser);
			}
			else if(n == JOptionPane.NO_OPTION){
				new Customize().process(chooser);
			}
		}
	}
}