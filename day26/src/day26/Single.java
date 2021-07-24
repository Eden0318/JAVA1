package day26;

public class Single {
	
	//private���� �� ���� �ۿ��� ��ü���� ���� ����� ��
	private Single() {
		
	}
	
	//�ȿ��� ��üȭ
	private static Single instance = new Single();
	
	public static Single getInstance() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("�ȳ�");
	}
}
