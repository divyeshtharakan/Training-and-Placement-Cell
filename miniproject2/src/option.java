import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class option extends JFrame {

	private JPanel contentPane;
	public static  JTextField t1;
	public static JTable table;
	public static String q;

	/**
	 * Create the frame.
	 */
	
	public static java.sql.Date convertUtilDateToSqlDate(java.util.Date date)
	{
	if(date!=null)
	{
	java.sql.Date sqld=new java.sql.Date(date.getTime());
	return sqld;
	}
	return null;
	}
	
	
	public option() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 963, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setUndecorated(true);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"12th grade", "10th grade", "SEM I", "SEM II", "SEM III", "SEM IV", "SEM V", "SEM VI", "SEM VII", "SEM VIII", "None"}));
		c1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		c1.setBorder(null);
		c1.setBackground(Color.WHITE);
		c1.setBounds(50, 54, 184, 26);
		contentPane.add(c1);
		
		t1 = new JTextField();
		t1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		t1.setBounds(288, 54, 232, 26);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 q=c1.getSelectedItem().toString();
				if(q=="12th grade")
				{
					if(!t1.equals(null))
					{
					PreparedStatement ps;
					JDialog.setDefaultLookAndFeelDecorated(true);
			           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
			        String query="select register.name as Name_Of_Student,engineer.perc1 as 12th_grade,engineer.grade1 as Grade,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB"
			        		+ " from register,family,engineer where register.name=family.name "
			        		+ "and family.degreei=engineer.degreei and perc1>'"+t1.getText()+"'";
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
			        
			        }}
					else if(t1.equals(null))
						{
						JOptionPane.showMessageDialog(null, "Fill fields");
						}
						}
			        else if(q=="10th grade")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.perc as 10th_percentange,engineer.grade as 10th_grade,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB"
				        		+ " from register,family,engineer where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and perc>'"+t1.getText()+"'";
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
			        else if(q=="SEM I")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem1 as Sem1_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem1>'"+t1.getText()+"'";
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
			        else if(q=="SEM II")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem2 as Sem2_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem2>'"+t1.getText()+"'";
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
			        else if(q=="SEM III")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem3 as Sem3_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem3>'"+t1.getText()+"'";
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
			        else if(q=="SEM IV")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem4 as Sem4_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem4>'"+t1.getText()+"'";
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
			        else if(q=="SEM V")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem5 as Sem5_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem5>'"+t1.getText()+"'";
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
			        else if(q=="SEM VI")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem6 as Sem6_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem6>'"+t1.getText()+"'";
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
			        else if(q=="SEM VII")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem7 as Sem7_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem7>'"+t1.getText()+"'";
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
			        else if(q=="SEM VIII")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,edu.sem8 as Sem8_SGPA,register.email as Email_ID,register.contact as Mobile_No,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad and sem8>'"+t1.getText()+"'";
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
			        else if(q=="None")
			        {
			        	PreparedStatement ps;
						JDialog.setDefaultLookAndFeelDecorated(true);
				           //String query = "select name as Name,contact as Contact,email as Email_ID,gender as Gender,yearofgrad as Year_of_Graduation from register";
				        String query="select register.name as Name_Of_Student,engineer.degreei as Institue,register.contact as Mobile_No,register.email as Email_ID,register.gender as Gender,family.dob as DOB,edu.yearofgrad as Year_of_Graduation"
				        		+ " from register,family,engineer,edu where register.name=family.name "
				        		+ "and family.degreei=engineer.degreei and register.yearofgrad=edu.yearofgrad";
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
				
				}
		});
		btnNewButton.setBounds(581, 54, 102, 26);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(30, 184, 874, 366);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setFont(new Font("Tahoma", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton button = new JButton("X");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button.setBorder(null);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(902, 0, 47, 19);
		contentPane.add(button);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button_1.setBorder(null);
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(845, 0, 47, 19);
		contentPane.add(button_1);
		
		JButton btnSend = new JButton("Send");
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				optionmail.main(null);
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
			          ps.setString(1, admindash.name.getText());
			          ps.setString(2, admindash.loc.getText());
			          ps.setString(3, admindash.title.getText());
			          ps.setString(4, dtf.format(now));
			          ps.setDate(5, convertUtilDateToSqlDate(admindash.ldate.getDate()));
			       
			          //ps.setString(4, df.format(d));
			          ps.setString(6, admindash.v);
			          //ps.setDate(4, convertUtilDateToSqlDate(ldate.getDate()));
			         // ps.setString(4, ((JTextField)date.getDateEditor().getUiComponent()).getText());
			        ps.setString(7, admindash.filepath);
			         
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

			}
		});
		btnSend.setForeground(Color.WHITE);
		btnSend.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSend.setBorder(null);
		btnSend.setBackground(Color.BLACK);
		btnSend.setBounds(386, 586, 102, 26);
		contentPane.add(btnSend);
		
		JLabel l1 = new JLabel("New label");
		l1.setBounds(0, 0, 953, 664);
		ImageIcon img=new ImageIcon(new ImageIcon("D:/nice.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
		l1.setIcon(img);
		contentPane.add(l1);
	}
}
