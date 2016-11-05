package komponenJavaVisual;

import java.awt.*;
import javax.swing.*;

public class AplikasiJtextField extends JFrame{
	JLabel ibinim = new JLabel("Nim");
	JTextField txnim = new JTextField(20);
	Color c = new Color(243, 156, 18);
	
	public AplikasiJtextField() {
		setTitle("Aplikasi JTextfield");
		setLocation(300, 100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(ibinim);
		ibinim.setBounds(10, 10, 70, 20);
		getContentPane().add(txnim);
		txnim.setBounds(75, 10, 100, 20);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJtextField atf = new AplikasiJtextField();
		atf.komponenVisual();
	}
}
