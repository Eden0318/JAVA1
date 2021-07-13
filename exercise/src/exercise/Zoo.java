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
		System.out.println(name+"이 "+feed+"를 먹는중");
	}
	
	void sleep() {
		System.out.println(name+"이 자는중");
	}
	
	public static void main(String[] args) {
		//Zoo dog = new Zoo("배꼽",5,12,"과자");
		Zoo dog = new Zoo();
		dog.feed="과자";
		dog.name="방울";
		dog.eat();
	}
	
	

}
