package komponenJavaVisual;

import java.awt.Color;

import javax.swing.*;

public class AplikasiJRadioButton extends JFrame{
	JRadioButton rpria= new JRadioButton("Pria");
	JRadioButton rwanita= new JRadioButton("Wanita");
	ButtonGroup grupGender= new ButtonGroup();
	JLabel gender = new JLabel("Jenis Kelamin");
	JButton simpan = new JButton("Simpan");
	Color c = new Color(243, 156, 18);
	
	public AplikasiJRadioButton() {
		setTitle("Aplikasi JRadioButton");
		setSize(200,180);
		setLocation(300,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	void KomponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(gender);
		gender.setBounds(50, 10, 100, 20);
		getContentPane().add(simpan);
		simpan.setBounds(30, 70, 140, 50);
		simpan.setIcon(new ImageIcon("image/save.png"));
		getContentPane().add(rpria);
		rpria.setBounds(10, 40, 80, 20);
		rpria.setOpaque(false);
		getContentPane().add(rwanita);
		rwanita.setBounds(100, 40, 80, 20);
		rwanita.setOpaque(false);
		grupGender.add(rpria);
		grupGender.add(rwanita);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJRadioButton arb = new AplikasiJRadioButton();
		arb.KomponenVisual();
	}
}
