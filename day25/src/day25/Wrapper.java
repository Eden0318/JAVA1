package day25;

public class Wrapper {
	public static void main(String[] args) {
		
		String str=new String("1");
		String str2="1"; //����ڽ� (�ڽ�==wrapping)
			
		Integer data=10; //����ڽ�
		//int��� �Ϲ� Ÿ�Կ� Ŭ����Ÿ��data�� ����->��ڽ�
		int data2=data;
		System.out.println(data2);
	}
}
