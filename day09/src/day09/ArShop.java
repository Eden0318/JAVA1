package day09;

import java.util.Scanner;

public class ArShop {
	//ZARA
	//������, �ڿ�����, ����
	//������ 100���� ������ �Է¹޴´�.
	//��, ��� ������� ������������ ����Ѵ�.
	public static void main(String[] args) {
		
		int [] arIncome = new int[3];
		String []arName = {"������","�ڿ�����","����"};
		Scanner sc = new Scanner(System.in);
		double avg = 0;
		int sum = 0;
		
		for(int i=0;i<arIncome.length;i++) {
			System.out.println(arName[i]+"������� �Է��ϼ���(���� : �鸸��)");
			arIncome[i] = sc.nextInt();
			sum+=arIncome[i];
		}
		avg=Double.parseDouble(String.format("%.2f",(double)sum/arIncome.length));
		System.out.println("ZARA �� ����� : "+sum+"�鸸��");
		System.out.println("��� ����� : "+avg+"����");

	}

}
