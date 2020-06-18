import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class reset extends JFrame {

	private JPanel contentPane;
	private JTextField t1;
	private JPasswordField t2;
	private JPasswordField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reset frame = new reset();
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
	public boolean verifyFields()
	{
	      String pass = String.valueOf(t2.getPassword());
	    String re_pass = String.valueOf(t3.getPassword());
	    
	   
	    
	    // check if the two password are equals or not
	   if(!pass.equals(re_pass))
	    {
	       JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
	       return false;
	    }
	  
	    else
	   
	    // if everything is ok
	    return true;
	}
	
	
	public reset() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setUndecorated(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 508, 491);
		contentPane.add(panel);
		
		JButton btnSet = new JButton("Set");
		btnSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(verifyFields())
				{
				PreparedStatement ps;
			    String query = "update registerr set password='"+String.valueOf(t2.getPassword())+"',confirmpass='"+String.valueOf(t3.getPassword())+"' where username='"+t1.getText()+"'";
			     
			     try {
			     	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			         ps = conn.prepareStatement(query);
			     ps.executeUpdate();
			     new passcorrect().setVisible(true);
			     dispose();
					
				}catch(Exception e1)
			     {
						e1.printStackTrace();
			     }
				
			}}
		});
		btnSet.setForeground(Color.WHITE);
		btnSet.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSet.setBorder(null);
		btnSet.setBackground(new Color(0, 0, 205));
		btnSet.setBounds(172, 411, 126, 33);
		panel.add(btnSet);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(61, 170, 344, 2);
		panel.add(separator);
		
		JLabel lblPasswordReset = new JLabel("Password Reset");
		lblPasswordReset.setForeground(Color.WHITE);
		lblPasswordReset.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblPasswordReset.setBounds(61, 24, 289, 25);
		panel.add(lblPasswordReset);
		
		JLabel lblenterUsername = new JLabel("*Enter username");
		lblenterUsername.setForeground(Color.WHITE);
		lblenterUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblenterUsername.setBounds(61, 107, 146, 19);
		panel.add(lblenterUsername);
		
		t1 = new JTextField();
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setBackground(new Color(0, 0, 0));
		t1.setBounds(61, 141, 344, 25);
		panel.add(t1);
		t1.setColumns(10);
		
		JLabel lblnewPassword = new JLabel("*New Password");
		lblnewPassword.setForeground(Color.WHITE);
		lblnewPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblnewPassword.setBounds(61, 204, 146, 19);
		panel.add(lblnewPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLUE);
		separator_1.setBounds(61, 272, 344, 2);
		panel.add(separator_1);
		
		t2 = new JPasswordField();
		t2.setBorder(new EmptyBorder(0, 0, 0, 0));
		t2.setBackground(Color.BLACK);
		t2.setFont(new Font("Tahoma", Font.BOLD, 15));
		t2.setBounds(61, 233, 344, 29);
		panel.add(t2);
		
		JLabel lblconfirmPassword = new JLabel("*Confirm Password");
		lblconfirmPassword.setForeground(Color.WHITE);
		lblconfirmPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblconfirmPassword.setBounds(61, 306, 146, 19);
		panel.add(lblconfirmPassword);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(Color.BLUE);
		separator_2.setBounds(61, 374, 344, 2);
		panel.add(separator_2);
		
		t3 = new JPasswordField();
		t3.setBorder(new EmptyBorder(0, 0, 0, 0));
		t3.setFont(new Font("Tahoma", Font.BOLD, 15));
		t3.setBackground(Color.BLACK);
		t3.setBounds(61, 335, 344, 29);
		panel.add(t3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setBounds(61, 59, 244, 8);
		btnNewButton.setBorder(null);
		panel.add(btnNewButton);
	}
}
