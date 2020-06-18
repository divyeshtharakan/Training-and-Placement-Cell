import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class verifypass extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verifypass frame = new verifypass();
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
	public verifypass() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 367);
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
		panel.setBounds(10, 10, 467, 317);
		contentPane.add(panel);
		
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		t1 = new JTextField();
		t1.setForeground(Color.WHITE);
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setColumns(10);
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.setBackground(Color.BLACK);
		t1.setBounds(61, 117, 344, 33);
		panel.add(t1);
		
		JButton button = new JButton("Verify");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d=Integer.parseInt(t1.getText());
				if(mailpass.r2==d)
				{
					new reset().setVisible(true);
					
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Error");
				}
						}
				
			
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBorder(null);
		button.setBackground(new Color(0, 0, 205));
		button.setBounds(165, 201, 126, 33);
		panel.add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(61, 160, 344, 2);
		panel.add(separator);
		
		JLabel label = new JLabel("Code");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(61, 39, 116, 19);
		panel.add(label);
	}

}
