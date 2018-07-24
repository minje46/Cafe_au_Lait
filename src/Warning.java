import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.SwingConstants;

public class Warning
{
	JDialog dialog;

	public Warning(String str) 
	{
		dialog = new JDialog();
		dialog.setAlwaysOnTop(true);
		ImageIcon bg = new ImageIcon("warning.png");
		JPanel pop_up = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(bg.getImage(), 0, 0, null);
				setOpaque(false);// 배경 띄워주기
				super.paintComponent(g);
			}
		};
		dialog.getContentPane().add(pop_up);
		pop_up.setLayout(null);

		JLabel txt = new JLabel("<html>"+str.toString()+"<html>");
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		txt.setFont(new Font("Franklin Gothic Demi Cond", Font.PLAIN, 50));
		txt.setForeground(Color.WHITE);
		txt.setBounds(78, 29, 428, 196);
		pop_up.add(txt);		
		
		dialog.setBounds(100, 200, 600, 300);
		dialog.setModal(true);
		dialog.setVisible(true);
	}
}