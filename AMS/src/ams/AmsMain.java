package ams;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AmsMain {
	public static void main(String[] args) {
		
		
		AmsField af = new AmsField();
		ImageIcon img = new ImageIcon("src/img/airplane.gif");
		String []arPlane = new String[5];
		String insertMsg = "[�߰��Ͻ� ������ �״�� �Է��ϼ���(,����)]\n"
				+ "�װ���, �װ����ȣ, �ִ�°���(��), �����, ������";
		//������ : �� ��ġ�� ������ ã�ư� �� �ִ� ���
		//����� : �� ��ġ�� ���� ����Ǵ� ���
		String []menu = {"�߰��ϱ�","�˻��ϱ�","�����ϱ�","�����ϱ�","��Ϻ���"};
		int choice = 0;
		
		while(true) {
			choice = JOptionPane.showOptionDialog(null, "", "AMS",JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, img, menu, null); //�޼���, ���ϰ��� int��
			
			if (choice == -1) break;
			
			switch(choice) { //��ư�̱� ������ default��� ��
			//�߰��ϱ� ����
			case 0:
			arPlane = JOptionPane.showInputDialog(insertMsg).split(", ");
			af.insert(arPlane);	
				break;
			//�˻��ϱ� ����	
			case 1:
				break;
			//�����ϱ� ����
			case 2:
				break;
			//�����ϱ� ����
			case 3:
				break;
			//��Ϻ��� ����
			case 4:
				JOptionPane.showMessageDialog(null, af.show());
				break;
			}
		}
		
		
	
	}
}
