package exercise;

public class Car {
	
	int wheel = 4;
	String brand;
	String color;
	int price;
	
	public Car() {
		System.out.println("�θ�Ŭ���� �⺻������ �Դϴ�.");
	}
	
	
	public Car(int wheel, String brand, String color, int price) {
		this.wheel = wheel;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
	
	


}
