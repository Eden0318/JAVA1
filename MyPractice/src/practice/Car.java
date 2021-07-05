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


	int divide(int num1, int num2) {
		int result = num1/num2;
		return result;
		
	 }

	public static void main(String[] args) {
		Car momCar = new Car();
		momCar.divide(4,2);
		
	}
	
	
	
}
