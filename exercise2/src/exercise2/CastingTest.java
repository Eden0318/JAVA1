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
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
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
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
	
	void openRoof() {
		System.out.println("뚜껑열림");
	}

}


public class CastingTest {
	
	public static void main(String[] args) {
		/*
		 * up casting을 해서 +a 가 짤렸다면 down casting으로 복구
		 */
		
		
		//★up casting - openRoof접근 못함★
		GeneralCar noOptionFerrari = new SportsCar();
		noOptionFerrari.engineStart();
		
		//1.타입이 다르기때문에 오류가 난다↓
		//SportsCar brokenFerrari = new Car();
		
		//2. 그래서 강제 형변환을 해줘야 한다.↓ 하지만 안됨
		//왜? 문법상 오류는 없지만! 실행했을 때 오류가 난다(런타임에러)
		//SportsCar brokenFerrari = (SportsCar)new Car();
		
		//★down casting : 복원의 의미 (2번이랑 헷갈리지 말기)
		//up casting된 객체를 넣어 복원한다. 뭘 복원? 아까 up casting에서 짤린애들
		//강제형변환 가능
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
		
		//노옵션페라리는 부모타입에 자식생성자가 들어가있음
		//자식기능 사용할 수 없어, 부모타입을 벗어나지못함
		if(noOptionFerrari instanceof GeneralCar) {
			System.out.println("nice casting!");
		}else {
			System.out.println("err");
		}
		
		
	}

}
