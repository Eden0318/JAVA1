package practice;

public class SuperCar extends Car{
	 String mode;
	
	 public SuperCar() {
		System.out.println("자식클래스의 기본생성자 입니다.");
	}
	 
	 public SuperCar(String brand, int price, String color, String mode) {
		super(brand,price,color);
		setPrice(price);
		this.mode = mode;
	}

	@Override //메서드 재정의
	void engineStart() {
		 System.out.println("음성으로 시동 킴");
	 }
	 
	 @Override
	void engineStop() {
		 System.out.println("음성으로 시동 끔");
	}
	 
	
}
