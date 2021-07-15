package day23;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e = new Elevator();
		Random r = new Random();
		int cnt=0; //탑승입원 수 
		int []arElevator = new int[5]; //엘리베이터정원
		int floor=0;
		String check="";
		cnt=r.nextInt(6);//인원수 랜덤으로, 0명부터 5명까지 랜덤으로
		for (int i = 0; i < cnt; i++) {
			arElevator[i]=1;
		}
	
		while(true) { //층수를 랜덤으로 돌려주는 과정
			//최대 : 10층
			//최소 : -3층
			//nextInt()는 0부터 받을 수 있다 > nextInt()로
			floor = r.nextInt(e.maxFloor+(e.minFloor*-1)+1)+e.minFloor;
			if(floor!=0)break;
		}
		if(cnt==0) {
			System.out.println("현재 탑승 완료 : 없음(최대5명)");
		}else {
			System.out.println("현재 탑승 인원 : "+cnt+"명(최대5명)");
		}
		System.out.println("Y : 타기          N : 보내기");
		check = new Scanner(System.in).next().toUpperCase();
		if(check.equals("Y")) {
			cnt++;
			//인원초과한 부분(5명타는데 내가 탑승해서 6명)
			try { 
				arElevator[cnt-1]=1;
				Elevator.floor=floor; //위 문장이 이상없이 실행될 경우
				e.go();
			} catch (Exception e1) {
				System.out.println("정원초과");
			}
		}
	}
}
