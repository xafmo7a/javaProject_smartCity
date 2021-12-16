package GUI;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public  class icons {
public  ImageIcon success;
public icons (){
	success = new ImageIcon("C:/Users/hache/OneDrive/Documents/Wondershare/success-24.png");
	 Image image =success.getImage();
	 Image newim=image.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
	 success = new ImageIcon(newim);
	
}
}
