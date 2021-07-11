package practice;

import java.util.Random;

class Person{
	String name;
	int age;
	String gender;
	int money;
	
	
	public Person() {}
		
	public Person(String name, int age, String gender,int money) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money=money;
	}
	
}

class Teacher extends Person{
	String subject;
	String position;
	private int income = 10_000_000;
	int cnt=0;
	
	
	public Teacher(String name, int age, String gender,int money, String position) {
		super(name,age,gender,money);
		this.position = position;
	}
	
	void teach(String subject) {
		cnt ++;
		//System.out.println(cnt);
		if(cnt%10==0) {//10,20,30
			income*=1.1;
		}
		
		this.subject=subject;
		money+=income;
		
		System.out.println(name+" "+position+"가"+subject+"을(를)강의중");
		System.out.println("통장잔고 : "+money+"원");
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher Han = new Teacher("한동석", 20, "남자", 0, "강사");
		
		String[]arSub= {"JAVA","Python","C언어"};
		
		Random r= new Random();
		
		
		for (int i = 0; i < 100; i++) {
			
			int index=0;
			index = r.nextInt(3);
			Han.teach(arSub[index]);
		}
	}
}
