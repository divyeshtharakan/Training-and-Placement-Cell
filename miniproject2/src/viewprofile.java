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

import com.toedter.calendar.JDateChooser;
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
import java.awt.SystemColor;

public class viewprofile extends JFrame {

	private JPanel contentPane;
	public static  JTextField pin;
	public static  JTextField father;
	public static  JTextField degreei;
	public static  JTextField name; 
	public static  JTextField year;
	public static  JTextField mobile;
	public static  JTextField emailid;
	public static  JTextField city;
	public static  JTextField state;
	public static  JTextField native1;
	public static  JTextField gender;
	public static  JTextField age;
	public static  JTextField mother;
	public static  JTextField fathero;
	public static  JTextField comp;
	public static  JTextField mothero;
	public static  JTextField comp1;
	public static  JTextField univ;
	public static  JTextField yr;
	public static  JTextField perc;
	public static  JTextField grade;
	public static  JTextField degree;
	public static  JTextField univ1;
	public static  JTextField yr1;
	public static  JTextField perc1;
	public static  JTextField grade1;
	public static  JTextField dob;
	
	
	public static JTextField address;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewprofile frame = new viewprofile();
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
	public viewprofile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1316, 767);
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
		panel.setBounds(0, 0, 1305, 730);
		contentPane.add(panel);
		
		JLabel label = new JLabel("Opportunities  dont happen; you create them");
		label.setFont(new Font("Tahoma", Font.BOLD, 21));
		label.setBounds(24, 10, 923, 39);
		panel.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(24, 44, 621, 14);
		panel.add(separator);
		
		JLabel label_1 = new JLabel("Personal Details");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(25, 92, 137, 39);
		panel.add(label_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(24, 131, 138, 11);
		panel.add(separator_1);
		
		JLabel label_2 = new JLabel("Address");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(24, 178, 60, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("PIN");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(24, 254, 33, 14);
		panel.add(label_3);
		
		pin = new JTextField();
		pin.setBackground(Color.WHITE);
		pin.setEditable(false);
		pin.setFont(new Font("Tahoma", Font.BOLD, 14));
		pin.setColumns(10);
		pin.setBorder(new EmptyBorder(0, 0, 0, 0));
		pin.setBounds(94, 250, 193, 19);
		panel.add(pin);
		
		JLabel label_4 = new JLabel("Mobile\r\n No");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(24, 300, 68, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Email Id");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(24, 363, 68, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("City");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(24, 414, 68, 25);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("State");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(24, 470, 68, 25);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Native");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(24, 522, 68, 25);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("Langauge");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(24, 547, 68, 25);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("DOB");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(24, 594, 33, 14);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Gender");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(24, 647, 60, 14);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("Age");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_12.setBounds(24, 691, 60, 19);
		panel.add(label_12);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(361, 92, 24, 628);
		panel.add(separator_2);
		
		JLabel label_13 = new JLabel("Family Details");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_13.setBounds(407, 92, 137, 39);
		panel.add(label_13);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.RED);
		separator_3.setBounds(407, 131, 138, 11);
		panel.add(separator_3);
		
		JLabel label_14 = new JLabel("Father's Name");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_14.setBounds(407, 165, 90, 25);
		panel.add(label_14);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		father = new JTextField();
		father.setBackground(Color.WHITE);
		father.setEditable(false);
		father.setFont(new Font("Tahoma", Font.BOLD, 14));
		father.setColumns(10);
		father.setBorder(new EmptyBorder(0, 0, 0, 0));
		father.setBounds(531, 168, 193, 24);
		panel.add(father);
		
		JLabel label_15 = new JLabel("Mother's Name");
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_15.setBounds(407, 231, 103, 25);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("Father Occupation");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_16.setBounds(407, 300, 114, 25);
		panel.add(label_16);
		
		JLabel lblMobileNo = new JLabel("Mobile No");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobileNo.setBounds(407, 363, 75, 25);
		panel.add(lblMobileNo);
		
		JLabel label_18 = new JLabel("Mother Occupation");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_18.setBounds(407, 443, 125, 25);
		panel.add(label_18);
		
		JLabel lblMobile = new JLabel("Mobile No");
		lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobile.setBounds(407, 522, 75, 25);
		panel.add(lblMobile);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(778, 92, 24, 649);
		panel.add(separator_4);
		
		JLabel label_20 = new JLabel("Educational Qualifications");
		label_20.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_20.setBounds(407, 580, 205, 39);
		panel.add(label_20);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.RED);
		separator_5.setBounds(406, 616, 206, 11);
		panel.add(separator_5);
		
		JLabel label_21 = new JLabel("Institute");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_21.setBounds(407, 673, 68, 25);
		panel.add(label_21);
		
		degreei = new JTextField();
		degreei.setBackground(Color.WHITE);
		degreei.setEditable(false);
		degreei.setFont(new Font("Tahoma", Font.BOLD, 14));
		degreei.setColumns(10);
		degreei.setBorder(new EmptyBorder(0, 0, 0, 0));
		degreei.setBounds(485, 674, 283, 24);
		panel.add(degreei);
		
		JLabel lblth = new JLabel("10th :");
		lblth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblth.setBounds(407, 642, 103, 25);
		panel.add(lblth);
		
		JLabel label_23 = new JLabel("University");
		label_23.setForeground(new Color(0, 0, 0));
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_23.setBounds(795, 107, 103, 25);
		panel.add(label_23);
		
		JLabel label_24 = new JLabel("Year");
		label_24.setForeground(new Color(0, 0, 0));
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_24.setBounds(790, 152, 103, 25);
		panel.add(label_24);
		
		JLabel label_25 = new JLabel("%");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_25.setBounds(790, 198, 103, 25);
		panel.add(label_25);
		
		JLabel label_26 = new JLabel("Grade");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_26.setBounds(790, 249, 103, 25);
		panel.add(label_26);
		
		JLabel label_27 = new JLabel("12th:");
		label_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_27.setBounds(790, 308, 103, 25);
		panel.add(label_27);
		
		JLabel label_28 = new JLabel("Institute");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_28.setBounds(790, 343, 68, 25);
		panel.add(label_28);
		
		JLabel label_29 = new JLabel("University");
		label_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_29.setBounds(795, 398, 103, 25);
		panel.add(label_29);
		
		JLabel label_30 = new JLabel("Year");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_30.setBounds(795, 443, 103, 25);
		panel.add(label_30);
		
		JLabel label_31 = new JLabel("%");
		label_31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_31.setBounds(795, 493, 103, 25);
		panel.add(label_31);
		
		JLabel label_32 = new JLabel("Grade");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_32.setBounds(795, 547, 103, 25);
		panel.add(label_32);
		
		JLabel label_33 = new JLabel("Name");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_33.setBounds(34, 68, 60, 14);
		panel.add(label_33);
		
		name = new JTextField();
		name.setBackground(Color.WHITE);
		name.setEditable(false);
		name.setFont(new Font("Tahoma", Font.BOLD, 14));
		name.setColumns(10);
		name.setBorder(new EmptyBorder(0, 0, 0, 0));
		name.setBounds(94, 63, 193, 19);
		panel.add(name);
		
		JLabel label_34 = new JLabel("Year of Graduation");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_34.setBounds(520, 59, 125, 14);
		panel.add(label_34);
		
		year = new JTextField();
		year.setBackground(Color.WHITE);
		year.setEditable(false);
		year.setFont(new Font("Tahoma", Font.BOLD, 14));
		year.setColumns(10);
		year.setBorder(new EmptyBorder(0, 0, 0, 0));
		year.setBounds(650, 59, 118, 19);
		panel.add(year);
		
		JLabel label_35 = new JLabel("");
		label_35.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_35.setBounds(545, 726, 90, 14);
		panel.add(label_35);
		
		JButton button_2 = new JButton("Next");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new viewprofile1().setVisible(true);
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
			     	   	
			     	viewprofile1.sem1.setText(rs.getString("sem1"));
			     	viewprofile1.sem2.setText(rs.getString("sem2"));
			     	viewprofile1.sem3.setText(rs.getString("sem3"));
			     	viewprofile1.sem4.setText(rs.getString("sem4"));
			     	viewprofile1.sem5.setText(rs.getString("sem5"));
			     	viewprofile1.sem6.setText(rs.getString("sem6"));
			     	viewprofile1.sem7.setText(rs.getString("sem7"));
			     	viewprofile1.sem8.setText(rs.getString("sem8"));
			     	viewprofile1.p.setText(rs.getString("p1"));
			     	viewprofile1.pb.setText(rs.getString("pb1"));
			     	viewprofile1.p1.setText(rs.getString("p2"));
			     	viewprofile1.pb1.setText(rs.getString("pb2"));
			     	viewprofile1.award.setText(rs.getString("award"));
			     	viewprofile1.award1.setText(rs.getString("award2"));
			     	
			     	
			         }
			        ps.close();
			        rs.close();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
			
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button_2.setBorder(null);
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(1024, 630, 137, 48);
		panel.add(button_2);
		
		mobile = new JTextField();
		mobile.setFont(new Font("Tahoma", Font.BOLD, 14));
		mobile.setEditable(false);
		mobile.setColumns(10);
		mobile.setBorder(new EmptyBorder(0, 0, 0, 0));
		mobile.setBackground(Color.WHITE);
		mobile.setBounds(94, 300, 193, 19);
		panel.add(mobile);
		
		emailid = new JTextField();
		emailid.setFont(new Font("Tahoma", Font.BOLD, 14));
		emailid.setEditable(false);
		emailid.setColumns(10);
		emailid.setBorder(new EmptyBorder(0, 0, 0, 0));
		emailid.setBackground(Color.WHITE);
		emailid.setBounds(94, 368, 222, 19);
		panel.add(emailid);
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.BOLD, 14));
		city.setEditable(false);
		city.setColumns(10);
		city.setBorder(new EmptyBorder(0, 0, 0, 0));
		city.setBackground(Color.WHITE);
		city.setBounds(94, 419, 193, 19);
		panel.add(city);
		
		state = new JTextField();
		state.setFont(new Font("Tahoma", Font.BOLD, 14));
		state.setEditable(false);
		state.setColumns(10);
		state.setBorder(new EmptyBorder(0, 0, 0, 0));
		state.setBackground(Color.WHITE);
		state.setBounds(94, 475, 193, 19);
		panel.add(state);
		
		native1 = new JTextField();
		native1.setFont(new Font("Tahoma", Font.BOLD, 14));
		native1.setEditable(false);
		native1.setColumns(10);
		native1.setBorder(new EmptyBorder(0, 0, 0, 0));
		native1.setBackground(Color.WHITE);
		native1.setBounds(94, 538, 193, 19);
		panel.add(native1);
		
		gender = new JTextField();
		gender.setFont(new Font("Tahoma", Font.BOLD, 14));
		gender.setEditable(false);
		gender.setColumns(10);
		gender.setBorder(new EmptyBorder(0, 0, 0, 0));
		gender.setBackground(Color.WHITE);
		gender.setBounds(94, 647, 193, 19);
		panel.add(gender);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.BOLD, 14));
		age.setEditable(false);
		age.setColumns(10);
		age.setBorder(new EmptyBorder(0, 0, 0, 0));
		age.setBackground(Color.WHITE);
		age.setBounds(94, 693, 193, 19);
		panel.add(age);
		
		mother = new JTextField();
		mother.setFont(new Font("Tahoma", Font.BOLD, 14));
		mother.setEditable(false);
		mother.setColumns(10);
		mother.setBorder(new EmptyBorder(0, 0, 0, 0));
		mother.setBackground(Color.WHITE);
		mother.setBounds(531, 232, 222, 24);
		panel.add(mother);
		
		fathero = new JTextField();
		fathero.setFont(new Font("Tahoma", Font.BOLD, 14));
		fathero.setEditable(false);
		fathero.setColumns(10);
		fathero.setBorder(new EmptyBorder(0, 0, 0, 0));
		fathero.setBackground(Color.WHITE);
		fathero.setBounds(545, 301, 193, 24);
		panel.add(fathero);
		
		comp = new JTextField();
		comp.setFont(new Font("Tahoma", Font.BOLD, 14));
		comp.setEditable(false);
		comp.setColumns(10);
		comp.setBorder(new EmptyBorder(0, 0, 0, 0));
		comp.setBackground(Color.WHITE);
		comp.setBounds(545, 364, 193, 24);
		panel.add(comp);
		
		mothero = new JTextField();
		mothero.setFont(new Font("Tahoma", Font.BOLD, 14));
		mothero.setEditable(false);
		mothero.setColumns(10);
		mothero.setBorder(new EmptyBorder(0, 0, 0, 0));
		mothero.setBackground(Color.WHITE);
		mothero.setBounds(542, 444, 193, 24);
		panel.add(mothero);
		
		comp1 = new JTextField();
		comp1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comp1.setEditable(false);
		comp1.setColumns(10);
		comp1.setBorder(new EmptyBorder(0, 0, 0, 0));
		comp1.setBackground(Color.WHITE);
		comp1.setBounds(545, 523, 193, 24);
		panel.add(comp1);
		
		univ = new JTextField();
		univ.setFont(new Font("Tahoma", Font.BOLD, 14));
		univ.setEditable(false);
		univ.setColumns(10);
		univ.setBorder(new EmptyBorder(0, 0, 0, 0));
		univ.setBackground(Color.WHITE);
		univ.setBounds(908, 104, 283, 24);
		panel.add(univ);
		
		yr = new JTextField();
		yr.setFont(new Font("Tahoma", Font.BOLD, 14));
		yr.setEditable(false);
		yr.setColumns(10);
		yr.setBorder(new EmptyBorder(0, 0, 0, 0));
		yr.setBackground(Color.WHITE);
		yr.setBounds(908, 157, 283, 24);
		panel.add(yr);
		
		perc = new JTextField();
		perc.setFont(new Font("Tahoma", Font.BOLD, 14));
		perc.setEditable(false);
		perc.setColumns(10);
		perc.setBorder(new EmptyBorder(0, 0, 0, 0));
		perc.setBackground(Color.WHITE);
		perc.setBounds(908, 198, 283, 24);
		panel.add(perc);
		
		grade = new JTextField();
		grade.setFont(new Font("Tahoma", Font.BOLD, 14));
		grade.setEditable(false);
		grade.setColumns(10);
		grade.setBorder(new EmptyBorder(0, 0, 0, 0));
		grade.setBackground(Color.WHITE);
		grade.setBounds(908, 254, 283, 24);
		panel.add(grade);
		
		degree = new JTextField();
		degree.setFont(new Font("Tahoma", Font.BOLD, 14));
		degree.setEditable(false);
		degree.setColumns(10);
		degree.setBorder(new EmptyBorder(0, 0, 0, 0));
		degree.setBackground(Color.WHITE);
		degree.setBounds(908, 344, 283, 24);
		panel.add(degree);
		
		univ1 = new JTextField();
		univ1.setFont(new Font("Tahoma", Font.BOLD, 14));
		univ1.setEditable(false);
		univ1.setColumns(10);
		univ1.setBorder(new EmptyBorder(0, 0, 0, 0));
		univ1.setBackground(Color.WHITE);
		univ1.setBounds(908, 403, 283, 24);
		panel.add(univ1);
		
		yr1 = new JTextField();
		yr1.setFont(new Font("Tahoma", Font.BOLD, 14));
		yr1.setEditable(false);
		yr1.setColumns(10);
		yr1.setBorder(new EmptyBorder(0, 0, 0, 0));
		yr1.setBackground(Color.WHITE);
		yr1.setBounds(888, 448, 283, 24);
		panel.add(yr1);
		
		perc1 = new JTextField();
		perc1.setFont(new Font("Tahoma", Font.BOLD, 14));
		perc1.setEditable(false);
		perc1.setColumns(10);
		perc1.setBorder(new EmptyBorder(0, 0, 0, 0));
		perc1.setBackground(Color.WHITE);
		perc1.setBounds(888, 498, 283, 24);
		panel.add(perc1);
		
		grade1 = new JTextField();
		grade1.setFont(new Font("Tahoma", Font.BOLD, 14));
		grade1.setEditable(false);
		grade1.setColumns(10);
		grade1.setBorder(new EmptyBorder(0, 0, 0, 0));
		grade1.setBackground(Color.WHITE);
		grade1.setBounds(888, 552, 283, 24);
		panel.add(grade1);
		
		dob = new JTextField();
		dob.setFont(new Font("Tahoma", Font.BOLD, 14));
		dob.setEditable(false);
		dob.setColumns(10);
		dob.setBorder(new EmptyBorder(0, 0, 0, 0));
		dob.setBackground(Color.WHITE);
		dob.setBounds(94, 594, 193, 19);
		panel.add(dob);
		
		address = new JTextField();
		address.setFont(new Font("Tahoma", Font.BOLD, 14));
		address.setEditable(false);
		address.setColumns(10);
		address.setBorder(new EmptyBorder(0, 0, 0, 0));
		address.setBackground(Color.WHITE);
		address.setBounds(104, 152, 210, 68);
		panel.add(address);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(new Color(175, 238, 238));
		button.setBounds(1191, 0, 47, 19);
		panel.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBorder(null);
		button_1.setBackground(new Color(135, 206, 235));
		button_1.setBounds(1248, 0, 47, 19);
		panel.add(button_1);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(0, 0, 1295, 741);
		ImageIcon img=new ImageIcon(new ImageIcon("D:/hi.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
		l1.setIcon(img);
		panel.add(l1);
	}
}
