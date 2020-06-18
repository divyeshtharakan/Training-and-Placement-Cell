import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;

import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class viewapp extends JFrame {

	public static JPanel contentPane;
	public static JTextField t1;
	public static JTextField t2;
	public static JTextField t3;
	public static JTextField t4;
	public static JTextField t5;
	public static JTextField t6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					viewapp frame = new viewapp();
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

	public viewapp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 682, 659);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel label = new JLabel("Details");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(5, 43, 323, 22);
		contentPane.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.RED);
		separator.setBounds(5, 75, 250, 10);
		contentPane.add(separator);
		
		JLabel label_1 = new JLabel("Job/Internship");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(28, 119, 176, 29);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Name of Company");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_2.setBounds(28, 186, 147, 29);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Location");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_3.setBounds(28, 266, 147, 29);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Position");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_4.setBounds(28, 327, 176, 29);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Last Date to Apply");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(28, 397, 147, 29);
		contentPane.add(label_5);
		
		JButton button = new JButton("Open related doc");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
					File pdf=new File(t6.getText());
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
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBounds(5, 471, 171, 23);
		contentPane.add(button);
		
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new apply().setVisible(true);
				PreparedStatement ps;
			PreparedStatement ps1;
			    String query = "select * from register where username='"+studentdashboard.t1.getText()+"'";
			     String q="select * from application where jobt=?";
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			         ps = conn.prepareStatement(query);
			         
			       //  ps1=conn.prepareStatement(q);
			      //   ps1.setString(1, studentdashboard1.comp.getText());
			        ResultSet rs=ps.executeQuery();
			        
			        while(rs.next())
			         {
			     	   	apply.t1.setText(rs.getString("name"));
			     		apply.t2.setText(rs.getString("email"));
			     		apply.t3.setText(rs.getString("contact"));
			     		apply.t5.setText(rs.getString("gender"));
			     		apply.t7.setText(rs.getString("yearofgrad"));
			     	 
			     	   	
			         }
			        
			   
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
				
			}
		});
		btnApply.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnApply.setBounds(236, 570, 186, 29);
		btnApply.setBorder(null);
		contentPane.add(btnApply);
		
		JLabel lblNewLabel = new JLabel("*An email for the same has been sent to your registered email id.\r\nPlease check the mail incase you face any issues.");
		lblNewLabel.setEnabled(false);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(5, 517, 658, 22);
		contentPane.add(lblNewLabel);
		
		JButton button_1 = new JButton("-");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button_1.setBorder(null);
		button_1.setBackground(new Color(255, 255, 255));
		button_1.setBounds(564, 10, 47, 19);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("X");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_2.setBorder(null);
		button_2.setBackground(new Color(255, 255, 255));
		button_2.setBounds(616, 10, 47, 19);
		contentPane.add(button_2);
		
		t1 = new JTextField();
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setBackground(new Color(255, 255, 255));
		t1.setEditable(false);
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBounds(232, 126, 232, 22);
		contentPane.add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBorder(new EmptyBorder(0, 0, 0, 0));
		t2.setBackground(new Color(255, 255, 255));
		t2.setEditable(false);
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setColumns(10);
		t2.setBounds(232, 193, 232, 22);
		contentPane.add(t2);
		
		t3 = new JTextField();
		t3.setBorder(new EmptyBorder(0, 0, 0, 0));
		t3.setBackground(new Color(255, 255, 255));
		t3.setEditable(false);
		t3.setFont(new Font("Tahoma", Font.BOLD, 15));
		t3.setColumns(10);
		t3.setBounds(232, 273, 232, 22);
		contentPane.add(t3);
		
		t4 = new JTextField();
		t4.setBorder(new EmptyBorder(0, 0, 0, 0));
		t4.setBackground(new Color(255, 255, 255));
		t4.setEditable(false);
		t4.setFont(new Font("Tahoma", Font.BOLD, 15));
		t4.setColumns(10);
		t4.setBounds(232, 334, 232, 22);
		contentPane.add(t4);
		
		t5 = new JTextField();
		t5.setBorder(new EmptyBorder(0, 0, 0, 0));
		t5.setBackground(new Color(255, 255, 255));
		t5.setEditable(false);
		t5.setFont(new Font("Tahoma", Font.BOLD, 15));
		t5.setColumns(10);
		t5.setBounds(232, 404, 232, 22);
		contentPane.add(t5);
		
		t6 = new JTextField();
		t6.setBorder(new EmptyBorder(0, 0, 0, 0));
		t6.setBackground(new Color(255, 255, 255));
		t6.setEditable(false);
		t6.setFont(new Font("Tahoma", Font.BOLD, 15));
		t6.setColumns(10);
		t6.setBounds(205, 471, 426, 22);
		contentPane.add(t6);
		
		JPanel panel1 = new JPanel();
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
	}
}
