package day05;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		String q = "Q.다음 중 프로그래밍언어가 아닌 것은?\n"+
	"1.JAVA\n"+"2.Python\\n"+"3.C언어\n"+"4.망둥어\n";
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int answer = 4;
		String result = "";
		
		System.out.print(q);
		choice = sc.nextInt();
		
		result = choice == answer?"정답입니다":choice>=1&&choice<=4?"오답입니다.":"잘못입력하셨습니다.";
		System.out.println(result);
		
	}

}
