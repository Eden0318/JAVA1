package day23;

public abstract class Lift {
	
	//�������̽��� �ƴ� �߻�Ŭ���� �ۼ� ����
	//: ������ ���� ���� �� ���� �־ , �������̽��� ���� ���� �Ұ�
	
	//���α׷��� ���� �� ���� �ʱ�ȭ - static, floor-�������� 
	static int floor=0;
	
	//���� ������ �Լ��̱� ������ return�� ���� ����
	abstract void up();
	abstract void down();
	abstract void start(int choice);
	abstract void stop();
	abstract void go();
}
