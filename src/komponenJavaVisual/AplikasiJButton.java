package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJButton extends JFrame{
	JButton btCari = new JButton("Cari");
	JButton btKeluar = new JButton("Keluar");
	Color c = new Color(243, 156, 18);
	
	public AplikasiJButton() {
		setTitle("Aplikasi JButton");
		setLocation(300, 100);
		setSize(300,130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(btKeluar);
		btKeluar.setBounds(10, 10, 130, 50);
		btKeluar.setIcon(new ImageIcon("image/power-off.png"));
		getContentPane().add(btCari);
		btCari.setBounds(150, 10, 130, 50);
		btCari.setIcon(new ImageIcon("image/search.png"));
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJButton ajb= new AplikasiJButton();
		ajb.KomponenVisual();
	}

}
