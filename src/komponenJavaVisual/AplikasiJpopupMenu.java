package komponenJavaVisual;

import java.awt.Color;

import javax.swing.*;

public class AplikasiJpopupMenu extends JFrame{
	JPopupMenu edit = new JPopupMenu("Edit");
	JMenuItem save = new JMenuItem("Save");
	JMenuItem saveAs = new JMenuItem("Save As");
	JMenuItem close = new JMenuItem("Close");
	JPanel panel = new JPanel();
	Color c = new Color(243, 156, 18);
	
	AplikasiJpopupMenu(){
		setTitle("Aplikasi JPopUpMenu");
		setLocation(10, 10);
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komVisual(){
		this.add(panel);
		panel.setComponentPopupMenu(edit);
		panel.setBackground(c);
		
		edit.add(save);
		edit.add(saveAs);
		edit.add(close);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJpopupMenu apop= new AplikasiJpopupMenu();
		apop.komVisual();
	}
}
