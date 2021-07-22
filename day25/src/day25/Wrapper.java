package day25;

public class Wrapper {
	public static void main(String[] args) {
		//원래 자바에서는 무조건 이렇게 작성했었음 jdk1.5버전 전
		//String str=new String("1");
		
		//오토박싱, 큰거(Integer)에서 작은것(int 10)을 감싼다	
		Integer data=10; 
		//int라는 일반 타입에 클래스타입 Integer를 넣음->오토언박싱
		int data2=data;
		
		System.out.println(data2);
	}
}
