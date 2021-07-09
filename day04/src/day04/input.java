package day04;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		String name = "";
		String lastName="";
		Scanner sc = new Scanner(System.in);//입력을 하기위한 준비
		//A.b : A안에 b
		System.out.println("이름이 뭐니?");
		name = sc.nextLine(); //sc.next()는 문자열값, name은 저장공간
		System.out.println(name);
		
		
	}
}
