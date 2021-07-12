package practice;


public abstract class Shape {

	
	double area;
	//shape를 상속받은 클래스들은 전부 showArea재정의해야함(강제성)
	abstract void showArea(double w, double h);
	
	//final을 붙일 경우 사용만 할 수 있음
	final void ff() {
		System.out.println("추상클래스의 일반 메서드입니다.");
	}
	
	void f() {
		System.out.println("상수 안붙인 일반메서드 입니다.");
	}
	
}


//자식클래스
class Rect extends Shape{
	@Override
	void showArea(double w, double h) {
		System.out.println("넓이:"+w*h);
		
	}
	
}

class Tri extends Shape{

	@Override
	void showArea(double w, double h) {
		System.out.println("삼각형 넓이:"+(w*h)/2);
		
	}
	
}



