package day25;

public class Wrapper {
	public static void main(String[] args) {
		//���� �ڹٿ����� ������ �̷��� �ۼ��߾��� jdk1.5���� ��
		//String str=new String("1");
		
		//����ڽ�, ū��(Integer)���� ������(int 10)�� ���Ѵ�	
		Integer data=10; 
		//int��� �Ϲ� Ÿ�Կ� Ŭ����Ÿ�� Integer�� ����->�����ڽ�
		int data2=data;
		
		System.out.println(data2);
	}
}
