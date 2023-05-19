package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("label example");
		Container con = frame.getContentPane();
		
		JLabel label = new JLabel("test label");
		label.setText("aaaaA");
		Font font = new Font("ink free", Font.ITALIC, 32);
		label.setFont(font);
		
		con.add(label);
		
		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for(int i = 0; ; i++) {
			label.setText(i + ".변경");
		}
	}
}
