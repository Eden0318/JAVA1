package day22;

public interface Cafe {
	//�޴���
	//�Ǹ�
	//�Ʒ� ���� abstract ������. �߻�޼�����
	void setMenu(String []menu);
	String []getMenu();
	void sell(String choice);
}
