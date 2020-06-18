import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class biodata extends JFrame {
	public static JDateChooser date;
	private JPanel contentPane;
	//public static JTextField add;
	public static JTextField pin;
	public static JTextField mob;
	public static JTextField email;
	public static JTextField city;
	public static JTextField state;
	public static JTextField native1;
	public static JTextField gend;
	public static JTextField age;
	public static JTextField father;
	public static JTextField mother;
	public static JTextField fathero;
	public static JTextField c1;
	public static JTextField mothero;
	public static JTextField c2;
	public static JTextField degreei;
	public static JTextField univ;
	public static JTextField yr;
	public static JTextField perc;
	public static JTextField grade;
	public static JTextField inst;
	public static JTextField univ1;
	public static JTextField yr1;
	public static JTextField grade1;
	public static JTextField perc1;
	public static JTextField name;
	public static JTextField year;
	private JLabel save2;
	private JLabel save3;
	public static JTextField add;
//	private JTextField add;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biodata frame = new biodata();
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
	
	public biodata() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1319, 788);
		contentPane = 	new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		JLabel lblNewLabel = new JLabel("Opportunities  dont happen; you create them");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel.setBounds(24, 10, 1198, 39);
		contentPane.add(lblNewLabel);
		
		JDateChooser date = new JDateChooser();
		date.getCalendarButton().setBounds(241, 1, 21, 115);
		date.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		date.setBounds(94, 594, 205, 24);
		date.setForeground(new Color(105, 105, 105));
		contentPane.add(date);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(24, 44, 621, 14);
		contentPane.add(separator);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPersonalDetails.setBounds(25, 92, 137, 39);
		contentPane.add(lblPersonalDetails);
		
		
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.RED);
		separator_1.setBounds(24, 131, 138, 11);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Address");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 178, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPin = new JLabel("PIN");
		lblPin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPin.setBounds(24, 254, 33, 14);
		contentPane.add(lblPin);
		
		pin = new JTextField();
		pin.setBorder(new LineBorder(Color.BLACK));
		pin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pin.setBounds(94, 250, 193, 19);
		
		contentPane.add(pin);
		pin.setColumns(10);
		
		JLabel lblMobileNo = new JLabel("Mobile\r\n No");
		lblMobileNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobileNo.setBounds(24, 300, 68, 25);
		contentPane.add(lblMobileNo);
		
		mob = new JTextField();
		mob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mob.setColumns(10);
		mob.setBorder(new LineBorder(Color.BLACK));
		mob.setBounds(97, 305, 193, 19);
		contentPane.add(mob);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmailId.setBounds(24, 363, 68, 25);
		contentPane.add(lblEmailId);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 14));
		email.setColumns(10);
		email.setBorder(new LineBorder(Color.BLACK));
		email.setBounds(94, 368, 193, 19);
		contentPane.add(email);
		
		JLabel lblCity = new JLabel("City");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBounds(24, 414, 68, 25);
		contentPane.add(lblCity);
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.PLAIN, 14));
		city.setColumns(10);
		city.setBorder(new LineBorder(Color.BLACK));
		city.setBounds(94, 419, 193, 19);
		contentPane.add(city);
		
		JLabel lblState = new JLabel("State");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblState.setBounds(24, 470, 68, 25);
		contentPane.add(lblState);
		
		state = new JTextField();
		state.setFont(new Font("Tahoma", Font.PLAIN, 14));
		state.setColumns(10);
		state.setBorder(new LineBorder(Color.BLACK));
		state.setBounds(94, 475, 193, 19);
		contentPane.add(state);
		
		JLabel lblNative = new JLabel("Native");
		lblNative.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNative.setBounds(24, 522, 68, 25);
		contentPane.add(lblNative);
		
		JLabel lblLangauge = new JLabel("Langauge");
		lblLangauge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLangauge.setBounds(24, 547, 68, 25);
		contentPane.add(lblLangauge);
		
		native1 = new JTextField();
		native1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		native1.setColumns(10);
		native1.setBorder(new LineBorder(Color.BLACK));
		native1.setBounds(94, 527, 193, 19);
		contentPane.add(native1);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDob.setBounds(24, 594, 33, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGender.setBounds(24, 647, 60, 14);
		contentPane.add(lblGender);
		
		gend = new JTextField();
		gend.setFont(new Font("Tahoma", Font.PLAIN, 14));
		gend.setColumns(10);
		gend.setBorder(new LineBorder(Color.BLACK));
		gend.setBounds(94, 645, 193, 19);
		contentPane.add(gend);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAge.setBounds(24, 691, 60, 19);
		contentPane.add(lblAge);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.PLAIN, 14));
		age.setColumns(10);
		age.setBorder(new LineBorder(Color.BLACK));
		age.setBounds(94, 691, 193, 19);
		contentPane.add(age);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(383, 92, 24, 649);
		contentPane.add(separator_2);
		
		JLabel lblFamilyDetails = new JLabel("Family Details");
		lblFamilyDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFamilyDetails.setBounds(407, 92, 137, 39);
		contentPane.add(lblFamilyDetails);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(Color.RED);
		separator_3.setBounds(407, 131, 138, 11);
		contentPane.add(separator_3);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFathersName.setBounds(407, 165, 90, 25);
		contentPane.add(lblFathersName);
		
		father = new JTextField();
		father.setFont(new Font("Tahoma", Font.PLAIN, 14));
		father.setColumns(10);
		father.setBorder(new LineBorder(Color.BLACK));
		father.setBounds(531, 168, 193, 24);
		contentPane.add(father);
		
		JLabel lblMothersName = new JLabel("Mother's Name");
		lblMothersName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMothersName.setBounds(407, 231, 103, 25);
		contentPane.add(lblMothersName);
		
		mother = new JTextField();
		mother.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mother.setColumns(10);
		mother.setBorder(new LineBorder(Color.BLACK));
		mother.setBounds(531, 232, 193, 24);
		contentPane.add(mother);
		
		JLabel lblFatherOccupation = new JLabel("Father Occupation");
		lblFatherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFatherOccupation.setBounds(407, 300, 114, 25);
		contentPane.add(lblFatherOccupation);
		
		fathero = new JTextField();
		fathero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		fathero.setColumns(10);
		fathero.setBorder(new LineBorder(Color.BLACK));
		fathero.setBounds(531, 301, 193, 24);
		contentPane.add(fathero);
		
		JLabel lblCompany = new JLabel("Mobile No");
		lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCompany.setBounds(407, 363, 75, 25);
		contentPane.add(lblCompany);
		
		c1 = new JTextField();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c1.setColumns(10);
		c1.setBorder(new LineBorder(Color.BLACK));
		c1.setBounds(531, 364, 193, 24);
		contentPane.add(c1);
		
		JLabel lblMotherOccupation = new JLabel("Mother Occupation");
		lblMotherOccupation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMotherOccupation.setBounds(407, 443, 125, 25);
		contentPane.add(lblMotherOccupation);
		
		mothero = new JTextField();
		mothero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		mothero.setColumns(10);
		mothero.setBorder(new LineBorder(Color.BLACK));
		mothero.setBounds(531, 444, 193, 24);
		contentPane.add(mothero);
		
		JLabel lblMobileNo_1 = new JLabel("Mobile No");
		lblMobileNo_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMobileNo_1.setBounds(407, 522, 75, 25);
		contentPane.add(lblMobileNo_1);
		
		c2 = new JTextField();
		c2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c2.setColumns(10);
		c2.setBorder(new LineBorder(Color.BLACK));
		c2.setBounds(531, 523, 193, 24);
		contentPane.add(c2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(778, 92, 24, 649);
		contentPane.add(separator_4);
		
		JLabel lblEducationlQualifications = new JLabel("Educational Qualifications");
		lblEducationlQualifications.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEducationlQualifications.setBounds(407, 580, 205, 39);
		contentPane.add(lblEducationlQualifications);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(Color.RED);
		separator_5.setBounds(406, 616, 206, 11);
		contentPane.add(separator_5);
		
		JLabel lblInstitute = new JLabel("Institute");
		lblInstitute.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInstitute.setBounds(407, 673, 68, 25);
		contentPane.add(lblInstitute);
		 
		degreei = new JTextField();
		degreei.setFont(new Font("Tahoma", Font.PLAIN, 14));
		degreei.setColumns(10);
		degreei.setBorder(new LineBorder(Color.BLACK));
		degreei.setBounds(485, 674, 283, 24);
		contentPane.add(degreei);
		
		JLabel lblDegree = new JLabel("10th:");
		lblDegree.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDegree.setBounds(407, 642, 103, 25);
		contentPane.add(lblDegree);
		
		JLabel lblUniversity = new JLabel("University");
		lblUniversity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUniversity.setBounds(795, 107, 103, 25);
		contentPane.add(lblUniversity);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYear.setBounds(790, 152, 103, 25);
		contentPane.add(lblYear);
		
		JLabel label_4 = new JLabel("%");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(790, 198, 103, 25);
		contentPane.add(label_4);
		
		JLabel lblGrade = new JLabel("Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGrade.setBounds(790, 249, 103, 25);
		contentPane.add(lblGrade);
		
		univ = new JTextField();
		univ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		univ.setColumns(10);
		univ.setBorder(new LineBorder(Color.BLACK));
		univ.setBounds(903, 104, 235, 24);
		contentPane.add(univ);
		
		yr = new JTextField();
		yr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yr.setColumns(10);
		yr.setBorder(new LineBorder(Color.BLACK));
		yr.setBounds(903, 152, 193, 24);
		contentPane.add(yr);
		
		perc = new JTextField();
		perc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		perc.setColumns(10);
		perc.setBorder(new LineBorder(Color.BLACK));
		perc.setBounds(903, 203, 193, 24);
		contentPane.add(perc);
		
		grade = new JTextField();
		grade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		grade.setColumns(10);
		grade.setBorder(new LineBorder(Color.BLACK));
		grade.setBounds(903, 254, 193, 24);
		contentPane.add(grade);
		
		JLabel lblth = new JLabel("12th:");
		lblth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblth.setBounds(790, 308, 103, 25);
		contentPane.add(lblth);
		
		JLabel label_1 = new JLabel("Institute");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(790, 343, 68, 25);
		contentPane.add(label_1);
		
		inst = new JTextField();
		inst.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inst.setColumns(10);
		inst.setBorder(new LineBorder(Color.BLACK));
		inst.setBounds(867, 345, 283, 24);
		contentPane.add(inst);
		
		JLabel label_2 = new JLabel("University");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(795, 398, 103, 25);
		contentPane.add(label_2);
		
		univ1 = new JTextField();
		univ1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		univ1.setColumns(10);
		univ1.setBorder(new LineBorder(Color.BLACK));
		univ1.setBounds(903, 395, 235, 24);
		contentPane.add(univ1);
		
		yr1 = new JTextField();
		yr1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yr1.setColumns(10);
		yr1.setBorder(new LineBorder(Color.BLACK));
		yr1.setBounds(903, 443, 193, 24);
		contentPane.add(yr1);
		
		JLabel label_3 = new JLabel("Year");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(795, 443, 103, 25);
		contentPane.add(label_3);
		
		JLabel label_5 = new JLabel("%");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(795, 493, 103, 25);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Grade");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(795, 547, 103, 25);
		contentPane.add(label_6);
		
		grade1 = new JTextField();
		grade1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		grade1.setColumns(10);
		grade1.setBorder(new LineBorder(Color.BLACK));
		grade1.setBounds(903, 560, 193, 24);
		contentPane.add(grade1);
		
		perc1 = new JTextField();
		perc1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		perc1.setColumns(10);
		perc1.setBorder(new LineBorder(Color.BLACK));
		perc1.setBounds(903, 494, 193, 24);
		contentPane.add(perc1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(34, 68, 60, 14);
		contentPane.add(lblName);
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		name.setColumns(10);
		name.setBorder(new LineBorder(Color.BLACK));
		name.setBounds(94, 63, 193, 19);
		contentPane.add(name);
		
		JLabel lblYearOfGraduation = new JLabel("Year of Graduation");
		lblYearOfGraduation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYearOfGraduation.setBounds(520, 59, 125, 14);
		contentPane.add(lblYearOfGraduation);
		
		year = new JTextField();
		year.setFont(new Font("Tahoma", Font.PLAIN, 14));
		year.setColumns(10);
		year.setBorder(new LineBorder(Color.BLACK));
		year.setBounds(650, 59, 118, 19);
		contentPane.add(year);
		
		JLabel save2 = new JLabel("");
		save2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		save2.setBounds(545, 726, 90, 14);
		contentPane.add(save2);
		
		JButton button = new JButton("Save");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				  PreparedStatement ps;
		           String query = "insert into family(address, pin,contact,email,city,state,native,dob,gender,age,name,father,mother,fathero,mothero,comp,comp2,degreei) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		        
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		            
		           ps.setString(1, add.getText());
		           
		           
		            ps.setString(2, pin.getText());
		            ps.setLong(3, Long.parseLong(mob.getText()));
		            ps.setString(4, email.getText());
		            ps.setString(5, city.getText());
		            ps.setString(6, state.getText());
		           
		            ps.setString(7, native1.getText());
		            ps.setString(8, ((JTextField)date.getDateEditor().getUiComponent()).getText());
		            ps.setString(9, gend.getText());
		            ps.setLong(10, Integer.parseInt(age.getText()));
		            ps.setString(11, name.getText());
		            ps.setString(12, father.getText());
			           
		            ps.setString(13, mother.getText());
		            ps.setString(14, fathero.getText());
		            ps.setString(15, mothero.getText());
		            ps.setString(16, c1.getText());
		            ps.setString(17, c2.getText());
		            ps.setString(18, degreei.getText());
		           
		          
		             if(ps.executeUpdate() > 0)
		            {
		            	
		            		save2.setText("Saved");
		           
		            		
		            		
		                         }else{
		                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
		                         }
		        	
					
			      
		        }
		        catch (Exception e1)
		        {
		         Logger.getLogger(studentregister.class.getName()).log(Level.SEVERE, null, e1);   
		         System.out.println("hhhhhi");
		        }
				
			
				
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBorder(null);
		button.setBackground(Color.GREEN);
		button.setBounds(661, 708, 95, 32);
		contentPane.add(button);
		
		JLabel save3 = new JLabel("");
		save3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		save3.setBounds(1020, 594, 90, 14);
		contentPane.add(save3);
		
		JButton button_1 = new JButton("Save");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    PreparedStatement ps;
		           String query = "insert into engineer(degreei,univ,year,perc,grade,highi,univ1,perc1,year1,grade1) VALUES (?,?,?,?,?,?,?,?,?,?);";
		        
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		            
		            ps.setString(1, degreei.getText());
		           
		            ps.setString(2, univ.getText());
		            ps.setString(3, yr.getText());
		            ps.setString(4, perc.getText());
		            ps.setString(5, grade.getText());
		            ps.setString(6, inst.getText());
		            ps.setString(7, univ1.getText());
		            ps.setString(8, perc1.getText());
		            ps.setString(9, yr1.getText());
		            ps.setString(10, grade1.getText());
		           
		           
		     
		            if(ps.executeUpdate() > 0)
		            {
		            	
		            		save3.setText("Saved");
		            		
		                         }else{
		                             JOptionPane.showMessageDialog(null, "Error: Check Your Information");
		                         }
		        }
		        catch (Exception e1)
		        {
		         Logger.getLogger(studentregister.class.getName()).log(Level.SEVERE, null, e1);   
		         System.out.println("hhhhhi");
		        }
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBorder(null);
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(1120, 580, 95, 32);
		contentPane.add(button_1);
		
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new biodata1().setVisible(true);
			dispose();
				}
		});
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNext.setBorder(null);
		btnNext.setBackground(Color.BLACK);
		btnNext.setBounds(903, 678, 137, 48);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentdashboard1().setVisible(true);
				dispose();
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBorder(null);
		btnBack.setBackground(Color.BLACK);
		btnBack.setBounds(1080, 677, 135, 49);
		contentPane.add(btnBack);
		
		JButton button_2 = new JButton("-");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button_2.setForeground(new Color(0, 0, 0));
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button_2.setBorder(null);
		button_2.setBackground(new Color(255, 255, 255));
		button_2.setBounds(1191, 0, 47, 19);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("X");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_3.setForeground(new Color(0, 0, 0));
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_3.setBorder(null);
		button_3.setBackground(new Color(255, 255, 255));
		button_3.setBounds(1248, 0, 47, 19);
		contentPane.add(button_3);
		
		add = new JTextField();
		add.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add.setColumns(10);
		add.setBorder(new LineBorder(Color.BLACK));
		add.setBounds(94, 152, 193, 55);
		add.setEditable(true);
		contentPane.add(add);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(0, 0, 1319, 778);

ImageIcon img=new ImageIcon(new ImageIcon("D:/nice.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
		l1.setIcon(img);
		contentPane.add(l1);
		
		

	
	}
}
