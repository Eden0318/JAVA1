package exercise;

public class Zoo {
	String name;
	int age;
	double weight;
	String feed;
	
	public void Zoo() {
		

	}
	
	public Zoo(String name, int age, double weight, String feed) {

		this.name = name;
		this.age = age;
		this.weight = weight;
		this.feed = feed;
	}
	
	public Zoo() {
		// TODO Auto-generated constructor stub
	}

	void eat() {
		System.out.println(name+"�� "+feed+"�� �Դ���");
	}
	
	void sleep() {
		System.out.println(name+"�� �ڴ���");
	}
	
	public static void main(String[] args) {
		//Zoo dog = new Zoo("���",5,12,"����");
		Zoo dog = new Zoo();
		dog.feed="����";
		dog.name="���";
		dog.eat();
	}
	
	

}
