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
//		//��ü���� ����� �� �׻� �ڿ� toString()�� �����ȴ�
//		//�ּҰ����� �ٸ����� ����ϰ� �ʹٸ� toString�� �������ϸ�ȴ�
//		System.out.println(o);
		
		ObjectTest momCar = new ObjectTest("k5");
		System.out.println(momCar);
		
	}
}
