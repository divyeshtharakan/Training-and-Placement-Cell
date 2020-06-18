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

import com.sun.prism.Graphics;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class studentdashboard extends JFrame {

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
					studentdashboard frame = new studentdashboard();
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

	
	public studentdashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 866, 606);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(new Color(65, 105, 225));
		panel.setBounds(0, 0, 401, 605);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\"The future belongs to \r\n those who believe in\r\n the beauty of their dreams.\"");
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Calibri", Font.BOLD, 29));
		textArea.setEditable(false);
		textArea.setBackground(new Color(65, 105, 225));
		textArea.setBounds(10, 235, 370, 231);
		panel.add(textArea);
	
		Image img=new ImageIcon(this.getClass().getResource("loginnew1.gif")).getImage();
		
		

		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(431, 150, 134, 24);
		contentPane.add(lblNewLabel_1);
	
		t1 = new JTextField();
		t1.setForeground(new Color(0, 0, 0));
		t1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		t1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t1.setBackground(new Color(192, 192, 192));
		t1.setBounds(431, 189, 320, 24);
		t1.setBorder(null);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(431, 223, 320, 2);
		contentPane.add(separator);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setBounds(431, 303, 134, 24);
		contentPane.add(lblPassword);
		
		t2 = new JPasswordField();
		t2.setForeground(new Color(0, 0, 0));
		t2.setBackground(new Color(192, 192, 192));
		t2.setBounds(431, 341, 320, 19);
		t2.setBorder(null);
		contentPane.add(t2);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(431, 370, 320, 9);
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
		       
                String query="select * from register where username='"+user+"' and password='"+pass+"'";
		        ResultSet rs;
		    
		        // get the username & password
		        
		        
		        //create a select query to check if the username and the password exist in the database
		        Connection conn;
				try {
					conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
					   
	                Statement st = conn.createStatement();
	           

	            rs = st.executeQuery(query);
	            
	       
	            if(rs.next())
	            {
	                // show a new form
	             
	              // close the current form(login form)
	            
	          
	          
	             new studentdashboard1().setVisible(true);
	          
	       dispose();
	                
	               // adminjdjd.lname.setText("");
	            }  
	            
	                
	            else{
	                // error message
	                JOptionPane.showMessageDialog(null, "Invalid Username / Password");
	                t2.setText("");
	               
	            }
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
			}
			
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton.setForeground(new Color(240, 255, 240));
		btnNewButton.setBackground(new Color(100, 149, 237));
		btnNewButton.setBounds(425, 472, 164, 57);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("New here? Sign Up");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentregister().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_1.setBounds(638, 483, 207, 36);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setBorder(null);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(new Color(0, 0, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(new Color(192, 192, 192));
		button.setBounds(751, 0, 47, 19);
		contentPane.add(button);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(new Color(0, 0, 0));
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBorder(null);
		button_1.setBackground(new Color(192, 192, 192));
		button_1.setBounds(808, 0, 47, 19);
		contentPane.add(button_1);
		
		JCheckBox checkBox = new JCheckBox("Show Password");
		checkBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkBox.isSelected())
				{
					t2.setEchoChar((char)0);
				}
				else
				{
					t2.setEchoChar('*');
				}
			}
		});
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		checkBox.setBackground(new Color(112, 128, 144));
		checkBox.setBounds(431, 385, 123, 21);
		contentPane.add(checkBox);
		
		JButton btnForgotPassword = new JButton("Forgot Password?");
		btnForgotPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new enteremail1().setVisible(true);
				dispose();
			}
		});
		btnForgotPassword.setForeground(Color.BLACK);
		btnForgotPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnForgotPassword.setBorder(null);
		btnForgotPassword.setBackground(Color.LIGHT_GRAY);
		btnForgotPassword.setBounds(638, 378, 164, 36);
		contentPane.add(btnForgotPassword);
		

	
	}
}

