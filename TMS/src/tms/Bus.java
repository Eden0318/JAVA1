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
		System.out.println(destination+"에 도착했습니다");
		
	}

	@Override
	void go(int btnIndex) {
		//출발지와 도착지가 같은지 확인해주고
		//정방향인지 역방향인지를 생각해서 for문을 돌아야한다.
		Random r = new Random();
		while(true) {
			int index = r.nextInt(arStation.length);
			if(!arStation[btnIndex].equals(arStation[index]))break;
			
			
		}
		
		
		
	}
}