package day04;
import java.util.Scanner;

public class input {

	public static void main(String[] args) {
		String name = "";
		Scanner sc = new Scanner(System.in);//�Է��� �ϱ����� �غ�
		//A.b : A�ȿ� b
		System.out.println("�̸��� ����?");
		name = sc.nextLine();
		//name = sc.next(); //sc.next()�� ���ڿ���, name�� �������
		System.out.println(name);
	}

}
