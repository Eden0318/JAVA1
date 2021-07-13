package exercise;

public class SuperCar extends Car {
	String mode;
	
	public SuperCar() {
		System.out.println("자식 클래스의 기본 생성자 입니다.");
	}
	
	public SuperCar(int wheel, String brand, String color, int price, String mode) {
		super(wheel, brand, color, price);
		this.mode=mode;
	}
	
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	void show() {
		System.out.println(mode+"모드입니다");
	}
	
}
