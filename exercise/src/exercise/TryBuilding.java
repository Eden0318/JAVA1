package exercise;

import java.util.Random;
import java.util.Scanner;

public class TryBuilding {
	public static void main(String[] args) {
		TryElevator e = new TryElevator();
		Random r = new Random();
		int []arElevator = new int[5];
		int floor=0;
		int cnt = 0;
		String check="";
		cnt=r.nextInt(6); //0���� 5���� ����
		
		for(int i=0; i<cnt;i++) {
			arElevator[i]=1;
		}
		
		while(true) {
			floor = r.nextInt(e.maxFloor+(e.minFloor*-1)+1)+e.minFloor;
			if(floor!=0)break;
		}
			if(cnt == 0) {
				System.out.println("���� ž�� �Ϸ� : ����(�ִ�5��)");
			}else {
				System.out.println("���� ž�� �ο� : "+cnt+"��(�ִ�5��)");
			}
			System.out.println("Y : Ÿ��          N : ������");
			check=new Scanner(System.in).next().toUpperCase();
			if(check.equals("Y")) {
				cnt++;//����ž��
				try {
					arElevator[cnt-1]=1;
					TryElevator.floor = floor;
					e.go();
				} catch (Exception e1) {
					System.out.println("�����ʰ�");
				} 			
			}
		
	}
	
}
