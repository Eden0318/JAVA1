package day25;

public class Wrapper {
	public static void main(String[] args) {
		
		String str=new String("1");
		String str2="1"; //오토박싱 (박싱==wrapping)
			
		Integer data=10; //오토박싱
		//int라는 일반 타입에 클래스타입data를 넣음->언박싱
		int data2=data;
		System.out.println(data2);
	}
}
