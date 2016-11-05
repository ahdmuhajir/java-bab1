package komponenJavaVisual;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
public class AplikasiJTable extends JFrame{
		
	String header[] = {"andi","reza","fahmi"};
	String data [][]= {{"100","300","150"},{"500","600","450"},{"290","690","360"}};
	
	DefaultTableModel m = new DefaultTableModel(data,header);
	JTable t = new JTable(m);
	
	
	public AplikasiJTable() {
		super("Aplikasi JTable");
		setLocation(200, 100);
		setSize(250, 110);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().add(t);
		t.setBounds(20, 10, 200, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		AplikasiJTable at = new AplikasiJTable();
		at.komVisual();
	}
}
