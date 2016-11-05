package komponenJavaVisual;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class AplikasiJmenuGabung extends JFrame{
	Color c = new Color(243, 156, 18);
	JMenuBar menuBar = new JMenuBar();
	JMenu file = new JMenu("File");
	JMenu edit = new JMenu("Edit");
	JMenu view = new JMenu("View");
	JMenu save = new JMenu("Save");
	
	JMenuItem quit = new JMenuItem("Quit");
	JMenuItem newi = new JMenuItem("New");
	JMenuItem open = new JMenuItem("Open");
	
	//edit Checkbox
	JCheckBoxMenuItem copy = new JCheckBoxMenuItem("Copy");
	JCheckBoxMenuItem paste = new JCheckBoxMenuItem("Paste");
	JCheckBoxMenuItem cut = new JCheckBoxMenuItem("Cut",true);
	
	//view radio button
	JRadioButtonMenuItem rbmi = new JRadioButtonMenuItem("Ruller",true);
	JRadioButtonMenuItem rbmi2 = new JRadioButtonMenuItem("Thumbnail");
	JRadioButtonMenuItem rbmi3 = new JRadioButtonMenuItem("Documnet Map");
	ButtonGroup grup = new ButtonGroup();
	
	//save Combo Box
	JMenuItem pdf = new JMenuItem("PDF");
	JMenuItem rtf = new JMenuItem("RTF");
	JMenuItem word = new JMenuItem("WORD");
	
	public AplikasiJmenuGabung() {
		setTitle("Aplikasi Jmenu Gabung");
		setLocation(10,10);
		setSize(250,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		setJMenuBar(menuBar);
		menuBar.setBackground(Color.GRAY);
		menuBar.add(file);
		menuBar.add(edit);
		menuBar.add(view);
		
		file.setMnemonic('f');
		file.add(newi);
		file.add(open);
		file.add(save);
		file.addSeparator();
		
		save.add(pdf);
		save.add(rtf);
		save.add(word);
		
		file.add(quit);
		quit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q,Event.CTRL_MASK));
		edit.setMnemonic('e');
		edit.add(copy);
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,Event.CTRL_MASK));
		edit.add(paste);
		edit.add(cut);
		
		view.setMnemonic('v');
		view.add(rbmi);
		view.add(rbmi2);
		view.add(rbmi3);
		grup.add(rbmi);
		grup.add(rbmi2);
		grup.add(rbmi3);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJmenuGabung ajg = new AplikasiJmenuGabung();
		ajg.komVisual();
	}
	
}
