import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class apply extends JFrame {

	private JPanel contentPane;
	public static JTextField t1;
	public static JTextField t2;
	public static JTextField t3;
	public static JTextField t4;
	public static JTextField t5;
	public static JTextField t6;
	public static JTextField t7;
	
	public static String filepath1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					apply frame = new apply();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public apply() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 693, 668);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 10, 668, 622);
		contentPane.add(panel);
		
		JLabel l1 = new JLabel("");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(5, 43, 663, 22);
		panel.add(l1);
		l1.setText(viewapp.t1.getText()+" "+"Application for the post of "+viewapp.t4.getText()+" "+"at"+" "+viewapp.t2.getText());
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(5, 75, 618, 10);
		panel.add(separator);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(32, 131, 176, 29);
		panel.add(lblName);
		
		t1 = new JTextField();
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setColumns(10);
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setBackground(Color.WHITE);
		t1.setBounds(236, 131, 302, 29);
		panel.add(t1);
		
		JLabel lblEmailId = new JLabel("Email id");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmailId.setBounds(32, 188, 147, 29);
		panel.add(lblEmailId);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setColumns(10);
		t2.setBorder(new EmptyBorder(0, 0, 0, 0));
		t2.setBackground(Color.WHITE);
		t2.setBounds(247, 188, 302, 29);
		panel.add(t2);
		
		JLabel lblContactNo = new JLabel("Contact No:");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactNo.setBounds(32, 248, 147, 29);
		panel.add(lblContactNo);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.BOLD, 15));
		t3.setColumns(10);
		t3.setBorder(new EmptyBorder(0, 0, 0, 0));
		t3.setBackground(Color.WHITE);
		t3.setBounds(247, 248, 302, 29);
		panel.add(t3);
		
		JLabel lblApplyingForThe = new JLabel("Applying for the post of:");
		lblApplyingForThe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApplyingForThe.setBounds(32, 315, 197, 29);
		panel.add(lblApplyingForThe);
		
		t4 = new JTextField();
		t4.setEditable(false);
		t4.setFont(new Font("Tahoma", Font.BOLD, 15));
		t4.setColumns(10);
		t4.setBorder(new EmptyBorder(0, 0, 0, 0));
		t4.setBackground(Color.WHITE);
		t4.setBounds(257, 315, 302, 29);
		panel.add(t4);
		t4.setText(viewapp.t4.getText());
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(32, 377, 147, 29);
		panel.add(lblGender);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 15));
		t5.setColumns(10);
		t5.setBorder(new EmptyBorder(0, 0, 0, 0));
		t5.setBackground(Color.WHITE);
		t5.setBounds(247, 377, 302, 29);
		panel.add(t5);
		
		JButton btnUploadBiodata = new JButton("*Upload Biodata");
		btnUploadBiodata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String path=null;
					JFileChooser chooser=new JFileChooser();
					chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
					FileNameExtensionFilter extension= new FileNameExtensionFilter("*Files",".pdf",".docx");
					chooser.addChoosableFileFilter(extension);
					int filestate=chooser.showOpenDialog(null);
					
					if(filestate==JFileChooser.APPROVE_OPTION)
					{
						File selectedImage=chooser.getSelectedFile();
						filepath1=selectedImage.getAbsolutePath();
						t6.setText(filepath1);
						
					}
			}
		});
		btnUploadBiodata.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUploadBiodata.setBounds(32, 470, 171, 23);
		panel.add(btnUploadBiodata);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.BOLD, 15));
		t6.setEditable(false);
		t6.setColumns(10);
		t6.setBorder(new EmptyBorder(0, 0, 0, 0));
		t6.setBackground(Color.WHITE);
		t6.setBounds(216, 467, 442, 29);
		panel.add(t6);
		
		JButton btnSendApplication = new JButton("Send Application");
		btnSendApplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 PreparedStatement ps;
				 int f=0;
		           String query = "insert into appsend(name,email,contact,jobt,gender,year,path,send,status) VALUES (?,?,?,?,?,?,?,?,?);";
		        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		        LocalDateTime now=LocalDateTime.now();
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		           
		          
		          ps.setString(1, t1.getText());
		          ps.setString(2, t2.getText());
		          ps.setString(3, t3.getText());
		          ps.setString(4, t4.getText());
		          ps.setString(5, t5.getText());
		          ps.setString(6, t7.getText());
		          ps.setString(7, t6.getText());
		          ps.setString(8, dtf.format(now));
		         ps.setString(9, "Applied");
		             if(ps.executeUpdate() > 0)
		            {
		            	 JOptionPane.showMessageDialog(null, "Application sent successfully");
		            	 //btnSendApplication.setEnabled(false);
		            	 
		            		
		                         }else{
		                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
		                         }
					
			      
		        }
		        catch (Exception e1)
		        {    
		         Logger.getLogger(admindash.class.getName()).log(Level.SEVERE, null, e1);   
		         System.out.println("hhhhhi");
		        }
			}
		});
		btnSendApplication.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnSendApplication.setBorder(null);
		btnSendApplication.setBounds(236, 570, 186, 29);
		panel.add(btnSendApplication);
		
		JLabel lblensureYourInformation = new JLabel("*Ensure your information is correct. The same will be recorded in the admin's dashboard.");
		lblensureYourInformation.setEnabled(false);
		lblensureYourInformation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblensureYourInformation.setBounds(5, 517, 544, 22);
		panel.add(lblensureYourInformation);
		
		JLabel l = new JLabel("Year of graduation:");
		l.setFont(new Font("Tahoma", Font.BOLD, 15));
		l.setBounds(32, 431, 171, 29);
		panel.add(l);
		
		t7 = new JTextField();
		t7.setFont(new Font("Tahoma", Font.BOLD, 15));
		t7.setColumns(10);
		t7.setBorder(new EmptyBorder(0, 0, 0, 0));
		t7.setBackground(Color.WHITE);
		t7.setBounds(247, 428, 302, 29);
		panel.add(t7);
		
		JLabel lbltheInformationIs = new JLabel("*The information is auto-filled. You can edit if needed. All details are compulsory.");
		lbltheInformationIs.setEnabled(false);
		lbltheInformationIs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbltheInformationIs.setBounds(32, 86, 477, 22);
		panel.add(lbltheInformationIs);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(Color.WHITE);
		button.setBounds(554, 10, 47, 19);
		panel.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBorder(null);
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(611, 10, 47, 19);
		panel.add(button_1);
	}
}
