package day20;

public class  Pfc implements Soldier {

	@Override
	public void eat() {
		System.out.println("������ ��Ȯ�ϰ� �Դ´�.");
		
	}

	@Override
	public void work() {
		System.out.println("�̵���� ���� �˷��ָ� ������ ���Ѵ�.");
		
	}

	@Override
	public void play() {
		System.out.println("�����⸦ ����ϸ� ������ ���");
		
	}

	@Override
	public void sleep() {
		System.out.println("�� �ܴ�");
		
	}

	@Override
	public void salute() {
		System.out.println("��!��!");
		
	}

}
