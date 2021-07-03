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
		System.out.println(name+" "+this.position+"�� "+this.subject+"��(��) ������");
		System.out.println("�����ܰ�:"+money+"��");
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher ���缮 = new Teacher("���缮", 20, "����", 0, "����");
		String []arSub = {"�ڹ�","C���","���̽�"};
		Random r = new Random();
		
		int index = 0;
		index = r.nextInt(3); // ex) 0~2������ ������ ��
		���缮.teach(arSub[index]);
		for (int i = 0; i < 100; i++) {
			���缮.teach(arSub[index]);	
		}
		
	}
}
