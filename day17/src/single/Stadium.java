package single;

public class Stadium {
	public static void main(String[] args) {
		//�����ڸ� ���� �� ����, Ŭ������ ���� �����Ѵ�.
		//���̾���� ���� �Ѹ�
		IronMan.fight();
		//���࿡ ��ü�� ���� �ϳ� ���� �ʹٸ�, 
		//new�������� getInstance�� �̿��ؼ� �̹� ���������� ��
		//
		IronMan i = IronMan.getInstance();
		i.walk();
	}
}
