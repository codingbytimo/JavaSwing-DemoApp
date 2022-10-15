package guiTimoMVC;

import java.awt.Color;
import java.awt.Component.BaselineResizeBehavior;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Controller {
	
	private View view;
	Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	String path;
	
	public Controller(View view) { 
	    this.view = view;
	}
	
	private void initView() {
	}

	public int count = 0;
	
	public int getCount() {
	     return this.count;
	}
	
	public void initController() {
		view.getBtnKnopf().addActionListener(e -> view.getPanelSimple().setCursor(cursor));
		
		view.getBtnCount().addActionListener(e -> {
			++count; // Wert vom Zaehler erhoehen
	         // Wert vom Zaehler anzeigen
	         view.getTfCount().setText(count + "");
		});
		
		view.getColorChangeButton().addActionListener(e -> {
			view.getPanelSimple().setBackground(new Color(view.getSlider().getValue(), 200, 200));
			view.getPanelComplex().setBackground(new Color(view.getSlider().getValue(), 200, 200));
			view.getPanelFlow().setBackground(new Color(view.getSlider().getValue(), 200, 200));
			view.getPanelBild().setBackground(new Color(view.getSlider().getValue(), 200, 200));
		});
		
		view.getImageChooseButton().addActionListener(e -> {
			int returnValue = view.getFileChooser().showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				//System.out.println(view.getFileChooser().getSelectedFile().getPath());
				File selFile = view.getFileChooser().getSelectedFile();
				path = selFile.getAbsolutePath();
				view.getImage().setIcon(resize(path));
			}
			
		});
		
		view.addWindowListener(new WindowAdapter() { 

			public void windowClosing(WindowEvent e) { 

			int answer = JOptionPane.showConfirmDialog(null, 

			"Möchten Sie das Programm beenden?", 

			"Bestätigung",

			JOptionPane.OK_CANCEL_OPTION); 

			if (answer == JOptionPane.OK_OPTION) { 
				System.exit(0);
			}
			
			if(answer == JOptionPane.CANCEL_OPTION) {
				
			}

			} 

			});
	}
	
	  public ImageIcon resize(String imgPath)
	  {
	    ImageIcon path = new ImageIcon(imgPath);
	    Image img = path.getImage();
	    Image newImg = img.getScaledInstance(view.getImage().getWidth(), view.getImage().getHeight(), Image.SCALE_SMOOTH);
	    ImageIcon image = new ImageIcon(newImg);
	    return image;
	  }
	
	public String getImagePath() {
		return path;
	}
	
}
