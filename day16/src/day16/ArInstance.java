package day16;

import java.util.Scanner;

class Animal{
	String name;
	int age;
	String feed;
	
	public Animal() {}

	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	@Override
	public String toString() {
		return "�̸� : "+name+"\n���� : "+ age+ "��\n���� : "+feed;
	}
	
	void show() {
		System.out.println("");
	}
	

}

public class ArInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] arAni = new Animal[3];
		String name="";
		String feed="";
		int age=0;
		
		
		
		for (int i = 0; i < arAni.length; i++) {
			arAni[i] = new Animal();//new�����ڸ� ȣ���ؼ� ���� ��üȭ ����� ��
			
			System.out.println(i+1+"�� ���� �̸� : ");
			name=sc.next();
			System.out.println("���� : ");	
			age=sc.nextInt();
			System.out.println("���� : ");
			feed=sc.next();
			arAni[i] = new Animal(name,age,feed);
			
		}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
		
		
	}
}
