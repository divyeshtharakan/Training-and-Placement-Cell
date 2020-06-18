import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class viewprofile1 extends JFrame {

	private JPanel contentPane;
	public static  JTextField sem1;
	public static  JTextField sem2;
	public static  JTextField sem3;
	public static  JTextField sem4;
	public static  JTextField sem5;
	public static  JTextField sem6;
	public static  JTextField sem7;
	public static  JTextField sem8;
	public static  JTextField p;
	public static  JTextField pb;
	public static  JTextField p1;
	public static  JTextField pb1;
	public static  JTextField award;
	public static  JTextField award1;
	String filename=null;
	int s=0;
	byte[] person_image=null;
	private ImageIcon format;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewprofile1 frame = new viewprofile1();
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
	public viewprofile1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1018, 538);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 998, 528);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Engineering Exam Details");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(10, 36, 200, 39);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(10, 73, 266, 11);
		panel.add(separator);
		
		JLabel label_1 = new JLabel("SEM I");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 97, 48, 25);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("SEM II");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(10, 143, 48, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("SEM III");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(10, 193, 58, 25);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("SEM IV");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(10, 248, 48, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("SEM V");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(10, 304, 48, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("SEM VI");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(10, 359, 48, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("SEM VII");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(10, 420, 58, 25);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("SEM VIII");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(10, 472, 58, 25);
		panel.add(label_8);
		
		sem1 = new JTextField();
		sem1.setBackground(Color.WHITE);
		sem1.setEditable(false);
		sem1.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem1.setColumns(10);
		sem1.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem1.setBounds(83, 102, 104, 19);
		panel.add(sem1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(286, 39, 24, 502);
		panel.add(separator_1);
		
		JLabel label_9 = new JLabel("Projects");
		label_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_9.setBounds(318, 36, 75, 39);
		panel.add(label_9);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.RED);
		separator_2.setBounds(300, 73, 113, 11);
		panel.add(separator_2);
		
		JLabel label_10 = new JLabel("Project Name:");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(321, 97, 113, 25);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Brief:");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(320, 151, 48, 25);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Project Name:");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_12.setBounds(319, 267, 113, 25);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("Brief:");
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_13.setBounds(318, 321, 48, 25);
		panel.add(label_13);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(638, 36, 24, 502);
		panel.add(separator_3);
		
		JLabel label_14 = new JLabel("Awards");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_14.setBounds(676, 36, 75, 39);
		panel.add(label_14);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(671, 73, 113, 11);
		panel.add(separator_4);
		
		sem2 = new JTextField();
		sem2.setBackground(Color.WHITE);
		sem2.setEditable(false);
		sem2.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem2.setColumns(10);
		sem2.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem2.setBounds(83, 148, 104, 19);
		panel.add(sem2);
		
		sem3 = new JTextField();
		sem3.setBackground(Color.WHITE);
		sem3.setEditable(false);
		sem3.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem3.setColumns(10);
		sem3.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem3.setBounds(83, 198, 104, 19);
		panel.add(sem3);
		
		sem4 = new JTextField();
		sem4.setBackground(Color.WHITE);
		sem4.setEditable(false);
		sem4.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem4.setColumns(10);
		sem4.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem4.setBounds(83, 253, 104, 19);
		panel.add(sem4);
		
		sem5 = new JTextField();
		sem5.setBackground(Color.WHITE);
		sem5.setEditable(false);
		sem5.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem5.setColumns(10);
		sem5.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem5.setBounds(83, 309, 104, 19);
		panel.add(sem5);
		
		sem6 = new JTextField();
		sem6.setBackground(Color.WHITE);
		sem6.setEditable(false);
		sem6.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem6.setColumns(10);
		sem6.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem6.setBounds(83, 364, 104, 19);
		panel.add(sem6);
		
		sem7 = new JTextField();
		sem7.setBackground(Color.WHITE);
		sem7.setEditable(false);
		sem7.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem7.setColumns(10);
		sem7.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem7.setBounds(83, 425, 104, 19);
		panel.add(sem7);
		
		sem8 = new JTextField();
		sem8.setBackground(Color.WHITE);
		sem8.setEditable(false);
		sem8.setFont(new Font("Tahoma", Font.BOLD, 14));
		sem8.setColumns(10);
		sem8.setBorder(new EmptyBorder(0, 0, 0, 0));
		sem8.setBounds(83, 477, 104, 19);
		panel.add(sem8);
		
		p = new JTextField();
		p.setBackground(Color.WHITE);
		p.setEditable(false);
		p.setFont(new Font("Tahoma", Font.BOLD, 14));
		p.setColumns(10);
		p.setBorder(new EmptyBorder(0, 0, 0, 0));
		p.setBounds(432, 97, 196, 24);
		panel.add(p);
		
		pb = new JTextField();
		pb.setBackground(Color.WHITE);
		pb.setEditable(false);
		pb.setFont(new Font("Tahoma", Font.BOLD, 14));
		pb.setColumns(10);
		pb.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb.setBounds(377, 148, 226, 70);
		panel.add(pb);
		
		JLabel lk = new JLabel("");
		lk.setBounds(739, 359, 160, 159);
		panel.add(lk);
		
		p1 = new JTextField();
		p1.setBackground(Color.WHITE);
		p1.setEditable(false);
		p1.setFont(new Font("Tahoma", Font.BOLD, 14));
		p1.setColumns(10);
		p1.setBorder(new EmptyBorder(0, 0, 0, 0));
		p1.setBounds(421, 272, 196, 24);
		panel.add(p1);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		pb1 = new JTextField();
		pb1.setBackground(Color.WHITE);
		pb1.setEditable(false);
		pb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		pb1.setColumns(10);
		pb1.setBorder(new EmptyBorder(0, 0, 0, 0));
		pb1.setBounds(376, 326, 226, 70);
		panel.add(pb1);
		
		award = new JTextField();
		award.setBackground(Color.WHITE);
		award.setEditable(false);
		award.setFont(new Font("Tahoma", Font.BOLD, 14));
		award.setColumns(10);
		award.setBorder(new EmptyBorder(0, 0, 0, 0));
		award.setBounds(672, 122, 305, 70);
		panel.add(award);
		
		award1 = new JTextField();
		award1.setBackground(Color.WHITE);
		award1.setEditable(false);
		award1.setFont(new Font("Tahoma", Font.BOLD, 14));
		award1.setColumns(10);
		award1.setBorder(new EmptyBorder(0, 0, 0, 0));
		award1.setBounds(672, 272, 305, 70);
		panel.add(award1);
		
		PreparedStatement ps;
	    String query = "select * from register where name='"+admindash.t10.getText()+"'";
	     
	     try {
	     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	         ps = conn.prepareStatement(query);
	     
	        ResultSet rs=ps.executeQuery();
	        if(rs.next())
	         {
	     	  
	     		byte[]imagedata=rs.getBytes("picture");
	        	format=new ImageIcon(new ImageIcon(imagedata).getImage().getScaledInstance(lk.getWidth(), lk.getHeight(), Image.SCALE_SMOOTH));
	        	//ImageIcon img=new ImageIcon(new ImageIcon("D:/choose.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
	    	//	l1.setIcon(img);
	       lk.setIcon(format);
	     	   	
	         }
	        ps.close();
	        rs.close();
			
		}catch(Exception e1)
	     {
				e1.printStackTrace();
	     }
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewprofile().setVisible(true);
				dispose();
				PreparedStatement ps;
			    String query = "select * from register,family,edu,engineer where register.name=family.name and family.degreei=engineer.degreei and "
			    		+ "register.yearofgrad=edu.yearofgrad and family.name='"+admindash.t10.getText()+"'";
			     
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
		btnNewButton.setBounds(10, 10, 85, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnNewButton_1.setBackground(new Color(224, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 27));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBounds(841, 0, 58, 31);
		panel.add(btnNewButton_1);
		
		
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnX.setBackground(new Color(224, 255, 255));
		btnX.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX.setBounds(930, 0, 58, 31);
		btnX.setBorder(null);
		panel.add(btnX);
		
	
	}

}
