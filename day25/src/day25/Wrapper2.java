package day25;

public class Wrapper2 {

	
	public static void main(String[] args) {
		//�ϳ��� �迭�� �������� �ٸ�Ÿ���� ���� �ְ� �ʹٸ� objectŸ������ �����
		
		Object[]arData= {"1",10,20};
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		
		//�̰� �� �� ���̾�
		Object[]arData2= {
			new Integer(10),
			new Double(10.5),
			new String("�ȳ�")
		};
		
		
	}

}
