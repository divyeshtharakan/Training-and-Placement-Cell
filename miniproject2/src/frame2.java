import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame2 frame = new frame2();
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
	public frame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 511);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, -7, 588, 396);
		ImageIcon img=new ImageIcon(frame2.this.getClass().getResource("email.gif"));
		lblNewLabel.setIcon((Icon) img);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A code has been sent to your registered email id. \r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(10, 399, 590, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblPleaseVerifyAnd = new JLabel("Please verify and confirm your identity!");
		lblPleaseVerifyAnd.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseVerifyAnd.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPleaseVerifyAnd.setBounds(-21, 425, 658, 36);
		contentPane.add(lblPleaseVerifyAnd);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 new veritfy().setVisible(true);
				 dispose();
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(538, 429, 85, 33);
		btnNewButton.setBorder(null);
		contentPane.add(btnNewButton);
	}
}
