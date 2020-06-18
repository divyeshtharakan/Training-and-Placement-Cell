import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class passcorrect1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passcorrect1 frame = new passcorrect1();
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
	public passcorrect1() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 371);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel back;
		ImageIcon img=new ImageIcon("D:/success.png");
		back=new JLabel("",img,JLabel.CENTER);
		back.setBackground(Color.BLACK);
		back.setBounds(176,10,186,165);
		getContentPane().add(back);
		
		JLabel lblNewLabel = new JLabel("Password reset successfully!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(32, 212, 489, 30);
		contentPane.add(lblNewLabel);
		
		JButton btnReturnToLogin = new JButton("Return to Login");
		btnReturnToLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new studentdashboard().setVisible(true);
				dispose();
			}
		});
		btnReturnToLogin.setForeground(Color.BLACK);
		btnReturnToLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReturnToLogin.setBorder(null);
		btnReturnToLogin.setBackground(Color.GREEN);
		btnReturnToLogin.setBounds(176, 314, 204, 33);
		contentPane.add(btnReturnToLogin);
		
	}

}
