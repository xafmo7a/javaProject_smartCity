package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import Collections.AccountCollection;
import account.Account;
import program.MainClass;
import user.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginn extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		loginn frame = new loginn();
		
		frame.setVisible(true);
		
		frame.setResizable(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel user_name = new JLabel("Username");
		user_name.setBounds(45, 45, 65, 13);
		contentPane.add(user_name);
		
		JLabel pass = new JLabel("Password");
		pass.setBounds(45, 81, 65, 13);
		contentPane.add(pass);
		
		textField = new JTextField();
		textField.setBounds(156, 42, 150, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		final JPasswordField passwordtxt= new JPasswordField();
		passwordtxt.setBounds(156, 78, 150, 19);
		contentPane.add(passwordtxt);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usern = textField.getText();
				@SuppressWarnings("deprecation")
				String passw = passwordtxt.getText();
				
					if (MainClass.accounts.logIn(usern, passw)){
						 icons icon = new icons();
						ImageIcon i = icon.success;
						JOptionPane.showMessageDialog(loginn.this, "Login success","Customized Dialog", JOptionPane.INFORMATION_MESSAGE, i);
					}else {
						JOptionPane.showMessageDialog(loginn.this, "this usrname : "+usern+" or the password is incorrect","Failure",JOptionPane.ERROR_MESSAGE);
						return;
					}
						if (AccountCollection.currentacc.isAdmin()){
							gotoAdmin();
						}else {
							gotoRes();
						}	
					}
				
			
		});
		btnNewButton.setBounds(188, 121, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				registration r = new registration();
				r.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(188, 210, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnNewButton_2.setBounds(341, 232, 85, 21);
		contentPane.add(btnNewButton_2);
		
		JLabel lblDontHaveAnd = new JLabel("Don't have and account yet?");
		lblDontHaveAnd.setBounds(10, 213, 146, 14);
		contentPane.add(lblDontHaveAnd);
	}
	public void gotoAdmin(){
		AdmiinInter ad = new AdmiinInter();
		ad.setVisible(true);
		dispose();
	}
	public void gotoRes(){
		RES r = new RES();
		r.setVisible(true);
		dispose();
	}
}
