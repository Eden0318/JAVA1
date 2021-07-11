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
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
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
		System.out.println("모드 변경되었습니다");
	}
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	private void enigneStop() {
		System.out.println("음성으로 시동 끔");
	}
}



public class CastingTest {
	public static void main(String[] args) {
		BasicCar noOptionFerrari = new SportsCar();
		//noOptionFerrari.engineStart();
		//noOptionFerrari.changeMode();자식 클래스의 추가된 것들은 사용 할 수 없다.
		  
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