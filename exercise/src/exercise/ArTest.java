package exercise;

import java.util.Scanner;

public class ArTest {
	//1동
	//1호 2호 3호
	//평균월세, 총월세 구하기
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		double avg=0.0;
		int []ho = new int[3];
		for (int i = 0; i < ho.length; i++) {
			System.out.println(i+1+"호의 월세를 입력하세요 (단위 : 만원)");
			ho[i] = sc.nextInt();
			sum+=ho[i];
			
		}
		System.out.println("총 월세:"+sum);
		avg=Double.parseDouble(String.format("%.2f", (double)sum/ho.length));
		System.out.println("총 평균:"+avg);
	}
}
