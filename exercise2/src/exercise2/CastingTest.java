package exercise2;

class GeneralCar{
	String brand;
	String color;
	int price;
	
	public GeneralCar() {
		
	}
	
	
	
	public GeneralCar(String brand, String color, int price) {
		
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

class SportsCar extends GeneralCar{
	String mode;

	public SportsCar() {}

	public SportsCar(String brand, String color, int price, String mode) {
		super(brand,color,price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	@Override
	void engineStop() {
		System.out.println("�������� �õ� ��");
	}
	
	void openRoof() {
		System.out.println("�Ѳ�����");
	}

}


public class CastingTest {
	
	public static void main(String[] args) {
		/*
		 * up casting�� �ؼ� +a �� ©�ȴٸ� down casting���� ����
		 */
		
		
		//��up casting - openRoof���� ���ԡ�
		GeneralCar noOptionFerrari = new SportsCar();
		noOptionFerrari.engineStart();
		
		//1.Ÿ���� �ٸ��⶧���� ������ ���١�
		//SportsCar brokenFerrari = new Car();
		
		//2. �׷��� ���� ����ȯ�� ����� �Ѵ�.�� ������ �ȵ�
		//��? ������ ������ ������! �������� �� ������ ����(��Ÿ�ӿ���)
		//SportsCar brokenFerrari = (SportsCar)new Car();
		
		//��down casting : ������ �ǹ� (2���̶� �򰥸��� ����)
		//up casting�� ��ü�� �־� �����Ѵ�. �� ����? �Ʊ� up casting���� ©���ֵ�
		//��������ȯ ����
		SportsCar fullOptionFerrari = (SportsCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
		
		GeneralCar car = new GeneralCar();
		SportsCar ferrari = new SportsCar();
		
		if(car instanceof GeneralCar) {
			System.out.println("nice casting!");
		}else {
			System.out.println("err");
		}
		
		if(ferrari instanceof GeneralCar) {
			System.out.println("nice casting!");
		}else {
			System.out.println("err");
		}
		
		if(car instanceof SportsCar) {
			System.out.println("nice casting!");
		}else { 
			System.out.println("err");
		}
		
		//��ɼ���󸮴� �θ�Ÿ�Կ� �ڽĻ����ڰ� ������
		//�ڽı�� ����� �� ����, �θ�Ÿ���� ���������
		if(noOptionFerrari instanceof GeneralCar) {
			System.out.println("nice casting!");
		}else {
			System.out.println("err");
		}
		
		
	}

}
