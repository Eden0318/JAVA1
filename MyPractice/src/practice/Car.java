package practice;

import java.util.Scanner;

public class Car {
	public static void main(String[] args) {
		
		int choice = 0;
		int answer = 4;
		String result = "";
		
		
		String q = "Q.���� �� ���α׷��־� �ƴ� ����?\n"+
				"1.JAVA\n"+"2.Python\n"+"3.C���\n"+"4.���վ�";
		
		Scanner sc = new Scanner(System.in);
		System.out.println(q);
		choice = sc.nextInt();
		result = (choice == answer ? "�����Դϴ�" : choice>=1 && choice<=4? "�ߺ����":"?");
		System.out.println(result);
		
		
		
		
		
	
		
	
	}
}
