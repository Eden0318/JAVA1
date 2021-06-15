package day06;

public class Oper {
	public static void main(String[] args) {
		int money = 1_000_000_000;
		int data = 10;
		//money = money + 5000000; 왼쪽 money는 저장공간, 오른쪽 money는 값
		money += 5000000; //누적연산자
		
		//전위형 그 줄에서 바로 증가
		//System.out.println(++data); //11
		
		//후위형 작성한 다음줄부터 증가됨
		System.out.println(data++);//10
		System.out.println(data);//11
		
		

	}

}
