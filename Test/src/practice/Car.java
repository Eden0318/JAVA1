package practice;

public class Car {
	final int wheel=4;
	public String brand;
	protected String color;
	private int price;

	public Car() {
		System.out.println("�θ�Ŭ������ �⺻������");
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
		System.out.println("����� �õ� Ŵ");
	}
	
	void engineStop() {
		System.out.println("����� �õ� ��");
	}
 

}
