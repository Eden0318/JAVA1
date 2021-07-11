package practice;

class BasicCar{
	String brand;
	String color;
	int price;
	
	public BasicCar() {}
	
	public BasicCar(String brand, String color, int price) {
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

class SportsCar extends BasicCar{
	String mode;
	
	public SportsCar() {
		
	}

	public SportsCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode=newMode;
		System.out.println("��� ����Ǿ����ϴ�");
	}
	@Override
	void engineStart() {
		System.out.println("�������� �õ� Ŵ");
	}
	
	private void enigneStop() {
		System.out.println("�������� �õ� ��");
	}
}



public class CastingTest {
	public static void main(String[] args) {
		BasicCar noOptionFerrari = new SportsCar();
		//noOptionFerrari.engineStart();
		//noOptionFerrari.changeMode();�ڽ� Ŭ������ �߰��� �͵��� ��� �� �� ����.
		  
		BasicCar car = new BasicCar();
		SportsCar ferrari = new SportsCar();
		
		if(car instanceof BasicCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}if(ferrari instanceof BasicCar){
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}if (car instanceof SportsCar){
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}if(noOptionFerrari instanceof BasicCar){
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");

		}
	}
}	