package day12;

public class Car {
	int price; //��������
	String color;
	String brand;
	
	//OverLoading
	Car(){
		
	}
	
	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}

	double speedUp(double speed) {
		speed++;
		return speed;
	}
	
	double speedDown(double speed) {
		speed--;
		return speed;
	}
	
	void  showInfo() {
		System.out.println(this);
		System.out.println("�귣�� : "+brand+"\n����"+color+"\n����"+price+"����");
	}
	
	public static void main(String[] args) {
		//��üȭ -> Ŭ������ ������ �ƴ϶� ��ü�� �����Ѵ�.
		//�ν��Ͻ� ���� ex)momCar
		//Ŭ������():�⺻������
		//�⺻�����ڴ� Ŭ������ �����ϸ� �ڵ����� ����ȴ�.
		
		Car momCar = new Car(9000,"Black","Benz");
		Car dadyCar = new Car();
		Car myCar = new Car();
		
		momCar.showInfo();
		dadyCar.showInfo();
		myCar.showInfo();


	}
}
