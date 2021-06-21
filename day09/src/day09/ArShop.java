package day09;

import java.util.Scanner;

public class ArShop {
	//ZARA
	//강남점, 코엑스점, 명동점
	//단위는 100만원 단위로 입력받는다.
	//단, 평균 매출액은 만원단위까지 출력한다.
	public static void main(String[] args) {
		
		int [] arIncome = new int[3];
		String []arName = {"강남점","코엑스점","명동점"};
		Scanner sc = new Scanner(System.in);
		double avg = 0.0;
		int sum = 0;
		int cnt=0;
		String best="없음"; //없음이라고 초기화 하는 이유는 인센티브 매장이 없을때 "없음"이라고 나와야 하기 때문
		
		for(int i=0;i<arIncome.length;i++) {
			System.out.println(arName[i]+"매출액을 입력하세요(단위 : 백만원)");
			arIncome[i] = sc.nextInt();
			sum+=arIncome[i];
		}
		avg=Double.parseDouble(String.format("%.2f",(double)sum/arIncome.length));
		System.out.println("ZARA 총 매출액 : "+sum+"백만원");
		System.out.println("평균 매출액 : "+avg+"만원");
		
		for(int i=0; i<arIncome.length;i++) {
			if(arIncome[i]>avg) {
				cnt++;
				if(cnt == 1) {
					best="";// 인센티브 매장있을 때 앞에 "없음" 초기화시킴
				}
				best += arName[i]+"\n";
			}
		}
		
	System.out.println("★인센티브 매장★\n"+best);
	
	}

}
