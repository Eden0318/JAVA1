package exercise;

import java.util.Scanner;

public class ArTest {
	//1��
	//1ȣ 2ȣ 3ȣ
	//��տ���, �ѿ��� ���ϱ�
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg=0.0;
		int []ho = new int[3];
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1+"ȣ�� ������ �Է��ϼ��� (���� : ����)");
			ho[i] = sc.nextInt();
			sum+=ho[i];
			
		}
		System.out.println("�� ����:"+sum);
		avg=Double.parseDouble(String.format("%.2f", (double)sum/ho.length));
		System.out.println("�� ���:"+avg);
	}
}
