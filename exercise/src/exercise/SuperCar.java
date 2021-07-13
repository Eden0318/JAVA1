package exercise;

public class SuperCar extends Car {
	String mode;
	
	public SuperCar() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������ �Դϴ�.");
	}
	
	public SuperCar(int wheel, String brand, String color, int price, String mode) {
		super(wheel, brand, color, price);
		this.mode=mode;
	}
	
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
	void show() {
		System.out.println(mode+"����Դϴ�");
	}
	
}
