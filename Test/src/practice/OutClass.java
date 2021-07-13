package practice;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("외부 클래스 생성자 호출 됨");
	}
	
	public void showOuter() {
		System.out.println("외부 클래스의 메서드 호출 됨");
	}
	
	//outclass소속임, 필드로 간주되어 public접근권한제어자 붙을수있음
	public class InnerClass{
		
		int inData;
		
		public InnerClass() {
			System.out.println("내부클래스의 생성자 호출됨");
		}
		
		public void showInner() {
			//내부에서 외부에 접근하는 과정
			
			outData = 20;//내부에서 외부의 필드 값 변경
			System.out.println("내부클래스의 메서드 호출됨");
			System.out.println("outData:"+outData);
			showOuter();
		}
	}
	
	public static void main(String[] args) {
		//내부클래스에 접근
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
		 
	}

}
