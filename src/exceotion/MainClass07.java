package exceotion;

import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		while(true) {
			try {
				System.out.println("수 입력");
				num = input.nextInt();
				System.out.println(num);
			} catch (Exception e) {
				// TODO: handle exception
				input.nextLine();
				System.out.println("문제 발생");
			}
		}
	}
}
