package tms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Bus extends Public {
	int fee=1200;
	
	@Override
	int pay(int money) {
		if(money-fee<0) {
			
		}else {
			money-=fee;
		}
		return money;
		
	}

	@Override
	void showDestMsg(String destination) {
		System.out.println(destination+"�� �����߽��ϴ�");
		
	}

	@Override
	void go(int btnIndex) {
		//������� �������� ������ Ȯ�����ְ�
		//���������� ������������ �����ؼ� for���� ���ƾ��Ѵ�.
		Random r = new Random();
		while(true) {
			int index = r.nextInt(arStation.length);
			if(!arStation[btnIndex].equals(arStation[index]))break;
			
			
		}
		
		
		
	}
}