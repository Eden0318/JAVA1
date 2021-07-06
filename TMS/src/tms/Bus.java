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
		System.out.println(destination+"에 도착했습니다");
		
	}

	@Override
	void go(int btnIndex, int money) {
		//출발지와 도착지가 같은지 확인해주고
		//정방향인지 역방향인지를 생각해서 for문을 돌아야한다.
		//btnIndex : 도착지
		//Index : 출발지
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
			result="잔액부족";
		}else {
			
		}
		
		//btnIndex : 3
		//index: 2
		//정방향 : 내가 선택한 도착지보다 랜덤으로 발생된 index(출발지)가 더 작아야함
		
		pay(money);
		for (int i = 0; i <cnt; i++) {
			 
		}
		
	}
}