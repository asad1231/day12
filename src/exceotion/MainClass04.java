package exceotion;
class A04{
	public void a01() {
		a02();
	}
	public void a02() {
		try {
			a03();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void a03() throws Exception {
		System.out.println("a03실행");
		Thread.sleep(1000);
	}
	
}
public class MainClass04 {
	public static void main(String[] args) {
		A04 a = new A04();
		a.a01();
	}
}
