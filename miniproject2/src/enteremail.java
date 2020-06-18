import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class enteremail extends JFrame {

	private JPanel contentPane;
	public static JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enteremail frame = new enteremail();
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
	public enteremail() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 303);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setUndecorated(true);
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 446, 293);
		contentPane.add(panel);
		
		t1 = new JTextField();
		t1.setForeground(Color.WHITE);
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setColumns(10);
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setBackground(Color.BLACK);
		t1.setBounds(61, 117, 344, 33);
		panel.add(t1);
		
		JButton btnSendVerificationCode = new JButton("Send Verification Code");
		btnSendVerificationCode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mailpass.main(null);
				new verifypass().setVisible(true);
				dispose();
			}
		});
		btnSendVerificationCode.setForeground(Color.WHITE);
		btnSendVerificationCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSendVerificationCode.setBorder(null);
		btnSendVerificationCode.setBackground(new Color(25, 25, 112));
		btnSendVerificationCode.setBounds(128, 191, 197, 33);
		panel.add(btnSendVerificationCode);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(61, 160, 344, 2);
		panel.add(separator);
		
		JLabel lblenterYourReistered = new JLabel("*Enter your registered email id");
		lblenterYourReistered.setForeground(Color.WHITE);
		lblenterYourReistered.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblenterYourReistered.setBounds(61, 39, 318, 17);
		panel.add(lblenterYourReistered);
		
		JLabel l1 = new JLabel("New label");
		l1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new adminlogin().setVisible(true);
				dispose();
			}
		});
		l1.setBounds(10, 0, 37, 24);

ImageIcon img=new ImageIcon(new ImageIcon("D:/backw.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
		l1.setIcon(img);
		panel.add(l1);
	}
}
