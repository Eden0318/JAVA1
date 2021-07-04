package day17;

class Car{
	String brand;
	String color;
	int price;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {
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

class SuperCar extends Car{ //자식생성자
	
	String mode;
	
	public SuperCar() {}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand,color,price);
		this.mode = mode;
	}
	
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("모드가 바뀌었습니다");
	}
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
}


public class CastingTest {
	public static void main(String[] args) {
		//upcasting 부모 클래스 타입으로 자식생성자를 호출하는 것
		Car noOptionFerrari = new SuperCar();
		
		//noOptionFerrari.engineStart();
		/*
		 * noOptionFerrari.changeMode(); -> X 자식 클래스의 추가 된 것들은 사용할 수 없다.
		 *단, 부모클래스에서 재정의 된 것들은 사용 가능
		 */
		
		Car car = new Car();
		SuperCar ferrari = new SuperCar();
		
		if(car instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		//ferrari는 supercar 타입인데 슈퍼카는 부모클래스를 상속받았음
		if(ferrari instanceof Car) { 
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		//superCar는 Car타입이지만 car는 superCar타입이 될 수  없다.
		if(car instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		//타입은 car타입인데 자식생성자가 들어갈 경우(upcasting) ? nice!
		if(noOptionFerrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("err : wrong casting");
		}
		
		
	}
}
