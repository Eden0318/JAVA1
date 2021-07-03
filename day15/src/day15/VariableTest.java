package day15;

public class VariableTest {
	//전역변수, 모든영역에서 사용가능
	
	static int data = 0;
	
	void f() {
	System.out.println(++data);
	}
	
	void f2() {
		data=20;
	}
}
