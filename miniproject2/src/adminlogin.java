import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.sun.speech.freetts.Voice;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;

public class adminlogin extends JFrame {

	private JPanel contentPane;
	public static JTextField t1;
	public static  JPasswordField t2;
		/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
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
	
	
	public adminlogin() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 892, 525);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new CompoundBorder());
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setResizable(false);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 437, 525);
		contentPane.add(panel);
		panel.setLayout(null);
	
		
		JTextArea txtrtheFutureBelongs = new JTextArea();
		txtrtheFutureBelongs.setBackground(new Color(30, 144, 255));
		txtrtheFutureBelongs.setFont(new Font("Calibri", Font.BOLD, 27));
		txtrtheFutureBelongs.setForeground(new Color(0, 0, 0));
		txtrtheFutureBelongs.setText("\"In recruiting, there are no\r\n good or bad experiences-just \r\n learning experiences!!\"");
		txtrtheFutureBelongs.setBounds(20, 199, 417, 231);
		txtrtheFutureBelongs.setEditable(false);
	
		panel.add(txtrtheFutureBelongs);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(245, 245, 220));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(488, 93, 134, 24);
		contentPane.add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setForeground(new Color(255, 255, 255));
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		t1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t1.setBackground(new Color(105, 105, 105));
		t1.setBounds(488, 127, 320, 24);
		t1.setBorder(null);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(488, 162, 320, 2);
		contentPane.add(separator);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(488, 227, 134, 24);
		contentPane.add(lblPassword);
		
		t2 = new JPasswordField();
		t2.setForeground(new Color(245, 255, 250));
		t2.setBackground(new Color(105, 105, 105));
		t2.setBounds(488, 274, 320, 19);
		t2.setBorder(null);
		contentPane.add(t2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(488, 303, 320, 9);
		contentPane.add(separator_1);
		JButton btnNewButton = new JButton("Sign In");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String user = t1.getText();
		        String pass = String.valueOf(t2.getPassword());
		       
                String query="select * from registerr where username='"+user+"' and password='"+pass+"'";
		        ResultSet rs;
		    
		        // get the username & password
		        
		        
		        //create a select query to check if the username and the password exist in the database
		        Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
					   
	                Statement st = conn.createStatement();
	           

	            rs = st.executeQuery(query);
	            
if(rs.next())
{
	            	 new admindash().setVisible(true);
	            //	 String args=Voice.DEFAULT_AUDIO_PLAYER;
	            //	 voicespeech.main(args);
	            	
	            	
	            	// show a new form
	             // JOptionPane.showMessageDialog(null,"Login Successful");
	              // close the current form(login form)
	             
	       
	          dispose();
	          
	          
	       
	                
	               // adminjdjd.lname.setText("");
	            }  
	            
	                
	            else{
	                // error message
	                JOptionPane.showMessageDialog(null, "Invalid Username / Password");
	                t2.setText("");
	               
	            }
				} catch (Exception  e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			
			}
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(240, 255, 240));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setBounds(488, 376, 164, 57);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("New here? Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		new adminregister().setVisible(true);
		dispose();
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1.setBounds(689, 387, 207, 36);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(105, 105, 105));
		btnNewButton_1.setBorder(null);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		btnNewButton_2.setBackground(new Color(105, 105, 105));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 45));
		btnNewButton_2.setBounds(775, 0, 47, 19);
		btnNewButton_2.setBorder(null);
		contentPane.add(btnNewButton_2);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnX.setBorder(null);
		btnX.setBackground(SystemColor.controlDkShadow);
		btnX.setBounds(832, 0, 47, 19);
		contentPane.add(btnX);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new enteremail().setVisible(true);
				dispose();
			}
		});
		btnForgotPassword.setForeground(Color.WHITE);
		btnForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(SystemColor.controlDkShadow);
		btnForgotPassword.setBounds(675, 317, 207, 36);
		contentPane.add(btnForgotPassword);
		
		JCheckBox c1 = new JCheckBox("Show Password");
		c1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c1.isSelected())
				{
					t2.setEchoChar((char)0);
				}
				else
				{
					t2.setEchoChar('*');
				}
			}
		});
		c1.setBackground(Color.WHITE);
		c1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		c1.setBounds(488, 318, 123, 21);
		contentPane.add(c1);

	
	}
}

