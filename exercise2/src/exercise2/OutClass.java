package exercise2;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("�ܺ�Ŭ���� ������ ȣ���");
	}
	
	public void showOuter() {
		System.out.println("�ܺ�Ŭ������ �޼ҵ� ȣ���");
	}//������� �ܺ�Ŭ������ �ʵ���
	
	public class InnerClass{ //outClass�� �Ҽ���
		
		int inData;
		public InnerClass() {
			System.out.println("����Ŭ������ ������ ȣ���");
		}
		public void showInner() {
			//����Ŭ������ ������ ����, �ܺ�Ŭ���� �ʵ忡 �����ϴ� ������
			outData=20;
			System.out.println("����Ŭ������ �޼ҵ� ȣ���");
			System.out.println("outData:"+outData);
			showOuter();
		}
	}
	
	
	public static void main(String[] args) {
		//innerŬ���� �������ͼ� outclass�ʵ忡 ���� �ۼ�
		//����Ŭ������ �����ϱ�
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
	}
	
}
