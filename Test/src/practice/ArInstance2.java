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
		
		return "이름 : "+name+"\n나이 "+age+"살\n먹이 "+feed;
	}
	
	
}


public class ArInstance2 {
	public static void main(String[] args) {
		zoo dog = new zoo("방울","사료",5);
		zoo pig = new zoo("배꼽","고기",7);
		zoo cat = new zoo("나비","껌",7);
	
		System.out.println(dog);
		
	}
	
	
	

}
