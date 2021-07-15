package day23;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e = new Elevator();
		Random r = new Random();
		int cnt=0; //ž���Կ� �� 
		int []arElevator = new int[5]; //��������������
		int floor=0;
		String check="";
		cnt=r.nextInt(6);//�ο��� ��������, 0����� 5����� ��������
		for (int i = 0; i < cnt; i++) {
			arElevator[i]=1;
		}
	
		while(true) { //������ �������� �����ִ� ����
			//�ִ� : 10��
			//�ּ� : -3��
			//nextInt()�� 0���� ���� �� �ִ� > nextInt()��
			floor = r.nextInt(e.maxFloor+(e.minFloor*-1)+1)+e.minFloor;
			if(floor!=0)break;
		}
		if(cnt==0) {
			System.out.println("���� ž�� �Ϸ� : ����(�ִ�5��)");
		}else {
			System.out.println("���� ž�� �ο� : "+cnt+"��(�ִ�5��)");
		}
		System.out.println("Y : Ÿ��          N : ������");
		check = new Scanner(System.in).next().toUpperCase();
		if(check.equals("Y")) {
			cnt++;
			//�ο��ʰ��� �κ�(5��Ÿ�µ� ���� ž���ؼ� 6��)
			try { 
				arElevator[cnt-1]=1;
				Elevator.floor=floor; //�� ������ �̻���� ����� ���
				e.go();
			} catch (Exception e1) {
				System.out.println("�����ʰ�");
			}
		}
	}
}
