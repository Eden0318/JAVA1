package practice;

import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		
		int choice = 0;
		int answer = 4;
		String result = "";
		
		
		String q = "Q.다음 중 프로그래밍언어가 아닌 것은?\n"+
				"1.JAVA\n"+"2.Python\n"+"3.C언어\n"+"4.망둥어";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(q);
		choice = sc.nextInt();
		result = (choice == answer ? "정답입니다" : choice>=1 && choice<=4? "삐빅오답":"?");
		System.out.println(result);
		
		
		
		
		
	
		
	
	}
}
