package day06;

public class ForTest {
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			System.out.println(i+1+"eden");
//		}
		
		//1~100까지 출력
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}

		
		//100~1까지 출력
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		//100~1까지 짝수만 출력
		
		for(int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
		
		//100~1까지 홀수만 출력
		for(int i=0; i<100; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
		//1~100까지 3과 5의 공배수	
		for(int i = 0; i<101; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
		//A~E까지 출력
		for(int i = 0; i<5; i++) {
			System.out.println((char)(65+i));
		}
	}
}
