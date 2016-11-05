package komponenJavaVisual;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

class TugasBab1 extends JFrame{
	
	JLabel judul = new JLabel("INPUT ABSENSI MAHASISWA");
	JLabel subjudul = new JLabel ("POLITEKNIK ACEH");
	JLabel subjudul2 = new JLabel ("Jl.POLITEKNIK ACEH DESA PANGO RAYA KEC.ULEE KARENG KOTA BANDA ACEH");
	Color c = new Color(243, 156, 18);
	
	JLabel nim = new JLabel("NIM");
	JTextField txnim = new JTextField(20);
	
	JLabel nama = new JLabel("Nama Mahasiswa");
	JTextField txnama = new JTextField(20);
	
	JLabel hari = new JLabel("Hari");
	String [] jenisHari = {"Hari","Senin","Selasa","Rabu","Kamis","Jumat","Sabtu","Minggu"};
	JComboBox cbhari = new JComboBox (jenisHari);
	
	JLabel tgl = new JLabel("Tanggal");
	String [] jenisTgl = {"Tanggal","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	JComboBox cbtgl = new JComboBox (jenisTgl);
	
	JLabel bulan = new JLabel ("Bulan");
	String [] jenisBulan = {"Bulan","Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
	JComboBox cbbulan = new JComboBox (jenisBulan);
	
	JLabel jamMasuk = new JLabel("Jam Masuk");
	JTextField taxjamMasuk = new JTextField(8);
	
	JLabel jamKeluar = new JLabel("Jam Keluar");
	JTextField taxjamKeluar = new JTextField(8);
	
	JLabel ket = new JLabel ("Keterangan");
	String [] jenisKet = {"Hadir","Sakit","Izin","Alfa"};
	JComboBox cbket = new JComboBox (jenisKet);
	
	JLabel iconLogo = new JLabel (new ImageIcon("images/poltek.png") );
	JLabel iconSearch = new JLabel (new ImageIcon("images/search.png") );
	JLabel iconSave = new JLabel (new ImageIcon("images/save.png") );
	JLabel iconEdit = new JLabel (new ImageIcon("images/edit.png") );
	JLabel iconRemove = new JLabel (new ImageIcon("images/remove.png") );
	JLabel iconQuit = new JLabel (new ImageIcon("images/power-off.png") );
	
	String header [] = 	{"NIM","NAMA","HARI","TANGGAL","BULAN","JAM MASUK","JAM KELUAR","KET"};
	String data [][] = 	{{"001","mail","Senin","14","April","08.00","16.00","Hadir"},
					 	{"002","mamat","Senin","13","Mei","08.00","16.00","Sakit"},
					 	{"003","bambang","Senin","12","Juni","08.00","16.00","hadir"},
					 	{"004","ajir","Senin","11","Juli","08.00","16.00","hadir"},
					 	{"005","sem","Senin","10","Agustus","08.00","16.00","sakit"},
					 	{"006","muksal","Senin","10","September","08.00","16.00","sakit"},
					 	{"007","sukijan","Senin","10","September","08.00","16.00","sakit"}};
						
	
	DefaultTableModel model = new DefaultTableModel (data,header);
	JTable tabel = new JTable(model);
	JScrollPane pane = new JScrollPane(tabel);
	
	TableColumn tc1 = new TableColumn();
	TableColumn tc2 = new TableColumn();
	TableColumn tc3 = new TableColumn();
	TableColumn tc4 = new TableColumn();
	TableColumn tc5 = new TableColumn();
	TableColumn tc6 = new TableColumn();
	TableColumn tc7 = new TableColumn();
	TableColumn tc8 = new TableColumn();
	
	Dimension dimensi = new Dimension(15,2);	
	JLabel created = new JLabel("Created By Ahd Muhajir");
	
	TugasBab1(){
		setTitle("Absensi Mahasiswa Politeknik Aceh");
		setLocation(150,100);
		setSize(1015,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	void KomponenLabel(){	
		setVisible(true);
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(judul);
		judul.setBounds(430,10,200,20);
		
		getContentPane().add(subjudul);
		subjudul.setBounds(460,30,200,20);
		
		getContentPane().add(subjudul2);
		subjudul2.setBounds(285,50,500,20);
		
		getContentPane().add(nim);
		nim.setBounds(10,155,100,20);
		getContentPane().add(txnim);
		txnim.setBounds(130,155,200,20);
		
		getContentPane().add(nama);
		nama.setBounds(10,185,150,20);
		getContentPane().add(txnama);
		txnama.setBounds(130,185,200,20);		
			
		getContentPane().add(hari);
		hari.setBounds(10,215,200,20);
		getContentPane().add(cbhari);
		cbhari.setBounds(130,215,200,20);
		
		getContentPane().add(tgl);
		tgl.setBounds(10,245,200,20);
		getContentPane().add(cbtgl);
		cbtgl.setBounds(130,245,200,20);
		
		getContentPane().add(bulan);
		bulan.setBounds(10,275,200,20);
		getContentPane().add(cbbulan);
		cbbulan.setBounds(130,275,200,20);
		
		getContentPane().add(jamMasuk);
		jamMasuk.setBounds(10,305,200,20);
		getContentPane().add(taxjamMasuk);
		taxjamMasuk.setBounds(130,305,200,20);
		
		getContentPane().add(jamKeluar);
		jamKeluar.setBounds(10,335,200,20);
		getContentPane().add(taxjamKeluar);
		taxjamKeluar.setBounds(130,335,200,20);
		
		getContentPane().add(ket);
		ket.setBounds(10,365,200,20);
		getContentPane().add(cbket);
		cbket.setBounds(130,365,200,20);
		
		getContentPane().add(created);
		created.setBounds(830,400,200,20);
	
	}
	
	void KomponenTabel(){
		
		setVisible(true);

		getContentPane().add(pane);
		pane.setBounds(420,150,550,240);
		
		tabel.setShowGrid(true);
		tabel.setShowVerticalLines(true); 
		tabel.setIntercellSpacing(new Dimension(dimensi)); 
		tabel.setGridColor(Color.BLUE);
		tabel.setBackground(Color.WHITE);

		
		setHighRow(tabel);
		
		tc1 = tabel.getColumnModel().getColumn(0);	
		tc2 = tabel.getColumnModel().getColumn(1);	
		tc3 = tabel.getColumnModel().getColumn(2);	
		tc4 = tabel.getColumnModel().getColumn(3);	
		tc5 = tabel.getColumnModel().getColumn(4);	
		tc6 = tabel.getColumnModel().getColumn(5);	
		tc7 = tabel.getColumnModel().getColumn(6);
		tc8 = tabel.getColumnModel().getColumn(7);	
		
		
		tc1.setPreferredWidth(70);
		tc2.setPreferredWidth(100);
		tc3.setPreferredWidth(100);
		tc4.setPreferredWidth(150);
		tc5.setPreferredWidth(150);
		tc6.setPreferredWidth(130);
		tc7.setPreferredWidth(140);
		tc8.setPreferredWidth(100);
		
	}
	
	void setHighRow(JTable tabel){
		int tinggi = tabel.getRowHeight();
		tabel.setRowHeight(tinggi + 15);
	}	
	
	void KomponenIcon(){
		setVisible(true);
		
		getContentPane().add(iconLogo);
		iconLogo.setBounds(5,5,200,100);
		
		getContentPane().add(iconSearch);
		iconSearch.setBounds(350,150,40,40);
		
		getContentPane().add(iconSave);
		iconSave.setBounds(350,200,40,40);
		
		getContentPane().add(iconEdit);
		iconEdit.setBounds(350,250,40,40);
		
		getContentPane().add(iconRemove);
		iconRemove.setBounds(350,300,40,40);
		
		getContentPane().add(iconQuit);
		iconQuit.setBounds(350,350,40,40);
	}
		
		
	public static void main(String args[]){
		TugasBab1 tb = new TugasBab1();
		tb.KomponenLabel();
		tb.KomponenIcon();
		tb.KomponenTabel();
    }
	
}