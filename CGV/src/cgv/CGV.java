package cgv;

import javax.swing.JOptionPane;

public class CGV {
	public static void main(String[] args) {
		String helloMsg = "��������� CGV�Դϴ�.��\n";
		String menuMsg = "1.�����ϱ�\n2.�����ϱ�\n3.������\n4.����Ʈ��ȸ\n";
		String ageMsg = "[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���\n";
		String films = "1.���̿�ŷ(08:00)\n2.�����̴���(12:00)\n3.���Ϸ���(23:00)[û�ҳ�����Ұ�]\n4.�ڷΰ���";
		int choice = 0;
		int age = 0;
		int money = 1000000;
		int point = 0;
		int t_price = 10000;
		boolean t_check; //���ſϷ����� �ƴ����� true, false�� ��Ÿ��
//		�����ϱ� : 1����, 2�ݶ�, 3���� , 4�ڷΰ���
		
		while(true) {
			t_check = true;
			choice = Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
			if(choice == 3) break;
			// �߸� �Է����� �� continue 
			if(!(choice>=1 && choice<=3)) continue;
			
			switch(choice) {
			case 1: //�����ϱ� ����
				if(money - t_price<0) {
					JOptionPane.showMessageDialog(null,"�ܾ��̺����մϴ�.");
				}
				//������ ����ڡڡڡڡ�
				choice = Integer.parseInt(JOptionPane.showInputDialog(films));
				if(choice == 1){
					JOptionPane.showMessageDialog(null, "���̿�ŷ ���� �Ϸ�(08:00)");
				}else if(choice==2){
					JOptionPane.showMessageDialog(null, "�����̴��� ���� �Ϸ�(12:00)");
				}else if(choice ==3) {
					age = Integer.parseInt(JOptionPane.showInputDialog(ageMsg));
					if(age>19) {
					JOptionPane.showMessageDialog(null, "���Ϸ��� ���� �Ϸ�(23:00)");
					}else {
						JOptionPane.showMessageDialog(null, "�ٽ� �õ����ּ���");
					}
				}else {
					t_check = false;
					JOptionPane.showMessageDialog(null, "���θ޴��� �̵��մϴ�.");
					continue;
				}
				if(t_check) { //���� �Ϸ� �Ǿ��� ��
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
					JOptionPane.showMessageDialog(null, "�����ܾ�:"+money+"��");
					
				}
				break;
			case 2: //�����ϱ� ����
				break;
			case 3: //����Ʈ��ȸ ����
				JOptionPane.showMessageDialog(null, "�ܿ�����Ʈ : "+point+"��");
				break;
			}
		}
		
	}
}
