package exercise2;

public class ObjectTest2 {


	@Override
	public String toString() {
		return "안녕";
	}

	public static void main(String[] args) {
		ObjectTest2 o = new ObjectTest2();
		//객체명 출력 할 때 항상 뒤에 toString()생략됨 
		//일반타입x, 클래스타입일때만 뒤에 생략임
		System.out.println(o.toString());
	}

}
