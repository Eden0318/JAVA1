package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "♡어서오세요 CGV입니다.♡\n";
		String menuMsg = "1.예매하기\n2.구매하기\n3.나가기\n4.포인트조회\n";
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		String films = "1.라이온킹(08:00)\n2.스파이더맨(12:00)\n3.사일런스(23:00)[청소년관람불가]\n4.뒤로가기";
		int choice = 0;
		int age = 0;
		int money = 1000000;
		int point = 0;
		int t_price = 10000;
		boolean t_check; //예매완료인지 아닌지를 true, false로 나타냄
//		구매하기 : 1팝콘, 2콜라, 3맥주 , 4뒤로가기
		
		while(true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 3) break;
			// 잘못 입력했을 때 continue 
			if(!(choice>=1 && choice<=3)) continue;
			
			switch(choice) {
			case 1: //예매하기 영역
				if(money - t_price<0) {
					JOptionPane.showMessageDialog(null,"잔액이부족합니다.");
				}
				//변수의 재사용★★★★★
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1){
					JOptionPane.showMessageDialog(null, "라이온킹 예매 완료(08:00)");
				}else if(choice==2){
					JOptionPane.showMessageDialog(null, "스파이더맨 예매 완료(12:00)");
				}else if(choice ==3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19) {
					JOptionPane.showMessageDialog(null, "사일런스 예매 완료(23:00)");
					}else {
						JOptionPane.showMessageDialog(null, "다시 시도해주세요");
					}
				}else {
					t_check = false;
					JOptionPane.showMessageDialog(null, "메인메뉴로 이동합니다.");
					continue;
				}
				if(t_check) { //예매 완료 되었을 때
					if(point>0) {
						if(point - t_price >= 0) {
							point-=t_price;
						}else {
							money -= (t_price - point);
							point = 0;
						}
						
					}else {
						money -= t_price;
						point+=(int)t_price*0.5;
						
					}
					JOptionPane.showMessageDialog(null, "현재잔액:"+money+"원");
					
				}
				break;
			case 2: //구매하기 영역
				break;
			case 3: //포인트조회 영역
				JOptionPane.showMessageDialog(null, "잔여포인트 : "+point+"점");
				break;
			}
		}
		
	}
}
