package exercise2;

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("외부클래스 생성자 호출됨");
	}
	
	public void showOuter() {
		System.out.println("외부클래스의 메소드 호출됨");
	}//여기까지 외부클래스의 필드임
	
	public class InnerClass{ //outClass의 소속임
		
		int inData;
		public InnerClass() {
			System.out.println("내부클래스의 생성자 호출됨");
		}
		public void showInner() {
			//내부클래스를 선언한 다음, 외부클래스 필드에 접근하는 과정임
			outData=20;
			System.out.println("내부클래스의 메소드 호출됨");
			System.out.println("outData:"+outData);
			showOuter();
		}
	}
	
	
	public static void main(String[] args) {
		//inner클래스 빠져나와서 outclass필드에 메인 작성
		//내부클래스에 접근하기
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
	}
	
}
