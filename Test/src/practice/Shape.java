package practice;


public abstract class Shape {

	
	double area;
	//shape�� ��ӹ��� Ŭ�������� ���� showArea�������ؾ���(������)
	abstract void showArea(double w, double h);
	
	//final�� ���� ��� ��븸 �� �� ����
	final void ff() {
		System.out.println("�߻�Ŭ������ �Ϲ� �޼����Դϴ�.");
	}
	
	void f() {
		System.out.println("��� �Ⱥ��� �Ϲݸ޼��� �Դϴ�.");
	}
	
}


//�ڽ�Ŭ����
class Rect extends Shape{
	@Override
	void showArea(double w, double h) {
		System.out.println("����:"+w*h);
		
	}
	
}

class Tri extends Shape{

	@Override
	void showArea(double w, double h) {
		System.out.println("�ﰢ�� ����:"+(w*h)/2);
		
	}
	
}



