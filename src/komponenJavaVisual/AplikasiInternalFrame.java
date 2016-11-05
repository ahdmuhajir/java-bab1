package komponenJavaVisual;
import javax.swing.*;
import java.awt.*;

public class AplikasiInternalFrame extends JFrame{
	JDesktopPane desktop = new JDesktopPane();
	JInternalFrame iframe = new JInternalFrame("Internal Frame",true,true,true,true);
	JLabel nim = new JLabel("NIM");
	Color c = new Color(243, 156, 18);
	
	public AplikasiInternalFrame() {
		setTitle("Aplikasi Internal Frame");
		setLocation(100,200);
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().add(iframe);
		iframe.setBounds(20, 20, 200, 100);
		iframe.setBackground(Color.YELLOW);
		iframe.setVisible(true);
		iframe.add(nim);
		nim.setBounds(10, 10, 100, 20);
		desktop.add(iframe);
		setContentPane(desktop);
		desktop.setBackground(c);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		AplikasiInternalFrame aif = new AplikasiInternalFrame();
		aif.komVisual();
	}
	
	

}
