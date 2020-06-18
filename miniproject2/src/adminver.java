import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminver extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminver frame = new adminver();
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
	public adminver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 530);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setUndecorated(true);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 76, 531, 342);
		contentPane.add(lblNewLabel);
		//Image img=new ImageIcon(this.getClass().getResource("tick.png")).getImage();
		//lemail1.setIcon(new ImageIcon(img));
		ImageIcon img=new ImageIcon(adminver.this.getClass().getResource("tick1.gif"));
		lblNewLabel.setIcon((Icon) img);
		
		JLabel lblNewLabel_1 = new JLabel("Your account has been verified!");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 427, 343, 32);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new adminlogin().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(514, 428, 153, 43);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
		//ImageIcon imageIcon =
		  //        new ImageIcon(Test.this.getClass().getResource("starzoom-thumb.gif"));
	}
}
