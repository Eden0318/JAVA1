package exercise2;

public class ObjectTest {
	public static void main(String[] args) {
		//constant pool : ������� ������ Ǯ
//		String str1 = "data";
//		String str2 = "data";
//		String str3 = new String("data");
//		String str4 = new String("data");
//		
//		System.out.println(str1 == str2);
		
		
		//intern(): constant pool�� ���� ���� �˻�!!
		//System.out.println(str3.intern()==str4.intern());
		//�׷��� �ּҴ� �ٸ����� intern�� ���� ���� �˻��߱⿡ true����
		
		//�ּҴ� �ٸ�
		//System.out.println(str3==str4);
		
		String[]arStr= {
				new String("data1"),
				new String("data2"),
				new String("data3"),
		};
		
		//���� �ּҰ� �� -> �翬�� false
		System.out.println(arStr[0] == "data1"); 
		
		//�� ��
		System.out.println(arStr[0].equals("data1")); 
		
		
		
	}

}
