package day06;
/*
 * �����������?
 * 1.�ƴ�
 * 2.�׷�
 * 3.�̹� �Ծ���
 * 4.��� ������ ����?
 * */
import java.util.Scanner;

public class Film {
	public static void main(String[] args) {
		String q = "�� ������ ����?^^\n"
				+ "1.�ƴ�\n"
				+ "2.�׷�\n"
				+ "3.�̹� �Ծ���\n"
				+ "4.��� ������ ����?\n";
		Scanner sc =new Scanner(System.in);
		int choice=0;
		
		System.out.println(q);
		choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("�׷�~");
			System.out.println("���ӿ���");
			break;
		case 2:
			System.out.println("�� �ʹ� ���� �߰�~");
			System.out.println("���ӿ���");
			break;
		case 3:
			System.out.println("���ӿ���");
			break;
		case 4:
			System.out.println("��� ������ ����!");
			break;
		default:
			System.out.println("�װ� ���� ���̾�?");
			System.out.println("���ӿ���");
		}
	}
}
