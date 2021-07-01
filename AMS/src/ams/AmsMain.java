package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		
		
		AmsField af = new AmsField();
		ImageIcon img = new ImageIcon("src/img/airplane.gif");
		String []arPlane = new String[5];
		String insertMsg = "[추가하실 정보를 그대로 입력하세요(,포함)]\n"
				+ "항공사, 항공기번호, 최대승객수(명), 출발지, 도착지";
		//절대경로 : 내 위치가 어디든지 찾아갈 수 있는 경로
		//상대경로 : 내 위치에 따라서 변경되는 경로
		String []menu = {"추가하기","검색하기","수정하기","삭제하기","목록보기"};
		int choice = 0;
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS",JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, img, menu, null); //메서드, 리턴값은 int임
			
			if (choice == -1) break;
			
			switch(choice) { //버튼이기 때문에 default없어도 됨
			//추가하기 영역
			case 0:
			arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
			af.insert(arPlane);	
				break;
			//검색하기 영역	
			case 1:
				break;
			//수정하기 영역
			case 2:
				break;
			//삭제하기 영역
			case 3:
				break;
			//목록보기 영역
			case 4:
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
		}
		
		
	
	}
}
