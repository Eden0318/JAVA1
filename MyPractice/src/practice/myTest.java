package practice;

import javax.swing.JOptionPane;

public class myTest {
	public static void main(String[] args) {
		String helloMsg = "♥어서오세요 CGV입니다.♥\n";
		String menuMsg = "1.예매하기\n2.구매하기\n3.나가기\n4.포인트조회\n";
		String films = "1.라이온킹(08:00)\n2.스파이더맨(12:00)\n3.사일런스(23:00)[청소년관람불가]\n4.뒤로가기";
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		int choice = 0;
		int point = 0;
		int age = 0;
		int money = 1000000;
		int t_price = 10000;
		boolean t_check;
		
		while(true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 3) break;
			if(!(choice>=1 && choice<=3)) continue;
			
			switch(choice) {
			
			case 1: //예매하기
				if(money - t_price<0) {
					JOptionPane.showMessageDialog(null,"잔액이 부족합니다");
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1) {
					JOptionPane.showMessageDialog(null, "라이온킹 예매 완료");
				}else if(choice == 2){
					JOptionPane.showMessageDialog(null, "스파이더맨 예매 완료");
				}else if(choice == 3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19) {
						JOptionPane.showMessageDialog(null, "사이언스 예매 완료");
					}else {
					JOptionPane.showMessageDialog(null,"예매불가");
					}
				}else {
					t_check = false;
					JOptionPane.showMessageDialog(null, "메인메뉴로 이동합니다.");
					continue;
				}
				if(t_check) {
					if(point>0) {
						if(point>=t_price) {
							point-=t_price;
						}else {
							money-=(t_price-point);
							point=0;
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
			case 3:
				JOptionPane.showMessageDialog(null, "잔여포인트 : "+point+"점");
				break;

			}
		}
	}
}

//boolean type을 쓴 이유 : money-t_price를 영화마다 작성해주기 비효율적이라서.