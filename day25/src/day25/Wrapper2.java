package day25;

public class Wrapper2 {

	
	public static void main(String[] args) {
		//�ϳ��� �迭�� �������� �ٸ�Ÿ���� ���� �ְ� �ʹٸ� objectŸ������ �����
		//ex)1
		Object[]arData= {"1",10,20.9};
		System.out.println(arData[0]);
		System.out.println(arData[1]);
		System.out.println(arData[2]);
		
		//�̰� �� �� ���̾� , wrapping 10�� Integer�� ����
		//ex)2
		Object[]arData2= {
			new Integer(10),
			new Double(10.5),
			new String("�ȳ�")
		};
		System.out.println(arData2[0]);
		System.out.println(arData2[1]);
		System.out.println(arData2[2]);
	
		

	}
}