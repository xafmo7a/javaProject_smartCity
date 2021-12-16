package GUI;

import javax.swing.JPanel;
import javax.swing.JTextPane;

import Collections.AccountCollection;
import user.Resident;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class report extends JFrame {

	/**
	 * Create the panel.
	 */
	public report() {
		getContentPane().setLayout(null);
		
		final JTextPane textPane = new JTextPane();
		textPane.setBounds(24, 48, 387, 164);
		getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("Submit Report");
		btnNewButton.setBounds(156, 223, 132, 39);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//AccountCollection.currentacc.report= textPane.toString();
				dispose();
				
				
				
			}
		});
		getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Type your report!");
		lblNewLabel.setBounds(146, 11, 202, 26);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		getContentPane().add(lblNewLabel);

	}
}
