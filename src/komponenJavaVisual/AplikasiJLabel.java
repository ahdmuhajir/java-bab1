package komponenJavaVisual;
import javax.swing.*;
import java.awt.*;

public class AplikasiJLabel extends JFrame{
	JLabel lnim = new JLabel("NIM");
	JLabel icon = new JLabel(new ImageIcon("image/child.png"));
	Color c = new Color(243, 156, 18);
	
	public AplikasiJLabel() {
		setTitle("Aplikasi Jlabel");
		setLocation(300, 100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komponenVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(lnim);
		lnim.setBounds(10, 10, 70, 20);
		getContentPane().add(icon);
		icon.setBounds(100, 10, 80, 80);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJLabel al = new AplikasiJLabel();
		al.komponenVisual();
	}

}
