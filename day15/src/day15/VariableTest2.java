package day15;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.f();//1
		vt.f();//2
		vt.f();//3
		vt.f2();//20
		vt.f();//21
		vt =new VariableTest(); // static으로 선언했기때문에 초기화 안된다.
		vt.f(); //그래서 다시 1 
		
	
	
	
	
	
	
	}
}
