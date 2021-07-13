package exercise;

public class Car {
	
	int wheel = 4;
	String brand;
	String color;
	int price;
	
	public Car() {
		System.out.println("부모클래스 기본생성자 입니다.");
	}
	
	
	public Car(int wheel, String brand, String color, int price) {
		this.wheel = wheel;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
	
	


}
