package practice;

class zoo{
	
	String name;
	String feed;
	int age;
	
	public zoo() {}
		

	public zoo(String name, String feed, int age) {
		this.name = name;
		this.feed = feed;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		
		return "�̸� : "+name+"\n���� "+age+"��\n���� "+feed;
	}
	
	
}


public class ArInstance2 {
	public static void main(String[] args) {
		zoo dog = new zoo("���","���",5);
		zoo pig = new zoo("���","���",7);
		zoo cat = new zoo("����","��",7);
	
		System.out.println(dog);
		
	}
	
	
	

}
