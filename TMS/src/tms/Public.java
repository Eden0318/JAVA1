package tms;
//pay():����� ���� �� �� �ִ� �޼���
	//showDestMsg(String destination) : ������ "�������� �����߽��ϴ�" �޼��� ���
	//�ڽ�Ŭ���� : ����, ����ö
	
	//VIEW
	//�̿��Ͻ� ���߱����� �����ϼ���
	//�������� ��ư���� ����(optionDialog())
	//������� �������� ���� �ʵ��� ����
	//������ �����⸸ ����
	//����ö�� ������ ����
	//����>����>����>����

public abstract class Public {
	String [] arStation= {"����","����","����","����"};
	
	abstract int pay(int money);
	abstract void showDestMsg(String destination);
	abstract void go(int btnIndex);

}
