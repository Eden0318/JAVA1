package practice;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ�� ��");
	}
	
	public void showOuter() {
		System.out.println("�ܺ� Ŭ������ �޼��� ȣ�� ��");
	}
	
	//outclass�Ҽ���, �ʵ�� ���ֵǾ� public���ٱ��������� ����������
	public class InnerClass{
		
		int inData;
		
		public InnerClass() {
			System.out.println("����Ŭ������ ������ ȣ���");
		}
		
		public void showInner() {
			//���ο��� �ܺο� �����ϴ� ����
			
			outData = 20;//���ο��� �ܺ��� �ʵ� �� ����
			System.out.println("����Ŭ������ �޼��� ȣ���");
			System.out.println("outData:"+outData);
			showOuter();
		}
	}
	
	public static void main(String[] args) {
		//����Ŭ������ ����
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
		 
	}

}
