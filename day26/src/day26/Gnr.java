package day26;

public class Gnr {
	public static void main(String[] args) {
		
		//<>�ȿ� wrapper Ŭ������ �� �� �ִ�
		GTest <String> g =new GTest<>();
		GTest <Integer> g2 =new GTest<>();
		
		//g.setData(10); �Ұ���
		g.setData("�ȳ�");
		
		g2.setData(new Integer(10));
		g2.setData(10);
		System.out.println(g.getData());
		System.out.println(g2.getData());
		
		
		
	}

}
