package day20;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("���ϰ� �Դ´�");

	}

	@Override
	public void work() {
		System.out.println("å�Ӱ��� ������ �Ѵ�.");

	}

	@Override
	public void play() {
		System.out.println("��� Ȱ���� �����.");

	}

	@Override
	public void sleep() {
		System.out.println("�� �ܴ�");

	}

	@Override
	public void salute() {
		System.out.println("����");
	}

}
