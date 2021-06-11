package day04;
import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		int data1 = 'A';
		int data2 = 'B';
		int data3 = 'C';
		char data4 = 65;
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);//정수가 문자로 형변환 A
		
		String pw = null;
		System.out.println("PW:");
		pw = new Scanner(System.in).next();
		System.out.println("암호화 된 PW :");
		for(int i=0; i < pw.length(); i++) {
			System.out.print((char)pw.charAt(i)-10);
		}
		
	}

}
