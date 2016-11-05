package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJCheckBox extends JFrame{
	JLabel hobi = new JLabel("Hobi :");
	JCheckBox cek1 = new JCheckBox("Membaca");
	JCheckBox cek2 = new JCheckBox("Bernyanyi");
	JCheckBox cek3 = new JCheckBox("Melukis");
	Color c = new Color(243, 156, 18);
	public AplikasiJCheckBox() {
		super ("Aplikasi JcheckBox");
		setLocation(200, 100);
		setSize(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(hobi);
		hobi.setBounds(10, 10, 50, 20);
		
		getContentPane().add(cek1);
		cek1.setBounds(70, 10, 90, 20);
		cek1.setOpaque(false);
		
		getContentPane().add(cek2);
		cek2.setBounds(170, 10, 90, 20);
		cek2.setOpaque(false);
		
		getContentPane().add(cek3);
		cek3.setBounds(270, 10, 90, 20);
		cek3.setOpaque(false);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJCheckBox acb= new AplikasiJCheckBox();
		acb.komVisual();
	}
}
