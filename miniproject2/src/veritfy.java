import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSeparator;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class veritfy extends JFrame {

	private JPanel contentPane;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					veritfy frame = new veritfy();
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
	public veritfy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 467, 317);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		
		t1 = new JTextField();
		t1.setText("Verify Code");
		t1.setBorder(new EmptyBorder(0, 0, 0, 0));
		t1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(!Character.isDigit(e.getKeyChar()) ||t1.getText().length()>4){
					 getToolkit().beep();
			           e.consume();
				 }
			}
		});
		t1.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(t1.getText().trim().equals("Verify Code"))
				{
					t1.setText(null);
					
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(t1.getText().trim().equals(null))
				{
					t1.setText("Verify Code");
				}
			}
		});
		t1.setFont(new Font("Tahoma", Font.BOLD, 15));
		t1.setForeground(Color.WHITE);
		t1.setBackground(Color.BLACK);
		t1.setBounds(61, 117, 344, 33);
		contentPane.add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Verify");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 0, 205));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int d=Integer.parseInt(t1.getText());
	if(mail1.r1==d)
	{
		new ver().setVisible(true);
		
		dispose();
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Error");
	}
			}
		});
		btnNewButton.setBounds(165, 201, 126, 33);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLUE);
		separator.setBounds(61, 160, 344, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("Code");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(61, 39, 116, 19);
		contentPane.add(lblNewLabel);
	}
}
