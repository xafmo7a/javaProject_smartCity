package GUI;
import user.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;

import account.Account;
import program.MainClass;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private final JButton btnNewButton_1 = new JButton("Exit");
	private JTextField textField_5;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
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
	public registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(167, 0, 173, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(39, 58, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(205, 58, 45, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setBounds(39, 93, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone number");
		lblNewLabel_4.setBounds(205, 93, 82, 13);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Age");
		lblNewLabel_5.setBounds(39, 136, 45, 13);
		contentPane.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(94, 54, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(283, 53, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(94, 89, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(283, 89, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(94, 132, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(283, 132, 96, 19);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Profession");
		lblNewLabel_7.setBounds(205, 136, 82, 13);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nm = textField.getText();
				String ids = textField_1.getText();
				String mail = textField_2.getText();
				long pn = Long.parseLong(textField_3.getText());
				int age = Integer.parseInt(textField_4.getText());
				String pro = textField_6.getText();
				String us_name = textField_5.getText();
				String Pass = textField_7.getText();
				Account acc = new Account (us_name , Pass);
				Resident res = new Resident(ids , nm ,mail , pn ,age ,pro);
				
				for(Account acc1: MainClass.accounts.accounts){
					
					if(res.equals(acc1.getUser())){
						// entering this if statement means that an account already exists for that specific user
						// display error message
						JOptionPane.showMessageDialog(registration.this, "An account already exists for user with ID "+res.getID(),"Failure",JOptionPane.ERROR_MESSAGE);
						return;
					}
				}
				acc.setUser(res);
				MainClass.accounts.addAccount(acc);
				 ImageIcon icon = new ImageIcon("C:/Users/hache/OneDrive/Documents/Wondershare/success-24.png");
				 Image image =icon.getImage();
				 Image newim=image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
				 icon = new ImageIcon(newim);
				JOptionPane.showMessageDialog(registration.this, "Account succesfully created for the  ID "+res.getID(),"Customized Dialog", JOptionPane.INFORMATION_MESSAGE, icon);
				// display success message
				// open new frame for logged in account. Either that or go back to login screen.
				
			}
		});
		btnNewButton.setBounds(273, 227, 85, 21);
		contentPane.add(btnNewButton);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		});
		btnNewButton_1.setBounds(366, 228, 60, 19);
		contentPane.add(btnNewButton_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(94, 175, 96, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(283, 175, 96, 20);
		contentPane.add(textField_7);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(27, 178, 57, 14);
		contentPane.add(lblUsername);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setBounds(205, 178, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnReturn = new JButton("Return");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gotologin();
			}
		});
		btnReturn.setBounds(10, 226, 89, 23);
		contentPane.add(btnReturn);
	}
	private void gotologin(){
		loginn l = new loginn();
		l.setVisible(true);
		
		dispose();
	}
}
