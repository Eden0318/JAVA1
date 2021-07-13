package exercise;

public class ClassExercise {
	String brand;
	String color;
	int price;
	
	
	private void classExercise() {
		System.out.println("기본생성자입니다");

	}
	
//	public ClassExercise(String brand, String color, int price) {
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
//	}

	void show() {
		System.out.println(brand+" "+color+" "+price);
	}
	
	public static void main(String[] args) {
		ClassExercise momCar = new ClassExercise();
		ClassExercise dadyCar = new ClassExercise();
		momCar.brand="benz";
		momCar.color="Red";
		momCar.price=10000;
		
		momCar.show();
		
	
	}
	
}

