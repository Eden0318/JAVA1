package day15;

class A{
	int data = 10;
	
	public A() {
		System.out.println("부모클래스생성자");
	}
	
	void show() {
		System.out.println("A클래스");
	}
}

class B extends A{
	
	@Override
	void show() {
		System.out.println("B클래스");
		
	}
	void check() {
		show();
	}
	
}


public class InhTest {
	public static void main(String[] args) {
		
		B instance = new B();
		/*
		 * //자식생성자사용 - > 부모생성자를 호출하는 super()가 자동으로 들어가있음
		 * super()가 먼저 있기 때문에 가장 먼저 부모클래스의 생성자가 출력된다.
		 *단, 기본생성자 B()일때만임
		 */
		
		instance.check();
	}
	
}
