package practice;

import javax.swing.JOptionPane;

public class myTest {
	public static void main(String[] args) {
		String helloMsg = "��������� CGV�Դϴ�.��\n";
		String menuMsg = "1.�����ϱ�\n2.�����ϱ�\n3.������\n4.����Ʈ��ȸ\n";
		String films = "1.���̿�ŷ(08:00)\n2.�����̴���(12:00)\n3.���Ϸ���(23:00)[û�ҳ�����Ұ�]\n4.�ڷΰ���";
		String ageMsg = "[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���\n";
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
			
			case 1: //�����ϱ�
				if(money - t_price<0) {
					JOptionPane.showMessageDialog(null,"�ܾ��� �����մϴ�");
				}
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1) {
					JOptionPane.showMessageDialog(null, "���̿�ŷ ���� �Ϸ�");
				}else if(choice == 2){
					JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�");
				}else if(choice == 3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19) {
						JOptionPane.showMessageDialog(null, "���̾� ���� �Ϸ�");
					}else {
					JOptionPane.showMessageDialog(null,"���źҰ�");
					}
				}else {
					t_check = false;
					JOptionPane.showMessageDialog(null, "���θ޴��� �̵��մϴ�.");
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
					JOptionPane.showMessageDialog(null, "�����ܾ�:"+money+"��");
					}
				break;
			case 2: //�����ϱ� ����
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "�ܿ�����Ʈ : "+point+"��");
				break;

			}
		}
	}
}

//boolean type�� �� ���� : money-t_price�� ��ȭ���� �ۼ����ֱ� ��ȿ�����̶�.