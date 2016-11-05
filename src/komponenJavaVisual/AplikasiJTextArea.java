package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJTextArea extends JFrame{
	JLabel ibkal = new JLabel("Kalimat");
	JTextArea areal= new JTextArea(3,20);
	Color c = new Color(243, 156, 18);
	
	AplikasiJTextArea(){
		setTitle("Aplikasi JtextArea");
		setSize(300,160);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(ibkal);
		ibkal.setBounds(10, 10, 80, 20);
		ibkal.setForeground(Color.WHITE);
		
		getContentPane().add(areal);
		areal.setBounds(70, 10, 210, 100);
		areal.setFont(new Font("Comic sans ms",Font.BOLD, 16));
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJTextArea ata  = new AplikasiJTextArea();
		ata.komVisual();
	}

}
