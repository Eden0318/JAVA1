package tms;

import java.util.Random;

import javax.swing.JOptionPane;

public class Bus extends Public {
	int fee=1200;
	
	@Override
	int pay(int money) {
		money-=fee;
		return money;
	}

	@Override
	void showDestMsg(String destination) {
		System.out.println(destination+"�� �����߽��ϴ�");
		
	}

	@Override
	void go(int btnIndex, int money) {
		//������� �������� ������ Ȯ�����ְ�
		//���������� ������������ �����ؼ� for���� ���ƾ��Ѵ�.
		//btnIndex : ������
		//Index : �����
		int cnt = 0;
		int index=0;
		String result = "";
		Random r = new Random();
		while(true) {
			index = r.nextInt(arStation.length);
			if(btnIndex>index)break;

		}
		cnt=btnIndex-index;
		
		if(money-fee<0) {
			result="�ܾ׺���";
		}else {
			
		}
		
		//btnIndex : 3
		//index: 2
		//������ : ���� ������ ���������� �������� �߻��� index(�����)�� �� �۾ƾ���
		
		pay(money);
		for (int i = 0; i <cnt; i++) {
			 
		}
		
	}
}