package practice;
//강아지, 고양이, 돼지
//생성자를 사용해서 초기화 하기
//먹다 자다 움직이다
public class Animal {
	String name;
	double weight;
	int age;
	
	public Animal() {}
	
	public Animal(String name,double weight, int age) {
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	@Override
	public String toString() {

		return "이름:"+name+"\n나이:"+age+"\n몸무게:"+weight;
	
}
 	
	public static void main(String[] args) {
		Animal dog = new Animal("초코",5.5,2);
		Animal cat = new Animal("나비",4.2,3);
		
		System.out.println(dog);
		System.out.println(dog.toString());
		System.out.println(cat);
		System.out.println(cat.toString());
	}
}
