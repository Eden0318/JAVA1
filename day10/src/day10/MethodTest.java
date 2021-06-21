package day10;

public class MethodTest {

	
	int add(int num1, int num2) {
		System.out.println("덧셈입니다.");
		return num1+num2;
	}
	
	
	
	
	public static void main(String[] args) {
		MethodTest m = new MethodTest(); //메인메서드에게 클래스 안의 add메서드를 읽어야 된다고 알려주는 부분
		System.out.println(m.add(3, 7));
		
		int result = m.add(3, 7);
		System.out.println(result);

	}
}
