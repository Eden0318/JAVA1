package day16;

import java.util.Random;

class Person{
	String name;
	int age;
	int money;
	int cnt=0;
	String gender;

	public Person() {}


	public Person(String name, int age, String gender,int money) {
	
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.money = money;
	}
}

class Teacher extends Person{
	String subject;
	String position;
	private int income = 10_000_000;
	
	public Teacher(String name, int age, String gender, int money, String position) {
		super(name, age, gender, money);
		this.position = position;
	}
	 
	void teach(String subject) {
		cnt++;
		if(cnt%10==0) income+=5000;
		this.subject = subject;
		money+=income;
		System.out.println(name+" "+this.position+"가 "+this.subject+"을(를) 강의중");
		System.out.println("통장잔고:"+money+"원");
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher 유재석 = new Teacher("유재석", 20, "남자", 0, "강사");
		String []arSub = {"자바","C언어","파이썬"};
		Random r = new Random();
		
		int index = 0;
		index = r.nextInt(3); // ex) 0~2까지의 랜덤한 수
		유재석.teach(arSub[index]);
		for (int i = 0; i < 100; i++) {
			유재석.teach(arSub[index]);	
		}
		
	}
}
