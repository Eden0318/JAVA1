package day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String q = "Q.������ ����� �����Դϴ�.\n"
				+ "ģ������ ���ڸ� ������ �޾ҽ��ϴ�\n"
				+ "�� ���ھȿ��� ������ ��� �־������?\n"
				+ "1.��\n"
				+ "2.�ռ���\n"
				+ "3.��¦ ����\n"
				+ "4.����\n";
		
		String answer1 = "�� : ����� �������� ���ؼ� ���մϴ�.";
		String answer2 = "�ռ���: ����� �ʹ� ������ ����Դϴ�.";
		String answer3 = "��¦���� : ����� �� �ϳ� ��¦ ���ϰ� �������� �մϴ�.";
		String answer4 = "���� : ����� ���� ���� �������� �������� �մϴ�.";
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		System.out.println(q);
		choice = sc.nextInt();
		
		/*
		 if(choice == 1) {
			System.out.println(answer1);
		}else if(choice == 2) {
			System.out.println(answer2);
		}else if(choice == 3) {
			System.out.println(answer3);
		}else if(choice == 4) {
			System.out.println(answer4);
		}else {
			System.out.println("?");
		}
		*/
		
		switch(choice) {
		case 1:
			System.out.println(answer1);
			//break;
		case 2:
			System.out.println(answer2);
			//break;
		case 3:
			System.out.println(answer3);
			//break;
		case 4:
			System.out.println(answer4);
			//break;
		default :
			System.out.println("?");
		}
		
		

		
		
		
	}

}
