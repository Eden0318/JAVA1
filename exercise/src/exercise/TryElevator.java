package exercise;

import java.util.Scanner;

public class TryElevator extends TryLift{
	

	final int maxFloor=10;
	final int minFloor=-3;
	
	@Override
	void up() {
		floor++;
		
	}
	@Override
	void down() {
		floor--;
		
	}
	@Override
	void start(int choice) {
		if(choice<floor) {
			for(int i=0; i<floor-choice;i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
				}
				down();
			}
		}else if(choice!=floor) {
			for(int i=0; i<choice-floor+i;i++) {
				if(floor!=0) {
					System.out.println(floor+"��");
				}
				up();
			}
		}
	}
	
	
	@Override
	void stop() {
		System.out.println("����");
		
	}
	@Override
	void go() {
		int choice=0;
		String msg="";
		while(true) {
			msg = "������ �Է��ϼ���(������:"+floor+"��)";
			System.out.println(msg);
			choice=new Scanner(System.in).nextInt();
			if(choice>maxFloor || choice<minFloor) {
				System.out.println("B3������ 10�������� �����մϴ�");
			}else {
				break;
			}
			start(choice);
		}
		
	}

}
