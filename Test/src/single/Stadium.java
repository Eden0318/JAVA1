package single;

public class Stadium {
	public static void main(String[] args) {
		//IronMan i = new IronMan(); private�̶� �Ұ���
		//Ŭ������ ���� ����(static���� ������ �͸� Ŭ������ ���� ���� ����)
		IronMan.fight();
		//IronMan.walk(); walk�� static���� ������ ���� �ƴϱ� ������ �������� �Ұ���
		
		IronMan i = IronMan.getInstance();
		i.fight();//Ŭ������ ���� ����
		i.walk();
		
	
		
	}
}
