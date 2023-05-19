package exceotion;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = input.nextInt();
			if( age < 1) {
				throw new Exception("잘 못 입 력");
			}
			System.out.println(age);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("다음 문장들 실행");
		
	}
}
