package day04;

import java.util.Scanner;

/*
 * next()를 사용해서 동시에 2개의 정수를 입력받고
 * 두 값을 더한 결과 값을 출력하기 
 */

public class inputTask {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 2개를 차례로 입력하세요\n");
		num1 = Integer.parseInt(sc.next());//sc.next()자체가 문자열값임.
		num2 = Integer.parseInt(sc.next());
		//num1 = nextInt();
		//num2 = nextInt();
		System.out.println("결과:"+(num1+num2));
		
	}

}
