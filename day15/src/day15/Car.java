package day15;

public class Car {
	
	final int wheel = 4;//아예 수정이 불가능하게 상수로 선언
	public String brand;
	protected String color;
	private int price;
	
	public Car() {
		System.out.println("부모클래스의 기본생성자");
	}

	public Car(String brand, String color, int price) {
		
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	

	
}
