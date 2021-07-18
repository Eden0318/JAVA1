package day25;


public class ObjectTest {
//	
//	int data1=10;
//	int data2=20;
//	int data3=30;
//	
//	@Override
//	public String toString() {
//		return ""+data1+data2+data3;
//	}
//	
	
	String brand;
	String color;
	int price;
	
	
	public ObjectTest(String brand) {
		this.brand="benz";
	}
	
	@Override
		public String toString() {
		
			return color;
		}
	
	
	
	
	public static void main(String[] args) {
//		ObjectTest o = new ObjectTest();
//		//객체명을 출력할 때 항상 뒤에 toString()이 생략된다
//		//주소값말고 다른것을 출력하고 싶다면 toString을 재정의하면된다
//		System.out.println(o);
		
		ObjectTest momCar = new ObjectTest("k5");
		System.out.println(momCar);
		
	}
}
