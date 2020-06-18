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
import java.net.URI;
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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.sun.prism.Graphics;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import com.toedter.calendar.*;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.RowFilter;
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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class admindash extends JFrame  {
	private static final String VOICENAME = null;
	public static JDateChooser ldate;
	private static JPanel panel_3;
	private JPanel panel_1;
	private JPanel contentPane;
	public static JLabel l1n;
	public static JLabel l1;
	public static JLabel l1name;
	public static JTextField textField;
	private JTextField txtName;
	private JTextField txtContactNo;
	private JTextField txtEmailId;
	private JTextField txtGender;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField txtStudentInfo;
	private JSeparator separator_1;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane_1;
	private JTable table;
	public static JTextField t10;
	private JTextField txtAddInternshipOr;
	public static JTextField name;
	public static JTextField loc;
	public static JTextField title;
	public static String v;
	public static String h;
	public static String filepath;
	//private  JLabel lk;
	private ImageIcon icon;
	DefaultTableModel dm;
	DefaultTableModel dm1;
	private ImageIcon format=null;
	static String path;
	private JButton btnSave;
	//private JButton btnUpload_1;
	String filename=null;
	int s=0;
	byte[] person_image=null;
	/**
	 * Create the frame.
	 */
	private void filter(String q)
	{
		//TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dm);
		
	}
	
	
	
	public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date)
	{
	if(date!=null)
	{
	java.sql.Date sqld=new java.sql.Date(date.getTime());
	return sqld;
	}
	return null;
	}
	 DateFormat dfa=new SimpleDateFormat("dd/MM/yy HH:mm:ss");
 	Date dateobj=new Date(0);
 	private JTable table_1;
 	private JTextField t11;
	public admindash() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1179, 728);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		JPanel panel = new JPanel();
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 254, 730);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(251, 0, 927, 730);
		contentPane.add(tabbedPane);
		ImageIcon img=new ImageIcon(admindash.this.getClass().getResource("mit2.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBackground(Color.WHITE);
		
		tabbedPane.addTab("Home", null, panel_2, null);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
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
		lblNewLabel.setBounds(317, 189, 276, 372);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon((Icon) img);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\"Education is what remains \r\n after one has forgotten\r\n what one has learned in school.\"");
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Corbel Light", Font.BOLD, 48));
		textArea.setEditable(false);
		textArea.setBackground(Color.WHITE);
		textArea.setBounds(68, 350, 738, 313);
		panel_2.add(textArea);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("Quote of the day:");
		textArea_1.setForeground(Color.BLACK);
		textArea_1.setFont(new Font("Corbel Light", Font.PLAIN, 32));
		textArea_1.setEditable(false);
		textArea_1.setBackground(Color.WHITE);
		textArea_1.setBounds(54, 242, 344, 32);
		panel_2.add(textArea_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(50, 284, 236, 11);
		panel_2.add(separator_4);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		tabbedPane.addTab("Profile", null, panel_4, null);
		panel_4.setLayout(null);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtName.setText("Name");
		txtName.setBorder(null);
		txtName.setBounds(63, 261, 139, 29);
		panel_4.add(txtName);
		txtName.setColumns(10);
		
		txtContactNo = new JTextField();
		txtContactNo.setText("Contact No");
		txtContactNo.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtContactNo.setColumns(10);
		txtContactNo.setBorder(null);
		txtContactNo.setBounds(63, 355, 139, 29);
		panel_4.add(txtContactNo);
		
		txtEmailId = new JTextField();
		txtEmailId.setText("Email ID");
		txtEmailId.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtEmailId.setColumns(10);
		txtEmailId.setBorder(null);
		txtEmailId.setBounds(63, 448, 139, 29);
		panel_4.add(txtEmailId);
		
		txtGender = new JTextField();
		txtGender.setText("Gender");
		txtGender.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtGender.setColumns(10);
		txtGender.setBorder(null);
		txtGender.setBounds(63, 545, 139, 29);
		panel_4.add(txtGender);
		
		t1 = new JTextField();
		t1.setBackground(Color.WHITE);
		t1.setFont(new Font("Tahoma", Font.BOLD, 17));
		t1.setColumns(10);
		t1.setBorder(null);
		t1.setBounds(301, 261, 250, 29);
		panel_4.add(t1);
		
		t2 = new JTextField();
		t2.setBackground(Color.WHITE);
		t2.setFont(new Font("Tahoma", Font.BOLD, 17));
		t2.setColumns(10);
		t2.setBorder(null);
		t2.setBounds(301, 355, 250, 29);
		panel_4.add(t2);
		
		t3 = new JTextField();
		t3.setBackground(Color.WHITE);
		t3.setFont(new Font("Tahoma", Font.BOLD, 17));
		t3.setColumns(10);
		t3.setBorder(null);
		t3.setBounds(301, 448, 250, 29);
		panel_4.add(t3);
		
		t4 = new JTextField();
		t4.setBackground(Color.WHITE);
		t4.setFont(new Font("Tahoma", Font.BOLD, 17));
		t4.setColumns(10);
		t4.setBorder(null);
		t4.setBounds(301, 545, 250, 29);
		panel_4.add(t4);
		
		txtStudentInfo = new JTextField();
		txtStudentInfo.setText("Admin Information");
		txtStudentInfo.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtStudentInfo.setColumns(10);
		txtStudentInfo.setBorder(null);
		txtStudentInfo.setBounds(50, 22, 250, 36);
		panel_4.add(txtStudentInfo);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(50, 68, 335, 2);
		panel_4.add(separator_1);
		
		JLabel lk1 = new JLabel("");
		lk1.setBounds(63, 93, 139, 140);
		panel_4.add(lk1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.RED);
		separator_3.setBounds(50, 249, 684, 2);
		panel_4.add(separator_3);
		
		
		JLabel lk = new JLabel(" ");
		lk.setBounds(68, 10, 115, 107);
		//lk.setBorder(new RoundedBorder(Color.BLACK, 10));
		panel.add(lk);
	
		
		JButton btnUpload_1 = new JButton("Upload");
		btnUpload_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser ch=new JFileChooser();
				ch.showOpenDialog(null);
				File f=ch.getSelectedFile();
				filename=f.getAbsolutePath();
				//lk.setText(filename);
			//	byte[]imagedata=rs.getBytes("picture");
	        	format=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lk.getWidth(), lk.getHeight(), Image.SCALE_SMOOTH));
	        	format=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lk1.getWidth(), lk1.getHeight(), Image.SCALE_SMOOTH));
	        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
	    	//	l1.setIcon(img);
	       lk.setIcon(format);
	       lk1.setIcon(format);
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
		btnUpload_1.setForeground(Color.WHITE);
		btnUpload_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnUpload_1.setBorder(null);
		btnUpload_1.setBackground(Color.BLACK);
		btnUpload_1.setBounds(233, 201, 67, 21);
		btnUpload_1.setVisible(false);
		panel_4.add(btnUpload_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PreparedStatement ps;
			    String query = "update registerr set name=?,contact=?,email=?,gender=?,picture=? where username='"+adminlogin.t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			         ps = conn.prepareStatement(query);
			         ps.setString(1, t1.getText());
			         ps.setString(2, t2.getText());
			         ps.setString(3, t3.getText());
			         ps.setString(4, t4.getText());
			         ps.setBytes(5, person_image);
			     ps.executeUpdate();
			     JOptionPane.showMessageDialog(null, "Profile Updated!");
			     t1.setEditable(false);
			     t2.setEditable(false);
			     t3.setEditable(false);
			     t4.setEditable(false);
			     //t5.setEditable(false);
			     btnSave.setVisible(false);
				btnUpload_1.setVisible(false);
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
			}
		});
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSave.setVisible(false);
		btnSave.setBorder(null);
		btnSave.setBackground(Color.BLACK);
		btnSave.setBounds(369, 625, 79, 29);
		btnSave.setVisible(false);
		panel_4.add(btnSave);
	
		
		
		JButton button = new JButton("Edit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setEditable(true);
				t2.setEditable(true);
				t3.setEditable(true);
				t4.setEditable(true);
				//t5.setEditable(true);
				btnSave.setVisible(true);
				btnUpload_1.setVisible(true);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(500, 152, 41, 33);
		panel_4.add(button);
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.WHITE);
		tabbedPane.addTab("View", null, panel_5, null);
		panel_5.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(62, 151, 2, 2);
		panel_5.add(scrollPane);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		scrollPane_1.setBounds(23, 138, 796, 502);
		panel_5.add(scrollPane_1);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(255, 255, 224));
		
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				t10.setText(table.getModel().getValueAt(row, 0).toString());
			}
		});
		scrollPane_1.setViewportView(table);
		
		t10 = new JTextField();
		t10.setBorder(new LineBorder(new Color(0, 0, 0)));
		t10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			//	String q=t10.getText().toLowerCase();
			//	filter(q);
			}
			@Override
			public void keyPressed(KeyEvent e) {
				dm=(DefaultTableModel) table.getModel();
				TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(dm);
				table.setRowSorter(tr);
				
				tr.setRowFilter(RowFilter.regexFilter(t10.getText().trim()));
			}
		});
		t10.setFont(new Font("Tahoma", Font.BOLD, 15));
		t10.setBounds(23, 64, 509, 37);
		panel_5.add(t10);
		t10.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("View Profile");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewprofile().setVisible(true);
				PreparedStatement ps;
			    String query = "select * from register,family,edu,engineer where register.name=family.name and family.degreei=engineer.degreei and "
			    		+ "register.yearofgrad=edu.yearofgrad and family.name='"+t10.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			     
			        ResultSet rs=ps.executeQuery();
			        while(rs.next())
			         {
			     	   	viewprofile.address.setText(rs.getString("address"));
			     	   	viewprofile.pin.setText(rs.getString("pin"));
			     	   	viewprofile.mobile.setText(rs.getString("contact"));
			     	  	viewprofile.emailid.setText(rs.getString("email"));
				     	viewprofile.city.setText(rs.getString("city"));
				     	viewprofile.state.setText(rs.getString("address"));
				     	viewprofile.native1.setText(rs.getString("native"));	
				     	viewprofile.dob.setText(rs.getString("dob"));
				     	viewprofile.gender.setText(rs.getString("gender"));
				     	viewprofile.age.setText(rs.getString("age"));
				     	viewprofile.name.setText(rs.getString("name"));
				     	viewprofile.father.setText(rs.getString("father"));
				     	viewprofile.mother.setText(rs.getString("mother"));
				     	viewprofile.fathero.setText(rs.getString("fathero"));
				     	viewprofile.mothero.setText(rs.getString("mothero"));
				     	viewprofile.comp.setText(rs.getString("comp"));
				     	viewprofile.comp1.setText(rs.getString("comp2"));
				     	viewprofile.degreei.setText(rs.getString("degreei"));
				     	viewprofile.univ.setText(rs.getString("univ"));
				     	viewprofile.yr.setText(rs.getString("year"));
				     	viewprofile.perc.setText(rs.getString("perc"));
				     	viewprofile.grade.setText(rs.getString("grade"));
				     	viewprofile.year.setText(rs.getString("yearofgrad"));
				     	viewprofile.degree.setText(rs.getString("highi"));
				     	viewprofile.univ1.setText(rs.getString("univ1"));
				     	viewprofile.yr1.setText(rs.getString("year1"));
				     	viewprofile.perc1.setText(rs.getString("perc1"));
				     	viewprofile.grade1.setText(rs.getString("grade1"));
				     	
			     	
			     	
			         }
			        ps.close();
			        rs.close();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
				
			}
		});
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(559, 74, 133, 21);
		btnNewButton_1.setBorder(null);
		panel_5.add(btnNewButton_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		tabbedPane.addTab("Send", null, panel_6, null);
		panel_6.setLayout(null);
		
		txtAddInternshipOr = new JTextField();
		txtAddInternshipOr.setText("Add Internship or job");
		txtAddInternshipOr.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtAddInternshipOr.setColumns(10);
		txtAddInternshipOr.setBorder(null);
		txtAddInternshipOr.setBounds(27, 34, 276, 36);
		panel_6.add(txtAddInternshipOr);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.RED);
		separator_2.setBounds(27, 74, 335, 2);
		panel_6.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name of Company");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(127, 185, 147, 29);
		panel_6.add(lblNewLabel_1);
		
		JComboBox c1 = new JComboBox();
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				v=c1.getSelectedItem().toString();
			}
		});
		c1.setFont(new Font("Tahoma", Font.BOLD, 16));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select any one..", "Internship", "Job"}));
		c1.setBorder(new EmptyBorder(1, 1, 1, 1));
		c1.setBackground(Color.WHITE);
		c1.setBounds(247, 112, 182, 21);
		panel_6.add(c1);
		
		JLabel lblLocation = new JLabel("Location");
		lblLocation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLocation.setBounds(127, 246, 147, 29);
		panel_6.add(lblLocation);
		
		JLabel lblJobTitle = new JLabel("Job / InternshipTitle");
		lblJobTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblJobTitle.setBounds(127, 316, 176, 29);
		panel_6.add(lblJobTitle);
		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.BOLD, 15));
		name.setBounds(318, 185, 302, 29);
		panel_6.add(name);
		name.setColumns(10);
		
		loc = new JTextField();
		loc.setFont(new Font("Tahoma", Font.BOLD, 15));
		loc.setColumns(10);
		loc.setBounds(318, 246, 302, 29);
		panel_6.add(loc);
		
		JLabel lblLastDateTo = new JLabel("Last Date to Apply");
		lblLastDateTo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLastDateTo.setBounds(127, 384, 147, 29);
		panel_6.add(lblLastDateTo);
		
		title = new JTextField();
		title.setFont(new Font("Tahoma", Font.BOLD, 15));
		title.setColumns(10);
		title.setBounds(318, 316, 302, 29);
		panel_6.add(title);
		
		JDateChooser ldate = new JDateChooser();
		ldate.getCalendarButton().setBounds(241, 1, 15, 115);
		ldate.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		ldate.setBounds(339, 384, 205, 24);
		ldate.setForeground(new Color(105, 105, 105));
		panel_6.add(ldate);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//panel_7.setVisible(true);
				int r=JOptionPane.showConfirmDialog(null, "Send to All?","Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(r==JOptionPane.YES_OPTION)
				{
					mainew.main(null);
					 DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyy-MM-dd");
				        LocalDateTime now=LocalDateTime.now();
						//mainew.main(null);
						  PreparedStatement ps;
				           String query = "insert into application(namec,loc,jobt,sdate,l,kind,path) VALUES (?,?,?,?,?,?,?);";
				        
				        try {
				        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
				            ps = conn.prepareStatement(query);
				           
				          
				          DateFormat df=new SimpleDateFormat("dd/MM/yy");  
				          Date d=new Date(0);
				          ps.setString(1, name.getText());
				          ps.setString(2, loc.getText());
				          ps.setString(3, title.getText());
				          ps.setString(4, dtf.format(now));
				          ps.setDate(5, convertUtilDateToSqlDate(ldate.getDate()));
				       
				          //ps.setString(4, df.format(d));
				          ps.setString(6, v);
				          //ps.setDate(4, convertUtilDateToSqlDate(ldate.getDate()));
				         // ps.setString(4, ((JTextField)date.getDateEditor().getUiComponent()).getText());
				        ps.setString(7, filepath);
				         
				             if(ps.executeUpdate() > 0)
				            {
				            	 JOptionPane.showMessageDialog(null, "Email sent successfully and updated in student dashboard");
				            		
				                         }else{
				                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
				                         }
							
					      
				        }
				        catch (Exception e1)
				        {    
				         Logger.getLogger(admindash.class.getName()).log(Level.SEVERE, null, e1);   
				         System.out.println("hhhhhi");
				        }
				}else if(r==JOptionPane.NO_OPTION)
				{
					new option().setVisible(true);
					
				}
				
				//java.util.Date u=ldate.getDate();
				//java.sql.Date sqld=new java.sql.Date(u.getTime());
				
				}
			
				
			
		});
		btnSend.setForeground(Color.WHITE);
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSend.setBorder(null);
		btnSend.setBackground(Color.BLACK);
		btnSend.setBounds(344, 611, 131, 36);
		panel_6.add(btnSend);
		
		
		
	
		
		
		JLabel lblUploadRelatedDoc = new JLabel("Upload related doc");
		lblUploadRelatedDoc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUploadRelatedDoc.setBounds(127, 485, 147, 29);
		panel_6.add(lblUploadRelatedDoc);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.BOLD, 12));
		l1.setBounds(474, 450, 347, 21);
		panel_6.add(l1);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String path=null;
					JFileChooser chooser=new JFileChooser();
					chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
					FileNameExtensionFilter extension= new FileNameExtensionFilter("*pdf",".pdf",".docx");
					chooser.addChoosableFileFilter(extension);
					int filestate=chooser.showOpenDialog(null);
					
					if(filestate==JFileChooser.APPROVE_OPTION)
					{
						File selectedImage=chooser.getSelectedFile();
						filepath=selectedImage.getAbsolutePath();
						l1.setText(filepath);
						
					}
			}
		});
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUpload.setBorder(null);
		btnUpload.setBackground(Color.GRAY);
		btnUpload.setBounds(344, 485, 131, 29);
		panel_6.add(btnUpload);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		tabbedPane.addTab("Applications", null, panel_8, null);
		panel_8.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(28, 154, 777, 394);
		panel_8.add(scrollPane_2);
		
		table_1 = new JTable();
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table_1.setBackground(new Color(240, 255, 240));
		table_1.setFillsViewportHeight(true);
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row=table_1.getSelectedRow();
				t11.setText(table_1.getModel().getValueAt(row, 0).toString());
			}
		});
		scrollPane_2.setViewportView(table_1);
		
		t11 = new JTextField();
		t11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				dm1=(DefaultTableModel) table_1.getModel();
				TableRowSorter<DefaultTableModel> tr1=new TableRowSorter<DefaultTableModel>(dm1);
				table_1.setRowSorter(tr1);
				
				tr1.setRowFilter(RowFilter.regexFilter(t11.getText().trim()));
			}
		});
		t11.setBorder(new LineBorder(new Color(0, 0, 0)));
		t11.setBounds(28, 72, 510, 30);
		panel_8.add(t11);
		t11.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("View Application");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminapp().setVisible(true);
				PreparedStatement ps;
				  String query = "select * from appsend where name='"+t11.getText()+"'";
				     
				     try {
				     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
				         ps = conn.prepareStatement(query);
				     
				        ResultSet rs=ps.executeQuery();
				        while(rs.next())
				         {
				     	   	adminapp.t1.setText(rs.getString("name"));
				     	   adminapp.t2.setText(rs.getString("email"));
				     	  adminapp.t3.setText(rs.getString("contact"));
				     	 adminapp.t4.setText(rs.getString("jobt"));
				     	adminapp.t5.setText(rs.getString("gender"));
				     	adminapp.t6.setText(rs.getString("year"));
				     	adminapp.t7.setText(rs.getString("path"));
				         }
				        ps.close();
				        rs.close();
						
					}catch(Exception e1)
				     {
							e1.printStackTrace();
				     }
				
			}
		});
		btnNewButton_2.setForeground(SystemColor.text);
		btnNewButton_2.setBackground(SystemColor.desktop);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(573, 69, 183, 30);
		btnNewButton_2.setBorder(null);
		panel_8.add(btnNewButton_2);
		//ImageIcon icon=new ImageIcon("D:/divyesh_profile.jpeg");
	
		
		
		PreparedStatement ps;
		
        String query = "select * from registerr where username='"+adminlogin.t1.getText()+"'";
     
     try {
     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
         ps = conn.prepareStatement(query);
    // byte[] image=null;
        ResultSet rs=ps.executeQuery();
        if(rs.next())
         {
        //	image=rs.getBytes("picture");
     	   	textField.setText("Welcome"+" "+rs.getString("name"));
     	   	byte[]imagedata=rs.getBytes("picture");
        	format=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(lk.getWidth(), lk.getHeight(), Image.SCALE_SMOOTH));
        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
    	//	l1.setIcon(img);
        	lk.setIcon(format);
     	//	ImageIcon icon=new ImageIcon(rs.getString("picture"));
     	   	//rs.getBytes("picture");
         }
      
        
     // Image img1=Toolkit.getDefaultToolkit().createImage(image);
   //   ImageIcon icon=new ImageIcon(img1);
    //  lk.setIcon(icon);
       //  Image getAbsolutePath=null;
		
 	 // ImageIcon icon=new ImageIcon(rs.getString("picture"));
		//	Image oo=icon.getImage().getScaledInstance(lk.getWidth(), lk.getHeight(), Image.SCALE_SMOOTH);
		//	image_path=path;
		//	lk.setIcon(icon);
      
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
		btnNewButton.setBounds(42, 155, 169, 38);
		panel.add(btnNewButton);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(1);
				PreparedStatement ps;
			    String query = "select * from registerr where username='"+adminlogin.t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			         ps = conn.prepareStatement(query);
			     
			        ResultSet rs=ps.executeQuery();
			        while(rs.next())
			         {
			     	   	t1.setText(rs.getString("name"));
			     		t2.setText(rs.getString("contact"));
			     		t3.setText(rs.getString("email"));
			     		t4.setText(rs.getString("gender"));
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
		btnProfile.setBounds(42, 239, 169, 38);
		panel.add(btnProfile);
		
		JButton btnViewStudents = new JButton("View Students");
		btnViewStudents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(2);
				PreparedStatement ps;
				JDialog.setDefaultLookAndFeelDecorated(true);
		           String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
		        
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
		btnViewStudents.setForeground(Color.WHITE);
		btnViewStudents.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewStudents.setBorder(null);
		btnViewStudents.setBackground(Color.BLACK);
		btnViewStudents.setBounds(42, 330, 169, 38);
		panel.add(btnViewStudents);
		
		JButton btnSendApplications = new JButton("Send Applications");
		btnSendApplications.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(3);
		
			}
		});
		btnSendApplications.setForeground(Color.WHITE);
		btnSendApplications.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSendApplications.setBorder(null);
		btnSendApplications.setBackground(Color.BLACK);
		btnSendApplications.setBounds(42, 436, 169, 38);
		panel.add(btnSendApplications);
		
		JButton btnViewApplicationsFrom = new JButton("View Applications ");
		btnViewApplicationsFrom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(4);
				PreparedStatement ps;
				JDialog.setDefaultLookAndFeelDecorated(true);
		           String query = "select name as Name_of_student,email as Email_ID,jobt as Position,send as Sent_Date from appsend";
		        
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
		btnViewApplicationsFrom.setForeground(Color.WHITE);
		btnViewApplicationsFrom.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnViewApplicationsFrom.setBorder(null);
		btnViewApplicationsFrom.setBackground(Color.BLACK);
		btnViewApplicationsFrom.setBounds(42, 531, 183, 38);
		panel.add(btnViewApplicationsFrom);
		
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
		btnLogout.setBounds(42, 625, 169, 38);
		panel.add(btnLogout);
		
		
	//	back=new JLabel("",img
		
		
		


		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	
		}
}
