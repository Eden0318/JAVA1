package exercise;

import java.util.Scanner;

/*
 * ZARA
 * ������, �ڿ�����, ����
 * ��ո����, �Ѹ���� (����:�鸸��)
 * �� ��� ������� ������������(�Ҽ��� ��°�ڸ�����)
 */

public class ArShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []arShop =  {"������","�ڿ�����","����"};
		int [] arIncome = new int[3];
		int sum=0;
		int cnt=0;
		double avg=0.0;
		String best="����";
		
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(arShop[i]+"�� �� ������� �Է��ϼ��� (���� : �鸸��)");
			arIncome[i]=sc.nextInt();
			sum+=arIncome[i];
			
		}
		avg=Double.parseDouble(String.format("%.2f",(double)sum/arShop.length));
		System.out.println("�� �����"+sum);
		System.out.println("��� �����"+avg);
		
		
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i]>avg) {
				cnt++;
				if(cnt==1) best="";
				best=arShop[i]+"\n";
			}
			
		}
		System.out.println("���μ�Ƽ������:\n"+best);
		
	}

}
