package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJMenu extends JFrame{
	JMenuBar mb= new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu help = new JMenu("Help");
	JMenuItem open =new JMenuItem("New");
	JMenuItem close = new JMenuItem("Close");
	JMenuItem quit = new JMenuItem("Quit");
	JMenuItem about = new JMenuItem("About");
	Color c = new Color(243, 156, 18);
	
	public AplikasiJMenu() {
		setTitle("Aplikasi Jmenu");
		setSize(320,160);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		setJMenuBar(mb);
		mb.setBackground(Color.WHITE);
		mb.add(file);
		mb.add(help);
		
		file.add(open);
		file.add(close);
		close.setEnabled(false);
		file.add(quit);
		help.add(about);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJMenu am = new AplikasiJMenu();
		am.komVisual();
	}
}
