package exercise;

public class Casting {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.data1=100;
		parent.data2=200;
		parent.method1();
		System.out.println(parent.data1);
		System.out.println(parent.data2);
		parent.method1();
		
	}
}
