package day06;

public class Oper {
	public static void main(String[] args) {
		int money = 1_000_000_000;
		int data = 10;
		//money = money + 5000000; ���� money�� �������, ������ money�� ��
		money += 5000000; //����������
		
		//������ �� �ٿ��� �ٷ� ����
		//System.out.println(++data); //11
		
		//������ �ۼ��� �����ٺ��� ������
		System.out.println(data++);//10
		System.out.println(data);//11
		
		

	}

}
