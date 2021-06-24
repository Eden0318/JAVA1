package day12;

public class Car {
	int price; //전역변수
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
		System.out.println("브랜드 : "+brand+"\n색상"+color+"\n가격"+price+"만원");
	}
	
	public static void main(String[] args) {
		//객체화 -> 클래스로 접근이 아니라 객체로 접근한다.
		//인스턴스 변수 ex)momCar
		//클래스명():기본생성자
		//기본생성자는 클래스를 선언하면 자동으로 선언된다.
		
		Car momCar = new Car(9000,"Black","Benz");
		Car dadyCar = new Car();
		Car myCar = new Car();
		
		momCar.showInfo();
		dadyCar.showInfo();
		myCar.showInfo();


	}
}
