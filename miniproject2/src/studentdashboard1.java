import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.prism.Graphics;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class studentdashboard1 extends JFrame {
	private static JPanel panel_3;
	private JPanel panel_1;
	private JPanel contentPane;
	public static JLabel l1n;
	public static JLabel l1name;
	public static JTextField textField;
	private JTextField txtName;
	private JTextField txtContactNo;
	private JTextField txtEmailId;
	private JTextField txtGender;
	private JTextField txtYearOfGraduation;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField txtStudentInfo;
	private JSeparator separator_1;
	private JLabel lblNewLabel;
	private JTable table;
	public static  JTextField comp;
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDateTime now=LocalDateTime.now();
    private ImageIcon format=null;
public static JLabel l1;
private JTable table_1;
private static final String VOICENAME = null;
String filename=null;
int s=0;
byte[] person_image=null;
	/**
	 * Create the frame.
	 */

public boolean checkUsername(String jobt){
    
    PreparedStatement st;
    ResultSet rs;
    boolean username_exist = false;
    
    String query = " select appsend.jobt as Title_of_Job,appsend.name,application.jobt from appsend join application join register "
    		+ "on appsend.jobt=application.jobt and register.name=appsend.name and register.username='"+studentdashboard.t1.getText()+"' and application.jobt=?";
    
    try {
        
    	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
        st = conn.prepareStatement(query);
        st.setString(1, comp.getText());
        rs = st.executeQuery();
    
        if(rs.next())
        {
            username_exist = true;
            JOptionPane.showMessageDialog(null, "You have already applied!", "Username Failed", 2);
        }
        
    } catch (SQLException ex) {
        Logger.getLogger(admindash.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    return username_exist;
}
	public boolean verify()
	{
		PreparedStatement ps;
	    String query = "select l from application where jobt=?";
	     
	     try {
	     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	         ps = conn.prepareStatement(query);
	         ps.setString(1, comp.getText());
	        ResultSet rs=ps.executeQuery();
	        if(rs.next())
	        {
	        	String g=rs.getString("l");
	        	if(dtf.format(now).compareTo(g)>0)
	        	{
	        		JOptionPane.showMessageDialog(null, "Sorry the last date of the application is over!");
	        		return false;
	        	}
	        
	        }
		}catch(Exception e1)
	     {
				e1.printStackTrace();
	     }
	   
	    	 return true;
	     
	
		
	}
	public studentdashboard1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1085, 767);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 221, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(221, 0, 850, 730);
		contentPane.add(tabbedPane);
		ImageIcon img=new ImageIcon(studentdashboard1.this.getClass().getResource("mit2.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("Home", null, panel_2, null);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField.setBounds(29, 52, 426, 41);
		textField.setBorder(null);
		panel_2.add(textField);
		
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(29, 93, 426, 11);
		panel_2.add(separator);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(329, 199, 288, 372);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon((Icon) img);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\"Education is what remains \r\n after one has forgotten\r\n what one has learned in school.\"");
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Corbel Light", Font.BOLD, 48));
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(65, 369, 738, 313);
		panel_2.add(textArea);
		
		JTextArea txtrQuoteOfThe = new JTextArea();
		txtrQuoteOfThe.setText("Quote of the day:");
		txtrQuoteOfThe.setForeground(Color.BLACK);
		txtrQuoteOfThe.setFont(new Font("Corbel Light", Font.PLAIN, 32));
		txtrQuoteOfThe.setEditable(false);
		txtrQuoteOfThe.setBackground(Color.WHITE);
		txtrQuoteOfThe.setBounds(50, 261, 344, 32);
		panel_2.add(txtrQuoteOfThe);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(46, 303, 236, 11);
		panel_2.add(separator_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Profile", null, panel_4, null);
		panel_4.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtName.setText("Name");
		txtName.setBorder(null);
		txtName.setBounds(50, 128, 139, 29);
		panel_4.add(txtName);
		txtName.setColumns(10);
		
		txtContactNo = new JTextField();
		txtContactNo.setText("Contact No");
		txtContactNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtContactNo.setColumns(10);
		txtContactNo.setBorder(null);
		txtContactNo.setBounds(50, 214, 139, 29);
		panel_4.add(txtContactNo);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("Email ID");
		txtEmailId.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtEmailId.setColumns(10);
		txtEmailId.setBorder(null);
		txtEmailId.setBounds(50, 303, 139, 29);
		panel_4.add(txtEmailId);
		
		txtGender = new JTextField();
		txtGender.setText("Gender");
		txtGender.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtGender.setColumns(10);
		txtGender.setBorder(null);
		txtGender.setBounds(50, 400, 139, 29);
		panel_4.add(txtGender);
		
		txtYearOfGraduation = new JTextField();
		txtYearOfGraduation.setText("Year of Graduation");
		txtYearOfGraduation.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtYearOfGraduation.setColumns(10);
		txtYearOfGraduation.setBorder(null);
		txtYearOfGraduation.setBounds(50, 499, 172, 29);
		panel_4.add(txtYearOfGraduation);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setBackground(Color.WHITE);
		t1.setFont(new Font("Tahoma", Font.BOLD, 17));
		t1.setColumns(10);
		t1.setBorder(null);
		
		t1.setBounds(351, 128, 250, 29);
		panel_4.add(t1);
		
		t2 = new JTextField();
		t2.setBackground(Color.WHITE);
		t2.setFont(new Font("Tahoma", Font.BOLD, 17));
		t2.setColumns(10);
		t2.setBorder(null);
		t2.setEditable(false);
		t2.setBounds(351, 214, 250, 29);
		panel_4.add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.WHITE);
		t3.setFont(new Font("Tahoma", Font.BOLD, 17));
		t3.setColumns(10);
		t3.setBorder(null);
		t3.setEditable(false);
		t3.setBounds(351, 303, 250, 29);
		panel_4.add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.WHITE);
		t4.setFont(new Font("Tahoma", Font.BOLD, 17));
		t4.setColumns(10);
		t4.setBorder(null);
		t4.setEditable(false);
		t4.setBounds(351, 400, 250, 29);
		panel_4.add(t4);
		
		t5 = new JTextField();
		t5.setBackground(Color.WHITE);
		t5.setFont(new Font("Tahoma", Font.BOLD, 17));
		t5.setColumns(10);
		t5.setBorder(null);
		t5.setEditable(false);
		t5.setBounds(351, 499, 250, 29);
		panel_4.add(t5);
		
		txtStudentInfo = new JTextField();
		txtStudentInfo.setText("Student Information");
		txtStudentInfo.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtStudentInfo.setColumns(10);
		txtStudentInfo.setBorder(null);
		txtStudentInfo.setBounds(50, 22, 250, 36);
		panel_4.add(txtStudentInfo);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(50, 68, 688, 2);
		panel_4.add(separator_1);
		
		JButton btnAddBiodata = new JButton("+ Add Biodata");
		btnAddBiodata.setBackground(Color.BLACK);
		btnAddBiodata.setForeground(Color.WHITE);
		btnAddBiodata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "Once you enter this page, please fill up the whole data and save it wherever asked."
						+ "After complete submission, please generate a pdf of your biodata so that you have the data stored in the computer.","Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(r==JOptionPane.YES_OPTION)
				{
				new biodata().setVisible(true);
				
				PreparedStatement ps;
			    String query = "select * from register where username='"+studentdashboard.t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			     
			        ResultSet rs=ps.executeQuery();
			        while(rs.next())
			         {
			     	   	biodata.name.setText(rs.getString("name"));
			     		biodata.mob.setText(rs.getString("contact"));
			     		biodata.email.setText(rs.getString("email"));
			     		biodata.gend.setText(rs.getString("gender"));
			     		biodata.year.setText(rs.getString("yearofgrad"));
			     		
			     	   	
			         }
			        ps.close();
			        rs.close();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
			
			}
			}
		});
		btnAddBiodata.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAddBiodata.setBorder(null);
		btnAddBiodata.setBounds(50, 626, 139, 29);
		panel_4.add(btnAddBiodata);
		
		JButton btnGeneratePdf = new JButton("Generate PDF");
		btnGeneratePdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pdf.main(null);
			}
		});
		btnGeneratePdf.setBackground(Color.BLACK);
		btnGeneratePdf.setForeground(Color.WHITE);
		btnGeneratePdf.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnGeneratePdf.setBorder(null);
		btnGeneratePdf.setBounds(233, 626, 129, 29);
		panel_4.add(btnGeneratePdf);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps;
			    String query = "update register set name=?,contact=?,email=?,gender=?,yearofgrad=?,picture=? where username='"+studentdashboard.t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			         ps.setString(1, t1.getText());
			         ps.setString(2, t2.getText());
			         ps.setString(3, t3.getText());
			         ps.setString(4, t4.getText());
			         ps.setString(5, t5.getText());
			         ps.setBytes(6, person_image);
			   
			     ps.executeUpdate();
			     JOptionPane.showMessageDialog(null, "Profile Updated!");
			     t1.setEditable(false);
			     t2.setEditable(false);
			     t3.setEditable(false);
			     t4.setEditable(false);
			     t5.setEditable(false);
			     btnSave.setVisible(false);
				
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setBorder(null);
		btnSave.setBackground(Color.BLACK);
		btnSave.setBounds(261, 564, 80, 21);
		btnSave.setVisible(false);
		panel_4.add(btnSave);
		

		JLabel lk1 = new JLabel("");
		lk1.setBounds(684, 282, 132, 147);
		panel_4.add(lk1);
		
		JLabel l34 = new JLabel("");
		l34.setBounds(50, 10, 132, 147);
		panel.add(l34);
		
		
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser ch=new JFileChooser();
				ch.showOpenDialog(null);
				File f=ch.getSelectedFile();
				filename=f.getAbsolutePath();
				//lk.setText(filename);
			//	byte[]imagedata=rs.getBytes("picture");
	        	format=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lk1.getWidth(), lk1.getHeight(), Image.SCALE_SMOOTH));
	        	format=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(l34.getWidth(), l34.getHeight(), Image.SCALE_SMOOTH));
	        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
	    	//	l1.setIcon(img);
	       lk1.setIcon(format);
	       l34.setIcon(format);
				try
				{
					File image=new File(filename);
					FileInputStream fis=new FileInputStream(image);
					ByteArrayOutputStream bos=new ByteArrayOutputStream();
					byte[] buf=new byte[1024];
					for(int readNum; (readNum=fis.read(buf))!=-1; )
					{
						bos.write(buf,0,readNum);
					}
					person_image=bos.toByteArray();
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnUpload.setForeground(Color.BLACK);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpload.setBorder(null);
		btnUpload.setBackground(Color.WHITE);
		btnUpload.setBounds(662, 498, 63, 33);
		btnUpload.setVisible(false);
		panel_4.add(btnUpload);
		
		
		
		
		
		
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setEditable(true);
				t2.setEditable(true);
				t3.setEditable(true);
				t4.setEditable(true);
				t5.setEditable(true);
				btnSave.setVisible(true);
				btnUpload.setVisible(true);
				
			}
		});
		btnEdit.setForeground(Color.BLACK);
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEdit.setBorder(null);
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(697, 37, 41, 33);
		panel_4.add(btnEdit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBackground(Color.RED);
		separator_3.setBounds(646, 97, 24, 596);
		panel_4.add(separator_3);
		

		
		
		
		
		
		
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("Applications", null, panel_6, null);
		panel_6.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		scrollPane.setBounds(10, 167, 810, 346);
		panel_6.add(scrollPane);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setFillsViewportHeight(true);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				comp.setText(table.getModel().getValueAt(row, 1).toString());
			}
		});
		scrollPane.setViewportView(table);
		
		comp = new JTextField();
		comp.setBorder(new LineBorder(Color.BLACK));
		comp.setFont(new Font("Tahoma", Font.BOLD, 14));
		comp.setBounds(118, 83, 399, 25);
		panel_6.add(comp);
		comp.setColumns(10);
		
		
		
		JButton btnView = new JButton("View ");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verify())
				
					{
					if(!checkUsername(comp.getText()))
					{
				new viewapp().setVisible(true);
				PreparedStatement ps;
			    String query = "select * from application where jobt=?";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			         ps.setString(1, comp.getText());
			        ResultSet rs=ps.executeQuery();  
			        while(rs.next())
			         {
			     	   viewapp.t1.setText(rs.getString("kind"));
			     	  viewapp.t2.setText(rs.getString("namec"));
			     	 viewapp.t3.setText(rs.getString("loc"));
			     	viewapp.t4.setText(rs.getString("jobt"));
			     
			     	viewapp.t5.setText(rs.getString("l")); 
			     	viewapp.t6.setText(rs.getString("path"));
			     	
			         }
			        ps.close();
			        rs.close();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
					}  
			}}
		});
		btnView.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnView.setBorder(null);
		btnView.setBackground(Color.GREEN);
		btnView.setBounds(546, 83, 133, 21);
		
		panel_6.add(btnView);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBorder(null);
		btnDelete.setBackground(Color.GREEN);
		btnDelete.setBounds(687, 83, 133, 21);
		panel_6.add(btnDelete);
		
		JLabel lblNewLabel_1 = new JLabel("Job Title :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 83, 138, 25);
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("Sent", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane_1.setBounds(10, 168, 810, 346);
		panel_5.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBackground(new Color(248, 248, 255));
		table_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		table_1.setFillsViewportHeight(true);
		scrollPane_1.setViewportView(table_1);
		
		JLabel lblListOfYour = new JLabel("List of your Sent Applications");
		lblListOfYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblListOfYour.setBounds(10, 50, 322, 33);
		panel_5.add(lblListOfYour);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.RED);
		separator_2.setBounds(10, 82, 493, 13);
		panel_5.add(separator_2);
		PreparedStatement ps;
		
		
		
        String query = "select * from register where username='"+studentdashboard.t1.getText()+"'";
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Voice voice;
		VoiceManager vm=VoiceManager.getInstance();
		voice=vm.getVoice(VOICENAME);
		
	
     try {
     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
         ps = conn.prepareStatement(query);
     
        ResultSet rs=ps.executeQuery();
        while(rs.next())
         {
        	
     	  textField.setText("Welcome"+" "+rs.getString("name"));
     	
    // 	   	Toolkit.getDefaultToolkit().getImage(getClass().getResource(studentregister.path));
			//Image img1=new ImageIcon(this.getClass().getResource(studentregister.path)).getImage();
     	 //  Image img1=new ImageIcon(this.getClass().getResource(studentregister.path)).getImage();
   		//l1.setIcon(new ImageIcon(img1));
     	 	byte[]imagedata=rs.getBytes("picture");
        	format=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(l34.getWidth(), l34.getHeight(), Image.SCALE_SMOOTH));
        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
    	//	l1.setIcon(img);
       l34.setIcon(format);

         }
       
		
	}catch(Exception e1)
     {
			e1.printStackTrace();
     }
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
				
			}
		});
		btnNewButton.setBounds(28, 167, 169, 38);
		panel.add(btnNewButton);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				PreparedStatement ps;
			    String query = "select * from register where username='"+studentdashboard.t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			     
			        ResultSet rs=ps.executeQuery();
			        while(rs.next())
			         {
			     	   	t1.setText(rs.getString("name"));
			     		t2.setText(rs.getString("contact"));
			     		t3.setText(rs.getString("email"));
			     		t4.setText(rs.getString("gender"));
			     		t5.setText(rs.getString("yearofgrad"));
			     		byte[]imagedata=rs.getBytes("picture");
			        	format=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(lk1.getWidth(), lk1.getHeight(), Image.SCALE_SMOOTH));
			        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
			    	//	l1.setIcon(img);
			       lk1.setIcon(format);
			     	   	
			         }
			        ps.close();
			        rs.close();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
			}
		});
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnProfile.setBorder(null);
		btnProfile.setBackground(Color.BLACK);
		btnProfile.setBounds(28, 252, 169, 38);
		panel.add(btnProfile);
		
		JButton btnViewApplications = new JButton("Applications");
		btnViewApplications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				PreparedStatement ps;
				JDialog.setDefaultLookAndFeelDecorated(true);
		           String query = "select sdate as Sent_Date, jobt as Job_Title,kind as Internship_Or_Job,l as Last_Date_To_Apply from application";
		        
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		      
		            ResultSet rs=ps.executeQuery();
		            
		            table.setModel(DbUtils.resultSetToTableModel(rs));
		            rs.close();
		            
		            
		            
		        ps.close();
			}catch(Exception e1)
		        {
				e1.printStackTrace();
		        }
			}
		});
		btnViewApplications.setForeground(Color.WHITE);
		btnViewApplications.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewApplications.setBorder(null);
		btnViewApplications.setBackground(Color.BLACK);
		btnViewApplications.setBounds(28, 356, 169, 38);
		panel.add(btnViewApplications);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 int r=JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		          	
		            
	             if(r==JOptionPane.YES_OPTION)
	            {
	            
	            	new check().setVisible(true);
	            	dispose();
	            }
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBorder(null);
		btnLogout.setBackground(Color.BLACK);
		btnLogout.setBounds(28, 561, 169, 38);
		panel.add(btnLogout);
		
		JButton btnSentApplications = new JButton("Sent Applications");
		btnSentApplications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
				PreparedStatement ps;
				JDialog.setDefaultLookAndFeelDecorated(true);
		           String query = " select appsend.jobt as Title_of_Job,appsend.send as Sent_Date,appsend.path as Attached_File,status as Status from appsend join register on appsend.name=register.name and register.username='"+studentdashboard.t1.getText()+"'";
		        
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		      
		            ResultSet rs=ps.executeQuery();
		            
		            table_1.setModel(DbUtils.resultSetToTableModel(rs));
		            rs.close();
		            
		            
		            
		        ps.close();
			}catch(Exception e1)
		        {
				e1.printStackTrace();
		        }
			}
		});
		btnSentApplications.setForeground(Color.WHITE);
		btnSentApplications.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSentApplications.setBorder(null);
		btnSentApplications.setBackground(Color.BLACK);
		btnSentApplications.setBounds(28, 452, 169, 38);
		panel.add(btnSentApplications);
		
	
		
		
		
		


		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	
		}
}
