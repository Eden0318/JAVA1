package day12;
//������, �����, ����
//�����ڸ� ����ؼ� �ʱ�ȭ �ϱ�
//������ ����Ű alt+shift+s > o

public class Animal {
	String name;
	String feed;
	String sound;
	int age;
	
	public Animal() {}
	
	public Animal(String name, String feed, String sound, int age) {
		this.name = name;
		this.feed = feed;
		this.sound = sound;
		this.age = age;
	}
	
	void eat(){
		System.out.println(name+"��(��)"+feed+"�� �Դ���!!");	
	}
	
	void sleep() {
		System.out.println(age+"�� "+name+"��(��)"+sound+" �Ҹ��� ����"+" �ڴ���!!");
	}
	
	public static void main(String[] args) {
		Animal pig = new Animal("���","���","�ܲ�",5);
		Animal cat = new Animal("����","����","�߿�",2);
		pig.sleep();
		pig.eat();
		cat.eat();
	}

}
	

