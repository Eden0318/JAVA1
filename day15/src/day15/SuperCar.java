package day15;

public class SuperCar extends Car {
	String mode;
	
	public SuperCar() {
		System.out.println("자식 클래스의 기본 생성자");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		//setPrice(price); price는 private으로 선언해서
		//생성자를 통해서 해도 되지만 setPrice를 통해서 해도 된다.
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
	
	@Override
	public String toString() { //부모클래스 toString재정의
		
		return "브랜드:"+brand+"\n색상:"+color+"\n가격:"+getPrice();
		
	}
}
