package komponenJavaVisual;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.text.TabExpander;

import java.awt.*;
public class AplikasiJTableManual extends JFrame{
	JLabel mhs = new JLabel("Tabel Data Mahasiswa");
	
	String header []={"No","Reno","Sisca","Rendy"};
	String data [][]= {{"1","100","300","300"},{"2","500","600","450"},{"3","290","690","360"}};
	
	//set Model Table
	DefaultTableModel model = new DefaultTableModel(data,header);
	JTable table = new JTable(model);
	
	JScrollPane jspane = new JScrollPane(table);
	
	TableColumn tc1 = new TableColumn();
	TableColumn tc2 = new TableColumn();
	TableColumn tc3 = new TableColumn();
	TableColumn tc4 = new TableColumn();
	
	Dimension d = new Dimension(15,2);
	
	public AplikasiJTableManual() {
		setTitle("Aplikasi JTable Manual");
		setSize(250,200);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
			
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().add(mhs);
		mhs.setBounds(50, 5, 200, 20);
		
		getContentPane().add(jspane);
		jspane.setBounds(30, 30, 200, 100);
		
		table.setShowGrid(true);
		table.setShowVerticalLines(true);
		table.setIntercellSpacing(new Dimension(d));
		table.setGridColor(Color.GREEN);
		setHighRow(table);
		
		tc1 = table.getColumnModel().getColumn(0);
		tc2 = table.getColumnModel().getColumn(1);
		tc3 = table.getColumnModel().getColumn(2);
		tc4 = table.getColumnModel().getColumn(3);
		
		tc1.setPreferredWidth(50);
		tc2.setPreferredWidth(150);
		tc3.setPreferredWidth(150);
		tc4.setPreferredWidth(150);
		setVisible(true);
	}
	void setHighRow(JTable table){
		int tinggi = table.getRowHeight();
		table.setRowHeight(tinggi+15);
	}
	
	public static void main(String[] args) {
		AplikasiJTableManual ajm = new AplikasiJTableManual();
		ajm.komVisual();
	}
}
