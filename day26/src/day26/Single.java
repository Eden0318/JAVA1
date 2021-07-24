package day26;

public class Single {
	
	//private으로 한 것은 밖에서 객체생성 하지 말라는 것
	private Single() {
		
	}
	
	//안에서 객체화
	private static Single instance = new Single();
	
	public static Single getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("안녕");
	}
}
