package practice;

public class Car {
	final int wheel=4;
	public String brand;
	protected String color;
	private int price;

	public Car() {
		System.out.println("부모클래스의 기본생성자");
	}

	public Car(String brand, int price, String color) {
		
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	
	
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	} 

	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
 

}
