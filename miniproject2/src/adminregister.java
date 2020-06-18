
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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
public class adminregister extends JFrame {
private ImageIcon img;
	/**
	 * 
	 */
	private JComboBox cyear;
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	public static JTextField txtName;
	public static JTextField t3;
	public static JTextField t4;
	public static JPasswordField t6;
	public static JLabel lemail1;
	public static JCheckBox cmale;
	public static JCheckBox cfemale;
	public static String gend;
	public static String v;
	String filename=null;
	int s=0;
	byte[] person_image=null;
	/**
	 * Launch the application.
	 */
	public static String image_path=null;	
	private JPasswordField t5;
	private JTextField t2;
	private JLabel ll;
	private byte[] person;
public ImageIcon ResizeImage(String imagepath, byte[] pic)
{
	ImageIcon myimg=null;
	if(imagepath!=null)
	{
		myimg=new ImageIcon(imagepath);
	}else
	{
		myimg=new ImageIcon(pic);
	}
	Image img=myimg.getImage();
	Image newimg=img.getScaledInstance(ll.getWidth(), ll.getHeight(), Image.SCALE_SMOOTH);
	ImageIcon image=new ImageIcon(newimg);
	return myimg;
}
	
	
	
public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `registerr` WHERE `username` = ?";
        
        try {
            
        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
            st = conn.prepareStatement(query);
            st.setString(1, t4.getText());
            rs = st.executeQuery();
        
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null, "This Username is Already Taken, Choose Another One", "Username Failed", 2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(adminregister.class.getName()).log(Level.SEVERE, null, ex);
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
    if(name1.trim().equals("")  || name1.trim().equals("Name")||emailid.trim().equals("")||user.trim().equals("") || pass.trim().equals("")
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
   // else if(lemail1.getIcon()==null)
  //  {
   // 	 JOptionPane.showMessageDialog(null, "Verify your email before proceeding for for sign up");
    //	 return false;
    //}
    // if everything is ok
    else{
        return true;
    }
}


	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminregister frame = new adminregister();
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
	
	public adminregister() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 900, 790);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		contentPane.setLayout(null);
	
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		
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
		
		JLabel ll = new JLabel("");
		ll.setBounds(10, 55, 158, 174);
		panel.add(ll);
		
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
		txtName.setForeground(Color.WHITE);
		txtName.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtName.setColumns(10);
		txtName.setBorder(null);
		txtName.setBackground(SystemColor.controlDkShadow);
		txtName.setBounds(500, 44, 320, 13);
		contentPane.add(txtName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(500, 69, 320, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
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
		t3.setForeground(Color.WHITE);
		t3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t3.setColumns(10);
		t3.setBorder(null);
		t3.setBackground(SystemColor.controlDkShadow);
		t3.setBounds(500, 218, 320, 24);
		contentPane.add(t3);
		
		JSeparator separator_2 = new JSeparator();
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
		t4.setForeground(Color.WHITE);
		t4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t4.setColumns(10);
		t4.setBorder(null);
		t4.setBackground(SystemColor.controlDkShadow);
		t4.setBounds(500, 327, 320, 24);
		contentPane.add(t4);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(500, 361, 320, 2);
		contentPane.add(separator_3);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(245, 245, 220));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(498, 467, 134, 24);
		contentPane.add(lblPassword);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(500, 530, 320, 2);
		contentPane.add(separator_4);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(new Color(245, 245, 220));
		lblConfirmPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblConfirmPassword.setBounds(500, 608, 134, 24);
		contentPane.add(lblConfirmPassword);
		
		t6 = new JPasswordField();
		t6.setForeground(new Color(245, 255, 250));
		t6.setBorder(null);
		t6.setBackground(SystemColor.controlDkShadow);
		t6.setBounds(500, 632, 320, 19);
		contentPane.add(t6);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(500, 661, 320, 2);
		contentPane.add(separator_5);
		
		
		JLabel limage = new JLabel("");
		limage.setBounds(657, 79, 163, 24);
		contentPane.add(limage);
		
		JLabel lemail1 = new JLabel("");
		lemail1.setBounds(818, 207, 57, 35);
		contentPane.add(lemail1);
		
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				boolean status=EmailValidator.email_validation(t3.getText());
				if(status)
				{
					//Image img=new ImageIcon(this.getClass().getResource("tick.jpg")).getImage();
				//	lemail1.setIcon(new ImageIcon(img));
					ImageIcon img=new ImageIcon(new ImageIcon("D:/success.png").getImage().getScaledInstance(lemail1.getWidth(), lemail1.getHeight(), Image.SCALE_SMOOTH));
					lemail1.setIcon(img);
					//JLabel lblNewLabel = new JLabel("");
					//Image img=new ImageIcon(this.getClass().getResource("homescreen.jpeg")).getImage();
					//lblNewLabel.setIcon(new ImageIcon(img));
				}
				else
				{
					lemail1.setText("X");
					lemail1.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(500, 264, 85, 21);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		
		//panel_1.setLayout(null);
		//panel_1.setBorder(null);
		//panel_1.setBackground(new Color(100, 149, 237));
		//panel_1.setBounds(792, 515, 164, 57);
		JButton Sign = new JButton("Sign Up");
		Sign.setForeground(new Color(230, 230, 250));
		Sign.setBorder(null);
		Sign.setBackground(new Color(30, 144, 255));
		Sign.setFont(new Font("Tahoma", Font.BOLD, 16));
		Sign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				 if(verifyFields())
			        {
			            if(!checkUsername(t4.getText()))
			            {
			            	
			             PreparedStatement ps;
			           String query = "insert into registerr(name, contact, email, username,password,confirmpass,picture,gender) VALUES (?,?,?,?,?,?,?,?);";
			        
			        try {
			        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","root");
			            ps = conn.prepareStatement(query);
			            
			            ps.setString(1, txtName.getText());
			           
			            ps.setString(2, t2.getText());
			            ps.setString(3, t3.getText());
			            ps.setString(4, t4.getText());
			            ps.setString(5, String.valueOf(t5.getPassword()));
			            ps.setString(6, String.valueOf(t6.getPassword()));
			           
			          //  byte[] person = null;
						//ps.setBytes(7, person);
						  ps.setBytes(7, person_image);
			      //      String oo=limage.getText();
			        //    oo=oo.replace("\\", "\\\\");
			         //   if(image_path!=null)
			         //   {
			      //     InputStream image=new FileInputStream(new File(image_path));
			       //     ps.setBlob(7, image);
			            
			            //ps.setString(7, oo);
			         //   ps.setNull(7, java.sql.Types.NULL);
			      //      }
			 	   
			         ps.setString(8, gend);
			         
			            if(ps.executeUpdate() > 0)
			            {
			        //  JOptionPane.showMessageDialog(null, "Your Account Has Been Created"+" "+txtName.getText());
			            	adminmail.main(null);
			          new adminframe2().setVisible(true);
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
		lblGender.setForeground(new Color(245, 245, 220));
		lblGender.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblGender.setBounds(500, 392, 69, 24);
		contentPane.add(lblGender);
		JRadioButton rmale = new JRadioButton("Male");
		rmale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rmale.setForeground(Color.WHITE);
		rmale.setBackground(new Color(105, 105, 105));
		JRadioButton rfemale = new JRadioButton("Female");
		rfemale.setForeground(Color.WHITE);
		rfemale.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		rfemale.setBackground(new Color(105, 105, 105));
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
			
			}});
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
		t5.setBackground(SystemColor.controlDkShadow);
		t5.setBounds(498, 501, 320, 19);
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
		t2.setForeground(Color.WHITE);
		t2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		t2.setColumns(10);
		t2.setBorder(null);
		t2.setBackground(SystemColor.controlDkShadow);
		t2.setBounds(500, 139, 320, 24);
		contentPane.add(t2);
		
		JButton btnNewButton_3 = new JButton("Already a member? Sign In..");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminlogin().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNewButton_3.setBounds(657, 698, 214, 24);
		btnNewButton_3.setBackground(new Color(105, 105, 105));
		btnNewButton_3.setBorder(null);
		contentPane.add(btnNewButton_3);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(JFrame.ICONIFIED);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 45));
		button.setBorder(null);
		button.setBackground(SystemColor.controlDkShadow);
		button.setBounds(782, 0, 47, 19);
		contentPane.add(button);
		
		
		JLabel l1 = new JLabel("");
		l1.setForeground(Color.WHITE);
		l1.setBounds(587, 90, 242, 13);
		contentPane.add(l1);
		
		JButton button_1 = new JButton("X");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		button_1.setBorder(null);
		button_1.setBackground(SystemColor.controlDkShadow);
		button_1.setBounds(839, 0, 47, 19);
		contentPane.add(button_1);
		
		JButton btnNewButton_1 = new JButton("Choose Image");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser ch=new JFileChooser();
				ch.showOpenDialog(null);
				File f=ch.getSelectedFile();
				filename=f.getAbsolutePath();
				l1.setText(filename);
				
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
		btnNewButton_1.setBounds(498, 82, 85, 21);
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
		
		
		
		
		}	
}
	
		
		
		

		
		
		
	
