package exceotion;
class A01{
	public void test() {
		int num = 0;
		try {
			int re = 10 / num;
			System.out.println("문제 없을 경우");
		}catch (Exception e) {
			System.out.println("문제 있을 경우");
			// TODO: handle exception
		}finally {
			System.out.println("finally실행");
		}
		System.out.println("다음문장 실행");
	}
}


public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		a.test();
	}
}
