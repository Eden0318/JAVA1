package exercise;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
	
	void function() {
		System.out.println("�߻�Ŭ������ �Ϲ� �޼����Դϴ�.");
	}
}

class Tri extends Shape{
	
	
	@Override
	void showArea(double w, double h) {
		area=w*h;
		System.out.println(area);
	}
	
}
