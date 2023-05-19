package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class timer extends Thread{
	JFrame frame;
	JLabel label;
	public timer() {
		frame = new JFrame("label example");
		Container con = frame.getContentPane();
		Font font = new Font(null, Font.ITALIC, 32);
		label = new JLabel();
		label.setFont(font);
		con.add(label);
		
		frame.setLocation(1000,200);
		frame.setPreferredSize(new Dimension(600,200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public void run() {
		frame.setVisible(true);
		while(true) {
			Date d = new Date();
			
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd일 aa hh시 mm분 ss초");
			String s_t = s.format(d);
			label.setText(s_t);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
	}
}

//class timer2 extends timer {
//	public void run() {
//		frame.setVisible(true);
//		while(true) {
//			SimpleDateFormat s = new SimpleDateFormat("hh시 mm분 ss초");
//			String s_t = s.format();
//			label.setText(s_t);
//		}
//	}
//}

class user{
	private ArrayList<String> id = new ArrayList<>();
	private ArrayList<String> pwd = new ArrayList<>();
	public ArrayList<String> getId() {
		return id;
	}
	public void setId(String id) {
		this.id.add(id);
	}
	public ArrayList<String> getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd.add(pwd);
	}
	
}

class userFunc{
	private Scanner input = new Scanner(System.in);
	private user u = new user();
	private timer t = new timer();
	public long login() {
		String id,pwd;
		System.out.print("아이디 : ");
		id = input.next();
		System.out.println("비밀번호 : ");
		pwd = input.next();
		if(u.getId().contains(id)) {
			int num = u.getId().indexOf(id);
			if(u.getPwd().get(num).equals(pwd)) {
				System.out.println("로그인 성공");
				System.out.println("==== 환영합니다 ====");
				t.start();
				
				return System.currentTimeMillis();
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
				return 0;
			}
		}else {
			System.out.println("존재하지 않는 회원입니다.");
			return 0;
		}
		}
		
		public void signup() {
			String id,pwd;
			System.out.print("아이디 : ");
			id = input.next();
			System.out.println("비밀번호 : ");
			pwd = input.next();
			if(!u.getId().contains(id)) {
				u.setId(id);
				u.setPwd(pwd);
				System.out.println("회원가입 완료");
			}else {
				System.out.println("존재하는 회원입니다");
			}
			
		}
		public long logout() {
			String num;
			System.out.println("로그아웃 하시겠습니까? y/n");
			num = input.next();
			if(num.equals("y")) {
				return System.currentTimeMillis();
			}else {
				return 0;
			}
		}
		
	
}



public class TestClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		userFunc uf = new userFunc();
		int num = 0;
		long start = 0;
		long end = 0;
		boolean num1 = true;
		while(true) {
			System.out.println("1.로그인 2.가입 3.로그아웃");
			System.out.print(">>>");
			try {
				num = input.nextInt();
			} catch (Exception e) {
				System.out.println("다시 입력해주세요");
				input.nextLine();
			}
			switch(num) {
			case 1 : long a = uf.login();
					 if(a != 0) {
						 start = a;
						 num1 = true;
						 while(num1) {
							 System.out.println("1.기능 2.off");
							 System.out.print(">>>");
							 num = input.nextInt();
							 switch(num) {
							 case 1 : System.out.println("기능 출력");break;
							 case 2 : num1 = false;
							 }
						 }
					 }
					 
					 break;
			case 2 : uf.signup(); break;
			case 3 : a = uf.logout(); 
					 if(a != 0) {
						 end = a;
						 System.out.println("로그인 유지 시간 : " + (end - start) / 1000 + "초");
						 start = 0;
						 end = 0;
						 a = 0;
					 }
					 break;
			
			}
			
		}
	}
}
