package exercise;

public class Student implements People {

	@Override
	public void eat() {
		System.out.println("�޽��� �Դ´�");

	}

	@Override
	public void work() {
		System.out.println("�н������� �˹ٸ� �Ѵ�");

	}

	@Override
	public void study() {
		System.out.println("�ð�ǥ�� ���� ���θ� �Ѵ�");

	}

	@Override
	public void goToSchool() {
		System.out.println("7�ñ��� ��� �Ͽ� ��ħ �ڽ��� �Ѵ�");

	}

}
