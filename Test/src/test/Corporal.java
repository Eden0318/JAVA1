package test;

public class Corporal implements Soldier {

	@Override
	public void eat() {
		System.out.println("�Ļ� ���ϰ� px");
		
		
	}

	@Override
	public void work() {
		
	}

	@Override
	public void play() {
		System.out.println("�Ϸ����� ���");
	}

	@Override
	public void sleep() {
		System.out.println("�Ϸ����� �ܴ�");
	}

	@Override
	public void salute() {
		System.out.println("����");
	}

}
