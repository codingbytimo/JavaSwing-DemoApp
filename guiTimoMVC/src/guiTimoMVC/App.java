package guiTimoMVC;

import guiTimoMVC.View;

import javax.swing.UIManager;

import guiTimoMVC.Controller;


public class App {

	public static void main(String[] args) {
		
		View v = new View();
		Controller c = new Controller(v);
		c.initController();
		v.setVisible(true);
		
		try { 
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
	    } catch(Exception ignored){}
		
	}

}
