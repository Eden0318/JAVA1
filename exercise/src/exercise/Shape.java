package exercise;

public abstract class Shape {
	double area;
	
	abstract void showArea(double w, double h);
	
	void function() {
		System.out.println("추상클래스의 일반 메서드입니다.");
	}
}

class Tri extends Shape{
	
	
	@Override
	void showArea(double w, double h) {
		area=w*h;
		System.out.println(area);
	}
	
}
