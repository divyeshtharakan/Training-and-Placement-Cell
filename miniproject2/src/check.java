import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class check extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					check frame = new check();
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
	public check() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel l1 = new JLabel("");
		l1.setBounds(0, 0, 1535, 861);
		ImageIcon img=new ImageIcon(new ImageIcon("D:/tt.jpg").getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH));
		l1.setIcon(img);
		contentPane.add(l1);
		setUndecorated(true);
		
		//textArea.setFont(new Font("Calibri", Font.BOLD, 29));
		JLabel l=new JLabel("Training and");
		l.setFont(new Font("Calibri", Font.BOLD, 67));
		l.setBounds(1070, 99, 533, 85);
		l1.add(l);
		
		JLabel le=new JLabel("Placement Cell");
		le.setFont(new Font("Calibri", Font.BOLD, 67));
		le.setBounds(1050, 180, 533, 85);
		l1.add(le);
		//"\"The future belongs to \r\n those who believe in\r\n the beauty of their dreams.\""
		JLabel lw=new JLabel("\"Wisdom......comes not from age, \r\n but from education and learning.\"");
		lw.setFont(new Font("Calibri", Font.BOLD, 20));
		lw.setForeground(Color.BLUE);
		lw.setBounds(900, 250, 633, 95);
		l1.add(lw);
		
		JButton btnNewButton_1=new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new choose().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setBackground(Color.BLACK);
	//	btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(1098, 400, 133, 25);
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
	}
}
