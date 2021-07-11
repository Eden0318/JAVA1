package practice;

class Human{
	String name;
	String gender;
	int age;
	int money;
	
	public Human() {
		
	}
	
	public Human(String name, String gender, int age, int money) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.money=money;
	}
		
}


class developer extends Human{

	String subject;
	String position;
	private int income = 10_000_000;
	
	
	public developer() {}

	
	public developer(String name, String gender, int age, int money, String subject, String position) {
		super(name,gender,age,money);
		this.subject = subject;
		this.position = position;
	}
	
	void teach(String subject) {

		money+=income;
		System.out.println(name+" "+position+"가"+subject+"개발중");
		System.out.println("돈"+money);
	}
	
}



public class MyJob {
	public static void main(String[] args) {
		developer Lee = new developer("eden","여자",20,0,"python","개발자");
		Lee.teach("python");
		Lee.teach("python");
		
	}
}
