package day15;

public class SuperCar extends Car {
	String mode;
	
	public SuperCar() {
		System.out.println("�ڽ� Ŭ������ �⺻ ������");
	}
	
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		//setPrice(price); price�� private���� �����ؼ�
		//�����ڸ� ���ؼ� �ص� ������ setPrice�� ���ؼ� �ص� �ȴ�.
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
	
	@Override
	public String toString() { //�θ�Ŭ���� toString������
		
		return "�귣��:"+brand+"\n����:"+color+"\n����:"+getPrice();
		
	}
}
