package exercise2;

import java.util.Scanner;

class Animal{
	String name;
	int age;
	String feed;
	
	
	public Animal() {
		
	}


	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	@Override
	public String toString() {
		return "이름:"+name+"\n나이"+age+"살\n먹이:"+feed;
	}
	
	
}


public class ArInstance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Animal[]arAni = new Animal[3];
		
		for(int i=0; i<arAni.length;i++) {
			System.out.println(i+1+"번 동물의 이름 : ");
			sc.next();
			
		}
	}

}
