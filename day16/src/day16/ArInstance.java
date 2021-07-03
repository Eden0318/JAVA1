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
		return "이름 : "+name+"\n나이 : "+ age+ "살\n먹이 : "+feed;
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
			arAni[i] = new Animal();//new생성자를 호출해서 각각 개체화 해줘야 함
			
			System.out.println(i+1+"번 동물 이름 : ");
			name=sc.next();
			System.out.println("나이 : ");	
			age=sc.nextInt();
			System.out.println("먹이 : ");
			feed=sc.next();
			arAni[i] = new Animal(name,age,feed);
			
		}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
		
		
	}
}
