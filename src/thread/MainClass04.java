package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread{
	JFrame frame;
	JLabel label;
	public A04() {
		frame = new JFrame("label example");
		Container con = frame.getContentPane();
		
		label = new JLabel("test label");
		label.setText("aaaaA");
		Font font = new Font(null, Font.ITALIC, 32);
		label.setFont(font);
		
		con.add(label);
		
		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	
	}
	public void run() {
		frame.setVisible(true);
		for(int i = 0; ; i++) {
			label.setText(i + ".변경");
		}
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new A04();
		a.start();
		while(true) {
			System.out.println("입력");
			String s = new Scanner(System.in).next();
			System.out.println("출력 : " + s);
		}
	}
}
