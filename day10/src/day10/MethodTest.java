package day10;

public class MethodTest {

	
	int add(int num1, int num2) {
		System.out.println("�����Դϴ�.");
		return num1+num2;
	}
	
	
	
	
	public static void main(String[] args) {
		MethodTest m = new MethodTest(); //���θ޼��忡�� Ŭ���� ���� add�޼��带 �о�� �ȴٰ� �˷��ִ� �κ�
		System.out.println(m.add(3, 7));
		
		int result = m.add(3, 7);
		System.out.println(result);

	}
}
