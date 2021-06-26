package day12;
//강아지, 고양이, 돼지
//생성자를 사용해서 초기화 하기
//생성자 단축키 alt+shift+s > o

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
		System.out.println(name+"이(가)"+feed+"를 먹는중!!");	
	}
	
	void sleep() {
		System.out.println(age+"살 "+name+"이(가)"+sound+" 소리를 내며"+" 자는중!!");
	}
	
	public static void main(String[] args) {
		Animal pig = new Animal("배꼽","곡식","꿀꿀",5);
		Animal cat = new Animal("나비","사탕","야옹",2);
		pig.sleep();
		pig.eat();
		cat.eat();
	}

}
	

