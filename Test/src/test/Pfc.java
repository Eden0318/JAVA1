package test;

public class Pfc implements Soldier{

	@Override
	public void eat() {
		System.out.println("���� ���� �Ļ縦 �ϰ� ���ӵ��� ì���");
		
	}

	@Override
	public void work() {
		System.out.println("���� ���� ��ġ�� ������� ����� ���ӵ� �ϵ� ���þ� �Ѵ�");
		
	}

	@Override
	public void play() {
		System.out.print("�������� �ð��� �� Ȱ���Ͽ� ������� �뷡���� �� �� �ִ�");
		
	}

	@Override
	public void sleep() {
		System.out.println("�ῡ �ߵ����� ��ħ 6��30�п� ���� ������");
		
	}

	@Override
	public void salute() {
		System.out.println("��!��!");
		
	}

}
