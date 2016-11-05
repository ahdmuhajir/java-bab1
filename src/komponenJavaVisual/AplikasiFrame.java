//Author Ahd Muhajir
package komponenJavaVisual;

import javax.swing.*;

public class AplikasiFrame extends JFrame{
	public AplikasiFrame() {
	setTitle("Aplikasi Frame");
	setLocation(300,100);
	setSize(300,150);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setResizable(false);
	setVisible(true);
	}
public static void main(String[] args) {
	AplikasiFrame af = new AplikasiFrame();
}
}