package day07;

import java.util.Scanner;

/*
 * 1.계산하기
 * 2.나가기
 * 1+1
 * 2
 * 
 */

public class Calc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1=Integer.parseInt(sc.next());
		String oper = sc.next();
		int num2 = Integer.parseInt(sc.next());
		
		System.out.println(num1);
		System.out.println(oper);
		System.out.println(num2);
		
		
	}

}
