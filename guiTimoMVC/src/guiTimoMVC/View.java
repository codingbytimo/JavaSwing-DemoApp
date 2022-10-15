package guiTimoMVC;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import guiTimoMVC.Controller;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

public class View extends JFrame {
	
	private Controller c = new Controller(this);
	
	// JPanel Deklaration
	private JPanel panelRot;
	private JPanel panelBlue;
	private JPanel panelGreen;
	private JPanel panelSimple;
	private JPanel panelComplex;
	private JPanel panelFlow;
	private JPanel panelBild;
	private JTabbedPane tabpane;
	
	// JLabel Deklaration
	private JLabel lblGutenTag;
	private JLabel lblBundeslnderDeutschland;
	private JLabel label;
	private JLabel popUpLabel;
	private JLabel passwordLabel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel flowLabel;
	private JLabel lblNewLabel_2;
	
	// Button Deklaration
	private JButton btnKnopf;
	private JButton btnCount;
	private JButton btnBack;
	private JRadioButton rdbtnPunktknopf;
	private JButton colorChangeButton;
	private JButton flowButton;
	
	// Deklaration der Image Komponenten
	private JFileChooser fileChooser;
	private JButton imageChooseButton;
	private JLabel imageLabel;
	private JLabel imageChooseInfo;
	private ImageIcon imageIcon;
	
	// Deklaration anderer Komponenten
	private JComboBox comboBox;
	private JLabel lblCount;
	private JTextField tfCount;
	private JTextField tfSimple;
	private JEditorPane EditorPane;
	private JPasswordField passwordField;
	private JSeparator separator_1;
	private JTextArea txtrTextEingebenBitte;
	private JCheckBox chckbxCheck;
	private JSlider slider;
	private JSeparator separator;
	
	FileNameExtensionFilter filter;
	
	String comboBoxListe[] = {"Baden-Wuerrttemberg", "Bayern",
            "Berlin", "Brandenburg", "Bremen",
            "Hamburg", "Hessen", "Mecklenburg-Vorpommern",
            "Niedersachsen", "Nordrhein-Westfalen", "Rheinland-Pfalz",
            "Saarland", "Sachsen", "Sachsen-Anhalt",
            "Schleswig-Holstein", "Thueringen"};
	
	public View() {
		
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		// Einstellungen fuer das Fenster
		setBounds(300, 100, 650, 500);
		setTitle("GUI von Timo - Jetzt mit MVC Standard");
		
		// Erstellen aller UI Komponenten
		
		// Panels
		tabpane = new JTabbedPane
                (JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT );
		panelRot = new JPanel();
		panelRot.setBackground(Color.RED);
		panelRot.setLayout(null);
        panelBlue = new JPanel();
        panelBlue.setBackground(Color.BLUE);
        panelGreen = new JPanel();
        panelGreen.setBackground(Color.GREEN);
        panelSimple = new JPanel();
        panelSimple.setLayout(null);
        panelComplex = new JPanel();
        panelComplex.setLayout(null);
        panelFlow = new JPanel();
        panelBild = new JPanel();
        panelBild.setLayout(null);
        
        // Labels
        passwordLabel = new JLabel("Passwort:");
        label = new JLabel("");
        lblGutenTag = new JLabel("JButton");
        lblGutenTag.setBounds(61, 10, 85, 14);
        panelSimple.add(lblGutenTag);
        txtrTextEingebenBitte = new JTextArea();
        lblBundeslnderDeutschland = new JLabel("JComboBox Bundeslaender:");
        lblBundeslnderDeutschland.setBounds(325, 105, 171, 14);
        panelSimple.add(lblBundeslnderDeutschland);
        lblNewLabel = new JLabel("JTextField");
        lblNewLabel.setBounds(61, 60, 87, 13);
        panelSimple.add(lblNewLabel);
        lblNewLabel_1 = new JLabel("JSlider");
        lblNewLabel_1.setBounds(325, 11, 45, 13);
        panelSimple.add(lblNewLabel_1);
        lblCount = new JLabel("Zaehler");
        lblCount.setSize(50, 20);
        lblCount.setLocation(50, 25);
        panelComplex.add(lblCount); 
        popUpLabel = new JLabel("Das ist ein PopUp Menu");
        flowLabel = new JLabel("Das ist ein Tab im Flow Layout.");
        panelFlow.add(flowLabel);
        lblNewLabel_2 = new JLabel("JEditorPane");
        lblNewLabel_2.setBounds(20, 75, 100, 14);
        panelComplex.add(lblNewLabel_2);
        imageChooseInfo = new JLabel("Kann manchmal nicht ganz richtig funktionieren :)");
        imageChooseInfo.setBounds(175, 20, 300, 20);
        panelBild.add(imageChooseInfo);
        
        // Buttons
        btnBack = new JButton("Noch ein Knopf");
        btnKnopf = new JButton("Knopf");
        btnKnopf.setBounds(61, 30, 85, 23);
        btnKnopf.setForeground(Color.WHITE);
        btnKnopf.setBackground(Color.DARK_GRAY);
        panelSimple.add(btnKnopf);
        btnCount = new JButton("Hochzaehlen");
        btnCount.setSize(120, 20);
        btnCount.setLocation(160, 25);
        btnCount.setForeground(new Color(0, 0, 0));
        panelComplex.add(btnCount); 
        rdbtnPunktknopf = new JRadioButton("JRadioButton");
        rdbtnPunktknopf.setBounds(61, 125, 109, 23);
        panelSimple.add(rdbtnPunktknopf);
        colorChangeButton = new JButton("Hintergrundfarbe anwenden");
        colorChangeButton.setBackground(Color.DARK_GRAY);
        colorChangeButton.setForeground(Color.WHITE);
        colorChangeButton.setBounds(325, 67, 250, 23);
        panelSimple.add(colorChangeButton);
        flowButton = new JButton("Knopf");
        panelFlow.add(flowButton);
        imageChooseButton = new JButton("Bild aussuchen");
        imageChooseButton.setBounds(20, 20, 150, 20);
        panelBild.add(imageChooseButton);
        
        // PasswordField
        passwordField = new JPasswordField();
        
        // TextField
        tfCount = new JTextField(c.getCount() + "", 10);
        tfCount.setSize(50, 20);
        tfCount.setLocation(105, 25);
        tfCount.setEditable(false);
        panelComplex.add(tfCount);
        tfSimple = new JTextField();
        tfSimple.setBounds(61, 80, 85, 16);
        panelSimple.add(tfSimple);
        
        // CheckBox
        chckbxCheck = new JCheckBox("JCheckBox");
        chckbxCheck.setBounds(61, 99, 97, 23);
        panelSimple.add(chckbxCheck);
        
        // Slider
        slider = new JSlider();
        slider.setMaximum(255);
        slider.setBounds(325, 30, 200, 26);
        slider.setBackground(Color.WHITE);
        panelSimple.add(slider);
        
        // comboBox
        comboBox = new JComboBox(comboBoxListe);
        comboBox.setBounds(325, 120, 171, 20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setBackground(Color.GRAY);
        panelSimple.add(comboBox);
        
        // Separator
        separator = new JSeparator();
        separator.setForeground(new Color(160, 160, 160));
        separator.setBackground(new Color(0, 0, 0));
        separator.setBounds(35, 160, 550, 10);
        panelSimple.add(separator);
        separator_1 = new JSeparator();
        separator_1.setBackground(new Color(0, 0, 0));
        separator_1.setForeground(new Color(128, 128, 128));
        separator_1.setBounds(40, 60, 540, 10);
        panelComplex.add(separator_1);
        
        // EditorPane
        EditorPane = new JEditorPane();
        EditorPane.setLocation(15, 100);
        EditorPane.setSize(600, 200);
        EditorPane.setContentType("text/html");
        EditorPane.setText("<html>\r\n"
        		+ "<head>\r\n"
        		+ "<style>\r\n"
        		+ "body {background-color: orange;}\r\n"
        		+ "h1   {color: blue;}\r\n"
        		+ "p    {color: purple;}\r\n"
        		+ "</style>"
        		+ "</head>\r\n"
        		+ "<body>\r\n"
        		+ "\r\n"
        		+ "<h1>Guten Tag!</h1>\r\n"
        		+ "\r\n"
        		+ "<p>Das hier ist HTML innerhalb von Java.</p>\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "<p>Der Text innerhalb dieser Box kann bearbeitet werden.</p>\r\n"
        		+ "\r\n"
        		+ "</body>\r\n"
        		+ "</html>");
        panelComplex.add(EditorPane);
        
        // Darstellung des Bildes im Bild Demo Tab
        fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileChooser.setDialogTitle("Bitte ein Bild aussuchen.");
        fileChooser.setAcceptAllFileFilterUsed(false);
        filter = new FileNameExtensionFilter("PNG und JPG Bilder", "png", "jpg");
        fileChooser.addChoosableFileFilter(filter);
        panelComplex.add(fileChooser);
        imageLabel = new JLabel();
        imageLabel.setBounds(10, 50, 360, 360);
        panelBild.add(imageLabel);
        
        // Tabs zur Tabbedpane hinzufuegen
        tabpane.addTab("einfache Komponenten", panelSimple);
        tabpane.addTab("komplexe Komponenten", null, panelComplex, null);
        tabpane.addTab("Bild Demo", panelBild);
        tabpane.addTab("Flow Layout", panelFlow);
        tabpane.addTab("Ich bin rot", panelRot);
        tabpane.addTab("Ich bin blau", panelBlue);
        tabpane.addTab("Ich bin gruen", panelGreen);
        panelFlow.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        // Hinzufuegen aller Komponenten in den JFrame
        getContentPane().add(tabpane);
	}
	
	public Component getPanelSimple() {
		return panelSimple;
	}
	
	public Component getPanelComplex() {
		return panelComplex;
	}
	
	public Component getPanelFlow() {
		return panelFlow;
	}
	
	public Component getPanelBild() {
		return panelBild;
	}
	
	public JButton getImageChooseButton() {
		return imageChooseButton;
	}
	
	public JLabel getImage() {
		return imageLabel;
	}
	
	public JTextField getTfCount() {
		return tfCount;
	}
	
	public JButton getBtnKnopf() {
		return btnKnopf;
	}
	
	public JButton getBtnCount() {
		return btnCount;
	}
	
	public JButton getColorChangeButton() {
		return colorChangeButton;
	}
	
	public JSlider getSlider() {
		return slider;
	}
	
	public JFileChooser getFileChooser() {
		return fileChooser;
	}

}
