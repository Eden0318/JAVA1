package exercise;

import java.util.Scanner;

/*
 * ZARA
 * 강남점, 코엑스점, 명동점
 * 평균매출액, 총매출액 (단위:백만원)
 * 단 평균 매출액은 만원단위까지(소수점 둘째자리까지)
 */

public class ArShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String []arShop =  {"강남점","코엑스점","명동점"};
		int [] arIncome = new int[3];
		int sum=0;
		int cnt=0;
		double avg=0.0;
		String best="없음";
		
		for (int i = 0; i < arIncome.length; i++) {
			System.out.println(arShop[i]+"의 월 매출액을 입력하세요 (단위 : 백만원)");
			arIncome[i]=sc.nextInt();
			sum+=arIncome[i];
			
		}
		avg=Double.parseDouble(String.format("%.2f",(double)sum/arShop.length));
		System.out.println("총 매출액"+sum);
		System.out.println("평균 매출액"+avg);
		
		
		for (int i = 0; i < arIncome.length; i++) {
			if(arIncome[i]>avg) {
				cnt++;
				if(cnt==1) best="";
				best=arShop[i]+"\n";
			}
			
		}
		System.out.println("★인센티브매장★:\n"+best);
		
	}

}
