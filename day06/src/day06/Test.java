package day06;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String q = "Q.오늘은 당신의 생일입니다.\n"
				+ "친구에세 상자를 선물로 받았습니다\n"
				+ "이 상자안에는 무엇이 들어 있었을까요?\n"
				+ "1.꽃\n"
				+ "2.손수건\n"
				+ "3.깜짝 상자\n"
				+ "4.보석\n";
		
		String answer1 = "꽃 : 당신은 거짓말을 못해서 안합니다.";
		String answer2 = "손수건: 당신은 너무 정직한 사람입니다.";
		String answer3 = "깜짝상자 : 당신은 눈 하나 깜짝 안하고 거짓말을 합니다.";
		String answer4 = "보석 : 당신은 때에 따라 가끔식은 거짓말을 합니다.";
		
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
