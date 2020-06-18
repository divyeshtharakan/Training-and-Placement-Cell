import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class adminapp extends JFrame {

	public static JPanel contentPane;
	public static JTextField t1;
	public static JTextField t2;
	public static JTextField t3;
	public static JTextField t4;
	public static JTextField t5;
	public static JTextField t6;
	public static JTextField t7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminapp frame = new adminapp();
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
	public adminapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 751);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		
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
		button.setBounds(571, 10, 47, 19);
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
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(628, 10, 47, 19);
		contentPane.add(button_1);
		
		JLabel lblStudentDetails = new JLabel("Student Details:");
		lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentDetails.setBounds(30, 111, 179, 22);
		contentPane.add(lblStudentDetails);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(30, 134, 179, 10);
		contentPane.add(separator);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblName.setBounds(30, 187, 176, 27);
		contentPane.add(lblName);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEmailId.setBounds(30, 265, 176, 27);
		contentPane.add(lblEmailId);
		
		JLabel lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblContactNo.setBounds(30, 349, 176, 27);
		contentPane.add(lblContactNo);
		
		JLabel lblApplyingForThe = new JLabel("Applying for the post of");
		lblApplyingForThe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApplyingForThe.setBounds(30, 431, 194, 27);
		contentPane.add(lblApplyingForThe);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGender.setBounds(30, 507, 176, 27);
		contentPane.add(lblGender);
		
		JLabel lblYearOfGraduation = new JLabel("Year of graduation");
		lblYearOfGraduation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblYearOfGraduation.setBounds(30, 585, 176, 27);
		contentPane.add(lblYearOfGraduation);
		
		JButton btnBiodata = new JButton("Biodata");
		btnBiodata.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBiodata.setBorder(null);
		btnBiodata.setBackground(new Color(64, 224, 208));
		btnBiodata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					File pdf=new File(t7.getText());
					if(pdf.exists())
					{
						if(Desktop.isDesktopSupported())
						{
							Desktop.getDesktop().open(pdf);
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Desktop is not supported");
						}
						
					}else
					{
						JOptionPane.showMessageDialog(rootPane, "File doesn't exist!");
					}
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnBiodata.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBiodata.setBounds(30, 650, 171, 23);
		contentPane.add(btnBiodata);
		
		t1 = new JTextField();
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setBackground(Color.WHITE);
		t1.setEditable(false);
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBounds(263, 187, 282, 25);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setEditable(false);
		t2.setColumns(10);
		t2.setBorder(new EmptyBorder(0, 0, 0, 0));
		t2.setBackground(Color.WHITE);
		t2.setBounds(263, 265, 282, 25);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setFont(new Font("Tahoma", Font.BOLD, 15));
		t3.setEditable(false);
		t3.setColumns(10);
		t3.setBorder(new EmptyBorder(0, 0, 0, 0));
		t3.setBackground(Color.WHITE);
		t3.setBounds(263, 349, 282, 25);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setFont(new Font("Tahoma", Font.BOLD, 15));
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBorder(new EmptyBorder(0, 0, 0, 0));
		t4.setBackground(Color.WHITE);
		t4.setBounds(263, 431, 282, 25);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.setFont(new Font("Tahoma", Font.BOLD, 15));
		t5.setEditable(false);
		t5.setColumns(10);
		t5.setBorder(new EmptyBorder(0, 0, 0, 0));
		t5.setBackground(Color.WHITE);
		t5.setBounds(263, 507, 282, 25);
		contentPane.add(t5);
		
		t6 = new JTextField();
		t6.setFont(new Font("Tahoma", Font.BOLD, 15));
		t6.setEditable(false);
		t6.setColumns(10);
		t6.setBorder(new EmptyBorder(0, 0, 0, 0));
		t6.setBackground(Color.WHITE);
		t6.setBounds(263, 585, 282, 25);
		contentPane.add(t6);
		
		t7 = new JTextField();
		t7.setFont(new Font("Tahoma", Font.BOLD, 15));
		t7.setEditable(false);
		t7.setColumns(10);
		t7.setBorder(new EmptyBorder(0, 0, 0, 0));
		t7.setBackground(Color.WHITE);
		t7.setBounds(263, 648, 382, 25);
		contentPane.add(t7);
		
		JButton btnAccept = new JButton("Accept");
		btnAccept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "Confirming your action?","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	          	
	            
	             if(r==JOptionPane.YES_OPTION)
	            {
	            		PreparedStatement ps;
	    		   String query = "update appsend set status='Accepted' where name='"+t1.getText()+"'";
	    			     
	    			     try {
	    			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	    			         ps = conn.prepareStatement(query);
	    			     ps.executeUpdate();
	    			    JOptionPane.showMessageDialog(null, "Application Accepted!");
	    					
	    				}catch(Exception e1)
	    			     {
	    						e1.printStackTrace();
	    			     }
	            }
	             else if(r==JOptionPane.NO_OPTION)
	             {
	            	 dispose();
	             }
			}
		});
		btnAccept.setForeground(Color.WHITE);
		btnAccept.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAccept.setBorder(null);
		btnAccept.setBackground(Color.BLACK);
		btnAccept.setBounds(93, 712, 105, 29);
		contentPane.add(btnAccept);
		
		JButton btnMarkForReview = new JButton("Mark for Review");
		btnMarkForReview.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "Confirming your action?","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	          	
	            
	             if(r==JOptionPane.YES_OPTION)
	            {
	            		PreparedStatement ps;
	    		   String query = "update appsend set status='In Progress' where name='"+t1.getText()+"'";
	    			     
	    			     try {
	    			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	    			         ps = conn.prepareStatement(query);
	    			     ps.executeUpdate();
	    			    JOptionPane.showMessageDialog(null, "Updated!");
	    					
	    				}catch(Exception e1)
	    			     {
	    						e1.printStackTrace();
	    			     }
	            }
	             else if(r==JOptionPane.NO_OPTION)
	             {
	            	 dispose();
	             }
			}
		});
		btnMarkForReview.setForeground(Color.WHITE);
		btnMarkForReview.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMarkForReview.setBorder(null);
		btnMarkForReview.setBackground(Color.BLACK);
		btnMarkForReview.setBounds(265, 712, 135, 29);
		contentPane.add(btnMarkForReview);
		
		JButton btnReject = new JButton("Reject");
		btnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int r=JOptionPane.showConfirmDialog(null, "Confirming your action?","Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	          	
	            
	             if(r==JOptionPane.YES_OPTION)
	            {
	            		PreparedStatement ps;
	    		   String query = "update appsend set status='Rejected' where name='"+t1.getText()+"'";
	    			     
	    			     try {
	    			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	    			         ps = conn.prepareStatement(query);
	    			     ps.executeUpdate();
	    			    JOptionPane.showMessageDialog(null, "Application Rejected..");
	    					
	    				}catch(Exception e1)
	    			     {
	    						e1.printStackTrace();
	    			     }
	            }
	             else if(r==JOptionPane.NO_OPTION)
	             {
	            	 dispose();
	             }
			}
		});
		btnReject.setForeground(Color.WHITE);
		btnReject.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReject.setBorder(null);
		btnReject.setBackground(Color.BLACK);
		btnReject.setBounds(466, 712, 105, 29);
		contentPane.add(btnReject);
		
		JLabel lblNewLabel = new JLabel("Note: Whatever action is performed by the admin for the application, it will be reflected in the");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(43, 54, 621, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblStudentDashboard = new JLabel("student dashboard.");
		lblStudentDashboard.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStudentDashboard.setEnabled(false);
		lblStudentDashboard.setBounds(43, 83, 621, 13);
		contentPane.add(lblStudentDashboard);
		setUndecorated(true);
	}
}
