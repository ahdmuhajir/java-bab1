package komponenJavaVisual;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class AplikasiJScrollpane extends JFrame{
	String header[]={"Senin","Selasa","Rabu"};
	String data[][]={{"10","30","15"},{"50","60","40"},{"29","69","36"}};
	
	DefaultTableModel model = new DefaultTableModel(data,header);
	JTable table = new JTable(model);
	
	JScrollPane pane = new JScrollPane(table);
	Dimension dimensi = new Dimension(60,10);
	
	AplikasiJScrollpane(){
		super("Aplikasi JScrollPane");
		setLocation(200, 100);
		setSize(300,130);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komVisual(){
		getContentPane().setLayout(null);
		table.setIntercellSpacing(dimensi);
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		table.setGridColor(Color.ORANGE);
		setHighRow(table);
		getContentPane().add(pane);
		pane.setBounds(15, 10, 270, 70);
		setVisible(true);
	}
	void setHighRow(JTable table){
		int tinggi = table.getRowHeight();
		table.setRowHeight(tinggi+15);
	}
	public static void main(String[] args) {
		AplikasiJScrollpane ajp = new AplikasiJScrollpane();
		ajp.komVisual();
	}
}
