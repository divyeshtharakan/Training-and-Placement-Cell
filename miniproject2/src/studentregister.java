
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class studentregister extends JFrame {

	/**
	 * 
	 */
	private JComboBox cyear;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JTextField txtName;
	public static JTextField t3;
	private JTextField t4;
	
	private JPasswordField t6;
	private JLabel lemail1;
	private JRadioButton rmale;
	private JRadioButton rfemale;
	private String gend;
	private String v;
	public static JLabel limage;
	/**
	 * Launch the application.
	 */
	public static String image_path=null;	
	private JPasswordField t5;
	private JTextField t2;
	 public static String path;
		String filename=null;
		int s=0;
		byte[] person_image=null;
	
public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `register` WHERE `username` = ?";
        
        try {
            
        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            st = conn.prepareStatement(query);
            st.setString(1, t4.getText());
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(studentregister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
    }


public boolean verifyFields()
{

    String name1=txtName.getText();
    
    String emailid=t3.getText();
     String user=t4.getText();
      String pass = String.valueOf(t5.getPassword());
    String re_pass = String.valueOf(t6.getPassword());
    
    // check empty fields
    if(name1.trim().equals("")  || name1.trim().equals("Name")||emailid.trim().equals("")||emailid.trim().equals("Email Id")||user.trim().equals("") ||user.trim().equals("Username") || pass.trim().equals("")
       || re_pass.trim().equals(""))
    {
        JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty","Empty Fields",2);
        return false;
    }
    
    // check if the two password are equals or not
    else if(!pass.equals(re_pass))
    {
       JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2); 
       return false;
    }
  
    else
   
    // if everything is ok
    return true;
}


	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregister frame = new studentregister();
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
	
	public studentregister() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 900, 790);
		setUndecorated(true);
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
	
		
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(65, 105, 225));
		panel.setBorder(UIManager.getBorder("DesktopIcon.border"));
		panel.setBounds(0, 0, 488, 790);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Signn");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(500, 752, 164, 57);
		panel.add(btnNewButton_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\"Now let's talk \r\nabout your placement..\"");
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Calibri", Font.BOLD, 29));
		textArea.setEditable(false);
		textArea.setBackground(new Color(65, 105, 225));
		textArea.setBounds(50, 301, 370, 231);
		panel.add(textArea);
		
		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtName.getText().trim().equals("Name"))
				{
					txtName.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtName.getText().trim().equals(""))
				{
					txtName.setText("Name");
				}
			}
		});
		txtName.setText("Name");
		txtName.setForeground(new Color(0, 0, 0));
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBackground(new Color(192, 192, 192));
		txtName.setBounds(500, 44, 320, 13);
		contentPane.add(txtName);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(500, 69, 320, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setBounds(500, 170, 320, 2);
		contentPane.add(separator_1);
		
		t3 = new JTextField();
		t3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(t3.getText().trim().equals("Email Id"))
				{
					t3.setText("");
				}
				
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(t2.getText().trim().equals(""))
				{
					t2.setText("Contact No");
				}
			}
		});
		t3.setText("Email Id");
		t3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				
				
			}
		});
		t3.setForeground(new Color(0, 0, 0));
		t3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t3.setColumns(10);
		t3.setBorder(null);
		t3.setBackground(new Color(192, 192, 192));
		t3.setBounds(500, 218, 320, 24);
		contentPane.add(t3);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(500, 252, 320, 2);
		contentPane.add(separator_2);
		
		t4 = new JTextField();
		t4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(t4.getText().trim().equals(""))
				{
					t4.setText("Username");
				}
				
			}
			@Override
			public void focusGained(FocusEvent e) {
				if(t4.getText().trim().equals("Username"))
				{
					t4.setText("");
				}
			}
		});
		t4.setText("Username");
		t4.setForeground(new Color(0, 0, 0));
		t4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t4.setColumns(10);
		t4.setBorder(null);
		t4.setBackground(new Color(192, 192, 192));
		t4.setBounds(500, 327, 320, 24);
		contentPane.add(t4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 0));
		separator_3.setBounds(500, 361, 320, 2);
		contentPane.add(separator_3);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(500, 521, 134, 24);
		contentPane.add(lblPassword);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBackground(new Color(0, 0, 0));
		separator_4.setBounds(500, 572, 320, 2);
		contentPane.add(separator_4);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(new Color(0, 0, 0));
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblConfirmPassword.setBounds(500, 608, 134, 24);
		contentPane.add(lblConfirmPassword);
		
		t6 = new JPasswordField();
		t6.setForeground(new Color(245, 255, 250));
		t6.setBorder(null);
		t6.setBackground(new Color(192, 192, 192));
		t6.setBounds(500, 632, 320, 19);
		contentPane.add(t6);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(0, 0, 0));
		separator_5.setBounds(500, 661, 320, 2);
		contentPane.add(separator_5);
		
		JLabel lemail1 = new JLabel("");
		lemail1.setBounds(830, 207, 45, 35);
		contentPane.add(lemail1);
		
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				boolean status=EmailValidator.email_validation(t3.getText());
				if(status==true)
				{
					ImageIcon img=new ImageIcon(new ImageIcon("D:/success.png").getImage().getScaledInstance(lemail1.getWidth(), lemail1.getHeight(), Image.SCALE_SMOOTH));
					lemail1.setIcon(img);
					
					//JLabel lblNewLabel = new JLabel("");
					//Image img=new ImageIcon(this.getClass().getResource("homescreen.jpeg")).getImage();
					//lblNewLabel.setIcon(new ImageIcon(img));
				}
				if(status==false)
				{
					lemail1.setText("X");
					lemail1.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(500, 264, 85, 21);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		//panel_1.setLayout(null);
		//panel_1.setBorder(null);
		//panel_1.setBackground(new Color(100, 149, 237));
		//panel_1.setBounds(792, 515, 164, 57);
		JButton Sign = new JButton("Sign Up");
		Sign.setForeground(new Color(230, 230, 250));
		Sign.setBorder(null);
		Sign.setBackground(new Color(0, 206, 209));
		Sign.setFont(new Font("Tahoma", Font.BOLD, 16));
		Sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		

				 if(verifyFields())
			        {
			            if(!checkUsername(t4.getText()))
			            {
			    
			             PreparedStatement ps;
			           String query = "insert into register(name, contact, email, username,password,confirmpass,picture,gender,yearofgrad) VALUES (?,?,?,?,?,?,?,?,?);";
			        
			        try {
			        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			            ps = conn.prepareStatement(query);
			            
			            ps.setString(1, txtName.getText());
			           
			            ps.setString(2, t2.getText());
			            ps.setString(3, t3.getText());
			            ps.setString(4, t4.getText());
			            ps.setString(5, String.valueOf(t5.getPassword()));
			            ps.setString(6, String.valueOf(t6.getPassword()));
			           
			            ps.setBytes(7, person_image);
			          //  if(image_path!=null)
			          //  {
			            
			         //   InputStream image=new FileInputStream(new File(image_path));
			           // ps.setBlob(7, image);
			            //}
			            
			            //ps.setNull(7, java.sql.Types.NULL);
			           
			 	   
			         ps.setString(8, gend);
			         ps.setString(9, v);      
			            if(ps.executeUpdate() > 0)
			            {
			        new frame2().setVisible(true);
			      
			       mail1.main(null);
			         
			        
			       
			        
			            
			           
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
			    }          
		
				
			}
		});
		Sign.setBounds(498, 680, 134, 57);
		contentPane.add(Sign);
		
	
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGender.setBounds(500, 392, 69, 24);
		contentPane.add(lblGender);
		
		JLabel lblYearOfGraduation = new JLabel("Year of graduation:");
		lblYearOfGraduation.setForeground(new Color(0, 0, 0));
		lblYearOfGraduation.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblYearOfGraduation.setBounds(500, 463, 134, 24);
		contentPane.add(lblYearOfGraduation);
		
		JComboBox cyear = new JComboBox();
		cyear.setFont(new Font("Tahoma", Font.BOLD, 13));
		cyear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  v=cyear.getSelectedItem().toString();
			}
		});
		
		cyear.setModel(new DefaultComboBoxModel(new String[] {"2023", "2022", "2021", "2020", "2019"}));
		cyear.setToolTipText("kdkdkd\r\n\\sksks");
		cyear.setBounds(649, 466, 134, 21);
		contentPane.add(cyear);
		JRadioButton rmale = new JRadioButton("Male");
		rmale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rmale.setForeground(new Color(0, 0, 0));
		rmale.setBackground(new Color(192, 192, 192));
		JRadioButton rfemale = new JRadioButton("Female");
		rfemale.setForeground(new Color(0, 0, 0));
		rfemale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rfemale.setBackground(new Color(192, 192, 192));
		rfemale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gend="Female";
				if(rfemale.isSelected()==true)
				{
					rmale.setEnabled(false);
				}
				else
				{
					rmale.setEnabled(true);
				}
			}
		});
		rfemale.setBounds(748, 395, 69, 21);
		contentPane.add(rfemale);
		
	
		rmale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gend="Male";
				if(rmale.isSelected()==true)
				{
			
					rfemale.setEnabled(false);
				}
				else
				{
					rfemale.setEnabled(true);
				}
			}
		});
		rmale.setBounds(628, 395, 78, 21);
		contentPane.add(rmale);
		
		t5 = new JPasswordField();
		t5.setForeground(new Color(245, 255, 250));
		t5.setBorder(null);
		t5.setBackground(new Color(192, 192, 192));
		t5.setBounds(500, 543, 320, 19);
		contentPane.add(t5);
		
		t2 = new JTextField();
		t2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				 if(!Character.isDigit(e.getKeyChar()) ||t2.getText().length()>9){
					 getToolkit().beep();
			           e.consume();
				 }
			}
		});
		t2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(t2.getText().trim().equals("Contact No"))
				{
					t2.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(t2.getText().trim().equals(""))
				{
					t2.setText("Contact No");
				}
			}
		});
		t2.setText("Contact No");
		t2.setForeground(new Color(0, 0, 0));
		t2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t2.setColumns(10);
		t2.setBorder(null);
		t2.setBackground(new Color(192, 192, 192));
		t2.setBounds(500, 139, 320, 24);
		contentPane.add(t2);
		
		JButton btnNewButton_3 = new JButton("Already a member? Sign In..");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentdashboard().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_3.setBounds(657, 698, 214, 24);
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBorder(null);
		contentPane.add(btnNewButton_3);
		
		JLabel lk = new JLabel("");
		lk.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lk.setBounds(649, 81, 243, 21);
		contentPane.add(lk);
		
		JButton btnChooseImage = new JButton("Choose Image");
		btnChooseImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser ch=new JFileChooser();
				ch.showOpenDialog(null);
				File f=ch.getSelectedFile();
				filename=f.getAbsolutePath();
				lk.setText(filename);
				
				try
				{
					File image=new File(filename);
					FileInputStream fis=new FileInputStream(image);
					ByteArrayOutputStream bos=new ByteArrayOutputStream();
					byte[] buf=new byte[1024];
					for(int readNum; (readNum=fis.read(buf))!=-1; )
					{
						bos.write(buf,0,readNum);
					}
					person_image=bos.toByteArray();
					
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnChooseImage.setForeground(Color.WHITE);
		btnChooseImage.setFont(new Font("Tahoma", Font.BOLD, 13));
	btnChooseImage.setBackground(Color.BLACK);
	btnChooseImage.setBorder(null);
		btnChooseImage.setBounds(498, 81, 136, 21);
		contentPane.add(btnChooseImage);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(796, 0, 47, 19);
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
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(853, 0, 47, 19);
		contentPane.add(button_1);
		
		
		
		

	
		
		
	

		
		
		
	}
}
