package practice;
//������, �����, ����
//�����ڸ� ����ؼ� �ʱ�ȭ �ϱ�
//�Դ� �ڴ� �����̴�
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

		return "�̸�:"+name+"\n����:"+age+"\n������:"+weight;
	
}
 	
	public static void main(String[] args) {
		Animal dog = new Animal("����",5.5,2);
		Animal cat = new Animal("����",4.2,3);
		
		System.out.println(dog);
		System.out.println(dog.toString());
		System.out.println(cat);
		System.out.println(cat.toString());
	}
}
