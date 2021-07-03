package practice;

public class Car {
	int price;
	String color;
	String brand;
	//int cnt=0;
	
	Car(){}


	 public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
	}


	void teach() {
		int cnt=0;
		cnt++;
		System.out.println(cnt);
	 }

	public static void main(String[] args) {
		Car momCar = new Car();
		momCar.teach();
		momCar.teach();
		momCar.teach();
		
	}
	
	
	
}
