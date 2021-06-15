package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "♡어서오세요 CGV입니다.♡\n";
		String menuMsg = "1.예매하기\n2.구매하기\n3.나가기\n";
		String ageMsg = "[청소년 구매 불가 상품]\n나이를 입력하세요\n";
		String films = "1.라이온킹(08:00)\n2.스파이더맨(12:00)\n3.사일런스(23:00)[청소년관람불가]\n4.뒤로가기";
		int choice = 0;
		int age = 0;
		int money = 1000000;
		int point = 0;
		int t_price = 10000;
		boolean t_check = true;
		
		
		while(true) {
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 3) break;
			// 잘못 입력했을 때 continue
			if(!(choice==1 || choice==2)) continue;
			
			switch(choice) {
			case 1:
				if(money - t_price<0) {
					JOptionPane.showMessageDialog(null,"잔액이부족합니다.");
				}
				//변수의 재사용
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1){
					money-=t_price;
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
					JOptionPane.showInputDialog(null, "메인메뉴로 이동합니다.");
					continue;
				}
				if(t_check) {
					money -= t_price;	
					JOptionPane.showMessageDialog(null, "현재잔액:"+money+"원");
				}
				
				break;
			case 2:
				break;
			}
		}
		
		
	}
}
