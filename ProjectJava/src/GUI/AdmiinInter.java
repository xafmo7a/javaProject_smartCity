package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.SwingConstants;

import program.MainClass;
import Building.Building;
import javax.swing.JComboBox;

public class AdmiinInter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdmiinInter frame = new AdmiinInter();
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
	public AdmiinInter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Profile");
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblNewLabel.setBounds(170, 10, 136, 34);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Manage profiles");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBounds(87, 104, 130, 40);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(227, 155, 130, 40);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Buildings");
		//btnNewButton_2.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent arg0) {
			
				//for(Building b: MainClass.buildings.Building){
				//	gotoBldgList();
						
					//}
					
				//}
			
		//});
		btnNewButton_2.setBounds(87, 54, 130, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Street"); 
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdmiinInter frame = new AdmiinInter();
				frame.setVisible(false);
				
				street r = new street();
				r.setVisible(true);
				
			}
		});
		btnNewButton_3.setBounds(227, 54, 130, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Logout");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gotologin();
			}
		});
		btnNewButton_4.setBounds(10, 10, 91, 34);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exit");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 System.exit(0);
			}
		});
		btnNewButton_5.setBounds(341, 232, 85, 21);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Appartement");
		btnNewButton_6.setBounds(227, 104, 130, 40);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Back");
		btnNewButton_7.setBounds(10, 232, 85, 21);
		contentPane.add(btnNewButton_7);
		
		JComboBox<String> comboBox = new JComboBox<String>();		comboBox.setBounds(87, 155, 130, 40);
		contentPane.add(comboBox);
		//for (Building b : MainClass.buildings.Building){
		//	comboBox.addItem(b.getID());	
		//}
		
		
		JLabel lblNewLabel_1 = new JLabel("Select ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 156, 67, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resident:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 181, 67, 14);
		contentPane.add(lblNewLabel_2);
	}
	private void gotologin(){
		loginn l = new loginn();
		l.setVisible(true);
		
		dispose();
	}
	private void gotoBldgList(){
		smartbuilding n = new smartbuilding();
		n.setVisible(true);
		dispose();
	}

}
