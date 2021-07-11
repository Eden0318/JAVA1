package practice;

import java.util.Iterator;
import java.util.Scanner;

class Animal{
	String name;
	String feed;
	int age;
	
	public Animal() {}
		

	public Animal(String name, String feed, int age) {
		this.name = name;
		this.feed = feed;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		return "이름 : "+name+"\n나이 "+age+"살\n먹이 "+feed;
	}
	
}

public class ArInstance {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[] arAni = new Animal[3];
		String name="";
		int age=0;
		String feed="";
		
		for (int i = 0; i < arAni.length; i++) {
			//arAni[i]=new Animal();
			arAni[i] = new Animal(name,feed, age);
			System.out.println(i+1+"번 동물 이름 :");
			name=sc.next();
			//arAni[i].name = sc.next();
			System.out.println("나이 : ");
			age=sc.nextInt();
			//arAni[i].age=sc.nextInt();
			System.out.println("먹이 : ");
			feed=sc.next();
			//arAni[i].feed = sc.next();
			
		}
		
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]); 
		}
		
	}
		
}

