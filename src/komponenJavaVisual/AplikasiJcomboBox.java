package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJcomboBox extends JFrame{
	JLabel ljur = new JLabel("JURUSAN");
	String jenisJur[] = {"Teknik Informatika","Teknik Elektro","Teknik Mekatronika","Akuntansi"};
	JComboBox cbJur= new JComboBox(jenisJur);
	Color c = new Color(243, 156, 18);
	
	AplikasiJcomboBox(){
		setTitle("Aplikasi JCombo Box");
		setLocation(300, 100);
		setSize(300,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(ljur);
		ljur.setBounds(10, 10, 100, 20);
		ljur.setForeground(Color.WHITE);
		
		getContentPane().add(cbJur);
		cbJur.setBounds(75, 10, 150, 20);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJcomboBox acb = new AplikasiJcomboBox();
		acb.KomponenVisual();
	}
}
