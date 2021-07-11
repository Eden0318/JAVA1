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
		
		System.out.println(name+" "+position+"��"+subject+"��(��)������");
		System.out.println("�����ܰ� : "+money+"��");
	}
	
}


public class Job {
	public static void main(String[] args) {
		Teacher Han = new Teacher("�ѵ���", 20, "����", 0, "����");
		
		String[]arSub= {"JAVA","Python","C���"};
		
		Random r= new Random();
		
		
		for (int i = 0; i < 100; i++) {
			
			int index=0;
			index = r.nextInt(3);
			Han.teach(arSub[index]);
		}
	}
}
