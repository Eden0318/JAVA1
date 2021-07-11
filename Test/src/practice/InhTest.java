package practice;

class A{
	int data = 10;
	
	public A() {
		System.out.println("부모 클래스 생성자");
	}
	
	void show() {
		System.out.println("A클래스메서드!!!!!!!");
	}
}

class B extends A{
	
	@Override //재정의!
	void show() {
		System.out.println("B클래스임");
		
	}
	
	void check() {
		show();
	}
	
}


public class InhTest {
	public static void main(String[] args) {
		B i = new B();
		i.data=20;
		i.check();
		i.show();
	}
}
