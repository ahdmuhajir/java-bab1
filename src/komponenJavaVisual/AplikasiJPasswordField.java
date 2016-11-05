package komponenJavaVisual;

import javax.swing.*;
import java.awt.*;

public class AplikasiJPasswordField extends JFrame{
	JLabel user = new JLabel("Username");
	JTextField txuser = new JTextField();
	JLabel pass = new JLabel("Password");
	JPasswordField txpass= new JPasswordField();
	JLabel login = new JLabel(new ImageIcon("image/group.png"));
	Color c = new Color(243, 156, 18);
	
	public AplikasiJPasswordField() {
		setTitle("Aplikasi JPasswordField");
		setSize(300,120);
		setLocation(10, 10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(user);
		user.setBounds(10, 10, 80, 20);
		getContentPane().add(txuser);
		txuser.setBounds(100, 10, 100, 20);
		getContentPane().add(pass);
		pass.setBounds(10, 40, 80, 20);
		getContentPane().add(txpass);
		txpass.setBounds(100, 40, 100, 20);
		txpass.setEchoChar('*');
		
		getContentPane().add(login);
		login.setBounds(210, 5, 70, 70);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJPasswordField ajf = new AplikasiJPasswordField();
		ajf.komVisual();
	}
}
