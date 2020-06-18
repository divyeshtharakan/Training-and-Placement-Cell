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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class biodata1 extends JFrame {

	private JPanel contentPane;
	public static JTextField sem1;
	public static JTextField sem2;
	public static JTextField sem3;
	public static JTextField sem4;
	public static JTextField sem5;
	public static JTextField sem6;
	public static JTextField sem7;
	public static JTextField sem8;
	public static JTextField p1;
	public static JTextField p2;
	public static JTextField award;
	public static JTextField award2;
	//public static JLabel lk;
	public static JTextField pb1;
	public static JTextField pb2;
	private ImageIcon format;
	String filename=null;
	int s=0;
	byte[] person_image=null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					biodata1 frame = new biodata1();
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
	public biodata1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1012, 585);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
		JLabel lblEngineeringExamDetails = new JLabel("Engineering Exam Details");
		lblEngineeringExamDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEngineeringExamDetails.setBounds(10, 36, 200, 39);
		contentPane.add(lblEngineeringExamDetails);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(10, 73, 266, 11);
		contentPane.add(separator);
		
		JLabel lblSemI = new JLabel("SEM I");
		lblSemI.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemI.setBounds(10, 97, 48, 25);
		contentPane.add(lblSemI);
		
		JLabel lblSemIi = new JLabel("SEM II");
		lblSemIi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemIi.setBounds(10, 143, 48, 25);
		contentPane.add(lblSemIi);
		
		JLabel lblSemIii = new JLabel("SEM III");
		lblSemIii.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemIii.setBounds(10, 193, 58, 25);
		contentPane.add(lblSemIii);
		
		JLabel lblSemIv = new JLabel("SEM IV");
		lblSemIv.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemIv.setBounds(10, 248, 48, 25);
		contentPane.add(lblSemIv);
		
		JLabel lblSemV = new JLabel("SEM V");
		lblSemV.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemV.setBounds(10, 304, 48, 25);
		contentPane.add(lblSemV);
		
		JLabel lblSemVi = new JLabel("SEM VI");
		lblSemVi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemVi.setBounds(10, 359, 48, 25);
		contentPane.add(lblSemVi);
		
		JLabel lblSemVii = new JLabel("SEM VII");
		lblSemVii.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemVii.setBounds(10, 420, 58, 25);
		contentPane.add(lblSemVii);
		
		JLabel lblSemViii = new JLabel("SEM VIII");
		lblSemViii.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSemViii.setBounds(10, 472, 58, 25);
		contentPane.add(lblSemViii);
		
		sem1 = new JTextField();
		sem1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem1.setColumns(10);
		sem1.setBorder(new LineBorder(Color.BLACK));
		sem1.setBounds(83, 102, 104, 19);
		contentPane.add(sem1);
		
		sem2 = new JTextField();
		sem2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem2.setColumns(10);
		sem2.setBorder(new LineBorder(Color.BLACK));
		sem2.setBounds(83, 148, 104, 19);
		contentPane.add(sem2);
		
		sem3 = new JTextField();
		sem3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem3.setColumns(10);
		sem3.setBorder(new LineBorder(Color.BLACK));
		sem3.setBounds(83, 198, 104, 19);
		contentPane.add(sem3);
		
		sem4 = new JTextField();
		sem4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem4.setColumns(10);
		sem4.setBorder(new LineBorder(Color.BLACK));
		sem4.setBounds(83, 253, 104, 19);
		contentPane.add(sem4);
		
		sem5 = new JTextField();
		sem5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem5.setColumns(10);
		sem5.setBorder(new LineBorder(Color.BLACK));
		sem5.setBounds(83, 309, 104, 19);
		contentPane.add(sem5);
		
		sem6 = new JTextField();
		sem6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem6.setColumns(10);
		sem6.setBorder(new LineBorder(Color.BLACK));
		sem6.setBounds(83, 364, 104, 19);
		contentPane.add(sem6);
		
		sem7 = new JTextField();
		sem7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem7.setColumns(10);
		sem7.setBorder(new LineBorder(Color.BLACK));
		sem7.setBounds(83, 425, 104, 19);
		contentPane.add(sem7);
		
		sem8 = new JTextField();
		sem8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sem8.setColumns(10);
		sem8.setBorder(new LineBorder(Color.BLACK));
		sem8.setBounds(83, 475, 104, 19);
		contentPane.add(sem8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(286, 39, 24, 502);
		contentPane.add(separator_1);
		
		JLabel lblProjects = new JLabel("Projects");
		lblProjects.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblProjects.setBounds(318, 36, 75, 39);
		contentPane.add(lblProjects);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.RED);
		separator_2.setBounds(300, 73, 113, 11);
		contentPane.add(separator_2);
		
		JLabel lblProjectName = new JLabel("Project Name:");
		lblProjectName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblProjectName.setBounds(321, 97, 113, 25);
		contentPane.add(lblProjectName);
		
		p1 = new JTextField();
		p1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p1.setColumns(10);
		p1.setBorder(new LineBorder(Color.BLACK));
		p1.setBounds(426, 100, 184, 19);
		contentPane.add(p1);
		
		JLabel lblBrief = new JLabel("Brief:");
		lblBrief.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBrief.setBounds(320, 151, 48, 25);
		contentPane.add(lblBrief);
		
		JLabel label = new JLabel("Project Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(319, 267, 113, 25);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Brief:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(318, 321, 48, 25);
		contentPane.add(label_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(638, 36, 24, 502);
		contentPane.add(separator_3);
		
		JLabel lblAwards = new JLabel("Awards");
		lblAwards.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAwards.setBounds(676, 36, 75, 39);
		contentPane.add(lblAwards);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(Color.RED);
		separator_4.setBounds(671, 73, 113, 11);
		contentPane.add(separator_4);
		
		p2 = new JTextField();
		p2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		p2.setColumns(10);
		p2.setBorder(new LineBorder(Color.BLACK));
		p2.setBounds(426, 273, 184, 19);
		contentPane.add(p2);
		
		award = new JTextField();
		award.setFont(new Font("Tahoma", Font.PLAIN, 14));
		award.setColumns(10);
		award.setBorder(new LineBorder(Color.BLACK));
		award.setBounds(672, 102, 316, 39);
		contentPane.add(award);
		
		award2 = new JTextField();
		award2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		award2.setColumns(10);
		award2.setBorder(new LineBorder(Color.BLACK));
		award2.setBounds(672, 212, 316, 39);
		contentPane.add(award2);
		
		JLabel lk = new JLabel("");
		lk.setBounds(774, 283, 166, 161);
		contentPane.add(lk);
		
		PreparedStatement ps;
	    String query = "select * from register where username='"+studentdashboard.t1.getText()+"'";
	     
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
		
		
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    PreparedStatement ps;
		           String query = "insert into edu(yearofgrad,sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8,p1,pb1,p2,pb2,award,award2) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
		        
		        try {
		        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		            ps = conn.prepareStatement(query);
		            
		            ps.setString(1, biodata.year.getText());
		           
		            ps.setString(2, sem1.getText());
		            ps.setString(3, sem2.getText());
		            ps.setString(4, sem3.getText());
		            ps.setString(5, sem4.getText());
		            ps.setString(6, sem5.getText());
		            ps.setString(7, sem6.getText());
		            ps.setString(8, sem7.getText());
		            ps.setString(9, sem8.getText());
		            ps.setString(10, p1.getText());
		            ps.setString(11, pb1.getText());
		            ps.setString(12, p2.getText());
		            ps.setString(13, pb2.getText());
		            ps.setString(14, award.getText());
		            ps.setString(15, award2.getText());
		            
		           
		     
		            if(ps.executeUpdate() > 0)
		            {
		            	
		              JOptionPane.showMessageDialog(null, "Biodata Saved Completely");
		            	//  new studentdashboard1().setVisible(true);
		            	  dispose();
		            		
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
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSave.setBorder(null);
		btnSave.setBackground(Color.BLACK);
		btnSave.setBounds(658, 460, 137, 48);
		contentPane.add(btnSave);
		
		JButton btnReturnToFirst = new JButton("Return to first page");
		btnReturnToFirst.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new biodata().setVisible(true); 
				dispose();
			}
			
		});
		btnReturnToFirst.setForeground(Color.WHITE);
		btnReturnToFirst.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReturnToFirst.setBorder(null);
		btnReturnToFirst.setBackground(Color.BLACK);
		btnReturnToFirst.setBounds(851, 460, 151, 48);
		contentPane.add(btnReturnToFirst);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(new Color(211, 211, 211));
		button.setBounds(894, 0, 47, 19);
		contentPane.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBorder(null);
		button_1.setBackground(new Color(211, 211, 211));
		button_1.setBounds(951, 0, 47, 19);
		contentPane.add(button_1);
		
		pb1 = new JTextField();
		pb1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pb1.setColumns(10);
		pb1.setBorder(new LineBorder(Color.BLACK));
		pb1.setBounds(426, 143, 184, 103);
		contentPane.add(pb1);
		
		pb2 = new JTextField();
		pb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		pb2.setColumns(10);
		pb2.setBorder(new LineBorder(Color.BLACK));
		pb2.setBounds(426, 333, 184, 103);
		contentPane.add(pb2);
		
		JLabel lblSgpa = new JLabel("SGPA");
		lblSgpa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSgpa.setBounds(213, 100, 63, 19);
		contentPane.add(lblSgpa);
		
		JLabel label_2 = new JLabel("SGPA");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(213, 146, 63, 19);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("SGPA");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(213, 193, 63, 19);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("SGPA");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(213, 251, 63, 19);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("SGPA");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_5.setBounds(213, 309, 63, 19);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("SGPA");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(213, 367, 63, 19);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("SGPA");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_7.setBounds(213, 428, 63, 19);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("SGPA");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(213, 472, 63, 19);
		contentPane.add(label_8);
		
		
		
	}
}
