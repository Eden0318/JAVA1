package day23;

public abstract class Lift {
	
	//인터페이스가 아닌 추상클래스 작성 이유
	//: 층수는 내가 수정 할 수도 있어서 , 인터페이스는 층수 수정 불가
	
	//프로그램이 종료 될 때만 초기화 - static, floor-현재층수 
	static int floor=0;
	
	//전부 실행할 함수이기 때문에 return할 것이 없다
	abstract void up();
	abstract void down();
	abstract void start(int choice);
	abstract void stop();
	abstract void go();
}
