package practice;

public class SuperCar extends Car{
	 String mode;
	
	 public SuperCar() {
		System.out.println("�ڽ�Ŭ������ �⺻������ �Դϴ�.");
	}
	 
	 public SuperCar(String brand, int price, String color, String mode) {
		super(brand,price,color);
		setPrice(price);
		this.mode = mode;
	}

	@Override //�޼��� ������
	void engineStart() {
		 System.out.println("�������� �õ� Ŵ");
	 }
	 
	 @Override
	void engineStop() {
		 System.out.println("�������� �õ� ��");
	}
	 
	
}
